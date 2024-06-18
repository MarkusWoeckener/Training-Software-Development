students = [
    {"Name": "Hermione", "House": "Griffindor", "Patronous": "Otter"},
    {"Name": "Harry", "House": "Griffindor", "Patronous": "Stag"},
    {"Name": "Ron", "House": "Griffindor", "Patronous": "Jack Russel Terrier"},
    {"Name": "Draco", "House": "Slytherin", "Patronous": None}
]

for student in students:
    for s in student:
        print(student[s],"", end="")
    print("\n", end="")