from time import localtime as t
from os import system
import keyboard

def main() -> None:
    printInstruction()
    clock()

def printInstruction() -> None:
    system("cls")
    print("Press [space] to exit")

def clock() -> None:
    while True:
        print("%02d:%02d:%02d\r" %(t().tm_hour, t().tm_min, t().tm_sec), end="")
        if keyboard.is_pressed("space"): 
            break

if __name__ == "__main__":
    main()