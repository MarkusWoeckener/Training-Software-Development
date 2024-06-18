# script that checks user input for
# upper- und lower-case letters
# minimum length
# and hides the input with "*"

import getpass

def main() -> None:
    print("Username:", getpass.getuser())
    pwd_1: str = get_password("Set password: ")
    pwd_2: str = get_password("Confirm password: ")
    if pwd_1 == pwd_2:
        print("Passwords match")
    else:
        print("Passwords do not match")

def get_password(prompt: str = "Enter password: ") -> str:
    while True:
        pwd = getpass.getpass(prompt)
        if chk_password(pwd):
            break
    return pwd

def chk_password(pwd: str) -> bool:
    if len(pwd) < 8:
        print("Password must be at least 8 characters long")
        return False
    elif not any(char.isupper() for char in pwd):
        print("Password must have at least one upper case character")
        return False
    elif not any(char.islower() for char in pwd):
        print("Password must have at least one lower case character")
        return False
    return True
    
if __name__ == "__main__":
    main()