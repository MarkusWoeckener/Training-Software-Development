# script that checks user input for upper- und lower-case letters
# special characters, minimum length
# and hides the input with "*"

def main():
    pwd_1 = get_password()
    print(f"Password: {pwd_1}")

def get_password():
    upper: int = 0
    lower: int = 0
    while True:
        pwd = input("Enter password: ")
        for char in pwd:
            if char.isupper():
                upper += 1
            elif char.islower():
                lower += 1
        if upper >0 and lower >0:
            break
        else:
            print("Password must contain at least one upper and lower case letter")
    return pwd

if __name__ == "__main__":
    main()