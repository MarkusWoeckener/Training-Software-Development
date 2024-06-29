# script for user configured dice rolls

import random
import os

def main() -> None:
    while True:
        clearScreen()
        print("Please specify the dice roll:")
        sides, numberOfDice, mod = dice_roll_input() # get input from user
        results: list[int] = rollDice(sides, numberOfDice) # roll dice
        printResult(results, mod) # print results
        # ask user if they want to roll again
        if input("Roll again? (y/n): ").lower() == "n":
            break


def dice_roll_input():
    """Get dice roll input from user and return the values\n
    args:
        None
    returns:
        Number of Sides, Number of Dice, Modifier as a tuple of integers
    """
    side: int = getSides()
    ndice: int = getNumber()
    mod: int = getModifier()
    return side, ndice, mod


def getSides() -> int:
    """Get number of sides from user\n
    args:
        None
    returns:
        number of sides as integer
    """
    while True:
        try:
            n_sides: int = int(input("Number of sides: "))
            if n_sides <= 0:
                print("Invalid input. Please enter a positive integer.")
            else:
                return n_sides
        except ValueError:
            print("Invalid input. Please enter a number.")

def getNumber() -> int:
    """Get number of dice from user\n
    args:
        None
    returns:
        number of dice as integer
    """
    while True:
        try:
            n_dice: int = int(input("Number of dice: "))
            if n_dice < 1:
                print("Invalic input. Number of dice must be 1 or bigger")
            else:
                return n_dice
        except ValueError:
            print("Invalid input. Please enter a number.")

def getModifier() -> int:
    """Get modifier from user.\n
    For useability in most RPGs the range is limited to -20 to 20\n
    args:
        None
    returns:
        modifier as integer
    """
    while True:
        try:
            tmp_mod_str: str = input("Modifier (std: 0): ")
            #return 0 as standard when there is no user input
            if tmp_mod_str == "":
                return 0
            #convert user input to integer
            tmp_mod: int = int(tmp_mod_str)
            #limit mod to useable range for most RPGs
            if tmp_mod < -20 or tmp_mod > 20:
                print("Please use a sensible modifier between -20 and 20")
            else:
                return tmp_mod
        except ValueError:
            print("Invalid input. Please enter a number.")

def rollDice(sides: int, rolls: int) -> "list[int]":
    """Roll dice and return results\n
    args:
        sides: number of sides on the dice as int
        rolls: number of dice to roll as int
    returns:
        list of results (list[int])
    """
    results = []
    for _ in range(rolls):
        results.append(random.randrange(1, sides + 1))
    return results

def printResult(results: "list[int]", mod: int) -> None:
    """Print results of dice roll\n
    args:
        results: list of results as list[int]
        mod: modifier as int
    returns:
        None
    """
    print("The dice roll is:", *results, "{:+d}".format(mod))
    print("Sum:", sum(results) + mod)

def clearScreen() -> None:
    """OS agnostic function to clear screen"""
    if os.name == "nt": #for Windows systems
        os.system("cls")
    else: #for Unix based systems
        os.system("clear")

if __name__ == "__main__":
    main()