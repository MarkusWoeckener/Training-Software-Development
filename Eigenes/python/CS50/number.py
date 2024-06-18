def main():
    x = getInt("What's x: ")
    print("x is", x)

def getInt(prompt):
    while True:
        try:
            return int(input(prompt))
        except ValueError:
            pass
        
main()