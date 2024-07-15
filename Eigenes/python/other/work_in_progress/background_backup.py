# Script that runs in the background and does backups.
# A watchdog should listen for changed files being saved in the source folder
# Backup Plan:
# Mon - Thu: iterative backup of every file saved in a daily folder
# Fri: full backup of source folder in a seperate folder
# Keep all folders for the current week, delete all but Fri of the week before
# last Fri of the month only keep the last Fri


import os
import shutil
import datetime
import time
import schedule
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
from watchdog.events import FileSystemEvent

#Define source and backup folders
SOURCE_FOLDER = r"D:\Ausbildung"
BACKUP_FOLDER = r"H:\test_backup"

#Define backup schedule
DAILY_BACKUP_DAYS = [0, 1, 2, 3, 4] #Mon - Fri
FULL_BACKUP_DAY = 4 #Fri
DAILY_BACKUP_FOLDER = "daily"
WEEKLY_BACKUP_FOLDER = "weekly"
MONTHLY_BACKUP_FOLDER = "monthly"

#Define counter variables for copied files and raised errors
copied_files: int = 0
errors: int = 0
permission_errors: int = 0


#Run the observer
def run_observer():
    """
    Starts the watchdog observer to monitor the source folder.
    """
    event_handler = Handler()
    observer = Observer()
    observer.schedule(event_handler, SOURCE_FOLDER, recursive=True)
    observer.start()
    try:
        while True:
            time.sleep(1)
    except KeyboardInterrupt:
        observer.stop()
    observer.join()

#Define the handler class for the watchdog
class Handler(FileSystemEventHandler):
    """
    Handles file system events and triggers backups based on the schedule.
    """
    def on_modified(self, event: FileSystemEvent):
        """
        Handles file modification events.
        """
        #Get current day of the week
        day_of_week = datetime.datetime.now().weekday()
        #Check if it's a daily backup day
        if day_of_week in DAILY_BACKUP_DAYS:
            daily_backup(event)
        
#Daily real time backup of changed files
def daily_backup(event: FileSystemEvent):
    """
    Performs a daily backup of modified files.
    """
    global copied_files
    global errors
    global permission_errors
    #Get current date and time
    now = datetime.datetime.now()
    #Create daily backup folder
    daily_backup_folder = os.path.join(BACKUP_FOLDER, DAILY_BACKUP_FOLDER, now.strftime("%Y-%m-%d"))
    if not os.path.exists(daily_backup_folder):
        os.makedirs(daily_backup_folder)
    #Get relative path of the modified file
    relative_path = os.path.relpath(event.src_path, SOURCE_FOLDER)
    #Create the corresponding path in the daily backup folder
    backup_path = os.path.join(daily_backup_folder, relative_path)
    if not os.path.exists(backup_path):
        os.makedirs(backup_path)
    #Copy the modified file to the daily backup folder
    try:
        if not event.src_path.endswith(".tmp"): #exclude .tmp files from backup
            shutil.copy2(event.src_path, backup_path)
            copied_files += 1
            print(f"{now.strftime('%H:%M:%S %Y-%m-%d ')} File {event.src_path} backed up to {backup_path}")
            print(f"Copied {copied_files} files")
            print(f"Raised PermissionErrors: {permission_errors}")
            print(f"Raised other errors: {errors}")
    #Error handling, ignore PermissionError for now to easier find other Error messages
    except PermissionError:
        permission_errors += 1
        pass
    except Exception as e:
        errors += 1
        print(f"{now.strftime('%H:%M:%S %Y-%m-%d ')} Error backing up file {event.src_path}: {e}")


#Full backup of the source folder
def full_backup():
    """
    Performs a full backup of the source folder.
    """
    #Get current date and time
    now = datetime.datetime.now()
    #Create full backup folder
    full_backup_folder = os.path.join(BACKUP_FOLDER, WEEKLY_BACKUP_FOLDER, now.strftime("%Y-%m-%d"))
    if not os.path.exists(full_backup_folder):
        os.makedirs(full_backup_folder)
    #Copy the entire source folder to the full backup folder
    print("Running weekly backup...")
    shutil.copytree(SOURCE_FOLDER, full_backup_folder)
    print(f"Full backup of {SOURCE_FOLDER} saved to {full_backup_folder}")

#Weekly backup cleanup
def weekly_cleanup():
    """
    Cleans up weekly backup folders.
    """
    #Get current date and time
    now = datetime.datetime.now()
    #Get last week's backup folder
    last_week_folder = os.path.join(BACKUP_FOLDER, WEEKLY_BACKUP_FOLDER, now.strftime("%Y-%m-%d"))
    #Delete all folders from last week except for Friday's backup
    for folder in os.listdir(last_week_folder):
        if folder != now.strftime("%Y-%m-%d"):
            shutil.rmtree(os.path.join(last_week_folder, folder))
    print(f"Weekly backup cleanup completed.")

#Monthly backup cleanup
def monthly_cleanup():
    """
    Cleans up monthly backup folders.
    """
    #Get current date and time
    now = datetime.datetime.now()
    #Get last month's backup folder
    last_month_folder = os.path.join(BACKUP_FOLDER, MONTHLY_BACKUP_FOLDER, now.strftime("%Y-%m"))
    #Delete all folders from last month except for the last Friday's backup
    for folder in os.listdir(last_month_folder):
        if folder != now.strftime("%Y-%m-%d"):
            shutil.rmtree(os.path.join(last_month_folder, folder))
    print(f"Monthly backup cleanup completed.")

#Main function to run the backup script
if __name__ == "__main__":
    #Run the observer
    run_observer()
    #Run weekly backup and cleanups using a schedule
    schedule.every().friday.at("11:00").do(full_backup)
    schedule.every().friday.at("10:05").do(weekly_cleanup)
    schedule.every().month.at("10:15").do(monthly_cleanup)
    while True:
        schedule.run_pending()
        time.sleep(1)