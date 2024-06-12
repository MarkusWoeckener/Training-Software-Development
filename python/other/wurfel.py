import random
from os import system

def main() -> None:
    system("cls") # clear screen
    print("Please specify the dice roll:")
    sides: int = getSides() # get number of sides
    numberOfDice: int = getNumber() # get number of dice
    mod: int = getModifier() # get modifier, def = 0
    results: list[int] = rollDice(sides, numberOfDice) # roll dice
    printResult(results, mod) # print results

def getSides() -> int:
    return int(input("Kind of dice: d"))

def getNumber() -> int:
    return int(input("Number of dice: "))

def getModifier() -> int:
    return int(input("Modifier (std: 0): "))

def rollDice(sides, rolls) -> list[int]:
    results = []
    for _ in range(rolls):
        results.append(random.randrange(1, sides + 1))
    return results

def printResult(results, mod) -> None:
    print(f"The dice roll is:", *results)
    print("Sum:", sum(results) + mod)

if __name__ == "__main__":
    main()