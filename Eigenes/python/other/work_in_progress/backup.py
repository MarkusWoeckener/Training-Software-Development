# Script to create a backup of a selectable souce directory to a target directory
# Only copy files that were changed or don't exist in the backup dir (done)
# The script should get a simple, modern GUI to:
# Select source and target directory: wip, basic functionality done but to be improved
# Create a schedule (optional): tabled for now
# Display a progress bar (optional)

import os
import shutil
import hashlib
import time #for later schedule implementation
import schedule #for later schedule implementation
import tkinter as tk
from tkinter import filedialog
from tkinter import ttk


def create_gui():
    """Creates the GUI for the backup tool."""
    root = tk.Tk()
    root.title("Backup Tool")  # Set the window title
    root.geometry("400x200")  # Set the window size

    # Select source directory
    source_dir_label = ttk.Label(root, text="Select source directory:")
    source_dir_label.pack()
    source_dir_button = tk.Button(root, text="Select Source", command=select_source_dir)
    source_dir_button.pack(pady=2)

    # Display selected source directory
    global source_dir_display
    source_dir_display = ttk.Label(root, text="")
    source_dir_display.pack()

    # Select target directory
    target_dir_label = ttk.Label(root, text="Select target directory:")
    target_dir_label.pack()
    target_dir_button = tk.Button(root, text="Select Target", command=select_target_dir)
    target_dir_button.pack(pady=2)

    # Display selected target directory
    global target_dir_display
    target_dir_display = ttk.Label(root, text="")
    target_dir_display.pack()

    # Start backup button
    start_button = tk.Button(root, text="Start Backup", command=start_backup)
    start_button.pack(pady=5)
    global finish_message
    finish_message = ttk.Label(root, text="")
    finish_message.pack()

    return root

def main():
    """Main function to run the backup tool."""
    root = create_gui()
    root.mainloop()


def select_source_dir():
    """Opens file dialog to select the source directory."""
    global sourceDir
    sourceDir = filedialog.askdirectory(title="Select Source Directory")
    source_dir_display.config(text=sourceDir)
    
def select_target_dir():
    """Opens file dialog to select the target directory."""
    global targetDir
    targetDir = filedialog.askdirectory(title="Select Target Directory")
    target_dir_display.config(text=targetDir)

def start_backup():
    """Starts the backup process."""
    if sourceDir and targetDir:
        #Run single backup without schedule for now
        create_backup(sourceDir, targetDir)
    else:
        print("Please select source and target directories.")


# Backup function
def create_backup(source_dir: str, target_dir: str):
    """
    Creates a backup of the source directory to the target directory,
    only copying modified files.

    Args:
        source_dir: The path to the directory to be backed up.
        target_dir: The path to the directory where the backup will be stored.
    """
    # Variable to keep track of the number of copied files
    n_files_copied: int = 0

    # Create the target directory if it doesn't exist
    if not os.path.exists(target_dir):
        os.makedirs(target_dir)

    # Iterate through all files and directories in the source directory
    for root, dirs, files in os.walk(source_dir):
        # Calculate the relative path of the current directory
        relative_path = os.path.relpath(root, source_dir)

        # Create the corresponding directory in the target directory
        target_path = os.path.join(target_dir, relative_path)
        if not os.path.exists(target_path):
            os.makedirs(target_path)

        # Iterate through all files in the current directory
        for file in files:
            source_file = os.path.join(root, file)
            target_file = os.path.join(target_path, file)

            # Check if the file exists in the target directory
            if os.path.exists(target_file):
                # Calculate the hash of the source and target files
                source_hash = hashlib.md5(open(source_file, 'rb').read()).hexdigest()
                target_hash = hashlib.md5(open(target_file, 'rb').read()).hexdigest()

                # Copy the file only if the hashes are different
                if source_hash != target_hash:
                    shutil.copy2(source_file, target_file)
                    n_files_copied += 1
            else:
                # Copy the file if it doesn't exist in the target directory
                shutil.copy2(source_file, target_file)
                n_files_copied += 1

    print(f"Backup created successfully from '{source_dir}' to '{target_dir}'")
    print(f"Number of files copied: {n_files_copied}")
    finish_message.config(text=f"Number of files copied: {n_files_copied}")


if __name__ == "__main__":
    root = create_gui()
    root.mainloop()