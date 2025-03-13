# Aufgabe: Schreiben Sie ein Programm, das folgende Ausgabe erzeugt:
#
# *
# * *
# * * *
# * * * *
# * * * * *
# * * * * *
# * * * *
# * * *
# * *
# *

for i in range(5):
    for n in range(i+1):
        print("* ", end="")
    print("")

for x in range(5, 0, -1):
    for y in range(x):
        print("* ", end="")
    print()