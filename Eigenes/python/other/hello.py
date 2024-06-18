from time import localtime as t
from os import system

def main():
    name = getName()
    printName(name)
    printTime()
    
def getName() -> str:
    system("cls")
    return input("Name: ").title().strip()

def printName(name):
    system("cls")
    print(f"Hallo {name}!")

def printTime():
    print("Datum: %02d.%02d.%02d" %(t().tm_mday, t().tm_mon, t().tm_year))
    print("Uhrzeit: %02d:%02d:%02d" %(t().tm_hour, t().tm_min, t().tm_sec))

main()