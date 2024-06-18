from time import localtime as t
from os import system
import msvcrt

def main() -> None:
    printInstruction()
    clock()

def printInstruction() -> None:
    system("cls")
    print("Press [space] to exit")

def clock() -> None:
    while True:
        print("%02d:%02d:%02d\r" %(t().tm_hour, t().tm_min, t().tm_sec), end="")
        if msvcrt.kbhit():
            print("")
            break

if __name__ == "__main__":
    main()