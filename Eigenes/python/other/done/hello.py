# script that asks user for their name,
# then greets them and prints currend date and time

from time import strftime as t
import os

def main() -> None:
    name: str = getName()
    printName(name)
    printTime()

# ask the user for a name, capitalise every word from the input
# strip leading and trailing spaces and return the name
def getName() -> str:
    clear_console()
    return input("Name: ").title().strip()

# print a greeting to the user
def printName(name: str) -> None:
    clear_console()
    print(f"Hallo {name}!")

# print the current date and time
def printTime() -> None:
    print("Datum:", t("%d.%m.%Y"))
    print("Uhrzeit:" , t("%H:%M:%S"))

# os-independent function to clear the console
def clear_console() -> None:
    if os.name == "nt": #Windows based OS
        os.system("cls")
    else: #Unix based OS
        os.system("clear")

if __name__ == "__main__":
    main()