def main():
    name = input("What's your name? ").strip().capitalize()
    hello(name)


def hello(to="world"):
    print(f"Hello, {to}!")

main()