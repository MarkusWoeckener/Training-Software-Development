def main():
    number = getNumber()
    miau(number)

def getNumber():
    """Asks user to input a number n and returns it if it is positive."""
    while True:
        n = int(input("n:"))
        if n > 0:
            return n

def miau(n):
    """Prints 'miau' n times."""
    for _ in range(n):
        print("miau")

main()