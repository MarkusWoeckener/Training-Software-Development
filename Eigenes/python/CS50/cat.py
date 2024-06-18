def main():
    number = getNumber()
    miau(number)

def getNumber():
    while True:
        n = int(input("n:"))
        if n > 0:
            return n

def miau(n):
    for _ in range(n):
        print("miau")

main()