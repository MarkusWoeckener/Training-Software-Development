# Aufgabe: Schreiben Sie ein Programm, das die Zahlen 
# von 1 bis 10 auf dem Bildschirm ausgibt. 
# Die Zahlen sollen durch einen Bindestrich getrennt werden. 

# Variante 1
for i in range(10):
    print(i + 1, end="")
    if i < 9:
        print("-", end="")
print()

# Variante 2
numbers: "list[int]" = list(range(1, 11))
print(*numbers, sep="-")