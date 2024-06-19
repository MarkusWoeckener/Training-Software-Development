# Displays a simple clock and exits if [any key] is pressed.
import time
from time import strftime as t
from os import system
from pynput import keyboard

def main() -> None:
    printInstruction()
    clock()

def printInstruction() -> None:
    system("cls")
    print("Press [any key] to exit")

def clock() -> None:
    #start the keyboard listener
    global listener
    listener = keyboard.Listener(on_press=on_press)
    listener.start()
    try:
        #print the clock while the listener is alive
        while listener.running:
            print(t("%H:%M:%S")+"\r", end="")
            time.sleep(0.1)
    except KeyboardInterrupt:
        print("You pressed [Ctrl+C] to exit")
        listener.stop()

#when [any key] is pressed, stop the listener
def on_press(key) -> None:
    system("")
    listener.stop()

if __name__ == "__main__":
    main()