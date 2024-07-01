# Script that runs in the background and does backups.
# A watchdog should listen for files being saved in the source folder
# Backup Plan:
# Mon - Thu: iterative backup of every file saved in a daily folder
# Fri: full backup of source folder in a seperate folder
# Keep all folders for the current week, delete all but Fri of the week before
# last Fri of the month only keep the last Fri

import os
import time
import datetime
import watchdog.observers
from watchdog.events import FileSystemEventHandler

# Define source and backup folder
source_folder: str = "/put/source/folder/here"
backup_folder: str = "/put/backup/folder/here"

# Define backup schedule
backup_schedule: dict = {
    0: "daily", #Monday
    1: "daily", #Tuesday
    2: "daily", #Wednesday
    3: "daily", #Thursday
    4: "daily", #Friday
    5: "daily", #Saturday
    6: "daily", #Sunday
}

# Define backup retention policy
retention_policy: dict = {
    "daily": 7, #keep daily backups 7 days
    "full": 4, #keep weekly full backups 4 weeks
    "monthly": 12, #keep monthly backups 12 months
}

class BackupHandler(FileSystemEventHandler):
    def on_modified(self, event):
        if event.is_directory:
            return None
        
        # Get current day and backup type
        today = datetime.date.today()
        backup_type = backup_schedule[today.weekday()]

        # Create backup folder for the day
        backup_path = os.path.join(backup_folder, today.strftime("%Y-%m-%d"))
        os.makedirs(backup_path, exist_ok=True)

        # Perform backup based on schedule
        if backup_type == "daily":
            # Copy modified files to daily folder
            source_file = event.src_path
            backup_file = os.path.join(backup_path, os.path.basename(source_file))
            os.copy(source_file, backup_file)
        elif backup_type == "full":
            # Copy all files to full backup folder
            full_backup_path = os.path.join(backup_folder, "full_backups", today.strftime("%Y-%m-%d"))
            os.makedirs(full_backup_path, exist_ok=True)
            for root, _, files in os.walk(source_folder):
                for file in files:
                    source_file = os.path.join(root, file)
                    backup_file = os.path.join(full_backup_path, os.relpath(source_file, source_folder))
                    os.makedirs(os.path.dirname(backup_file), exist_ok=True)
                    os.copy(source_file, backup_file)

        # Clean up old backups
        self.cleanup_backups()

    def cleanup_backups(self):
        for backup_type in ["daily", "full", "monthly"]:
            backup_dir = os.path.join(backup_folder, backup_type)
            for folder in os.listdir(backup_dir):
                folder_path = os.path.join(backup_dir, folder)
                if os.path.isdir(folder_path):
                    folder_date = datetime.datetime.strptime(folder, "%Y-%m-%d").date()
                    if (datetime.date.today() - folder_date).days > retention_policy[backup_type]:
                        os.rmdir(folder_path)

if __name__ == "__main__":
    # Create watchdog observer
    event_handler = BackupHandler()
    observer = watchdog.observers.Observer()
    observer.schedule(event_handler, source_folder, recursive=True)

    # Start the observer
    observer.start()

    # Keep the script running
    try:
        while True:
            time.sleep(1)
    except KeyboardInterrupt:
        observer.stop()

        observer.join()                        