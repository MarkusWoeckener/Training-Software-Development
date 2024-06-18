# Variable deklarieren und auf Startwert 1 setzen
result: int = 1

# Benutzereingabe anfordern
x = int(input("Für welche Zahl soll die Fakultät gebildet werden? "))

# Berechnung der Fekultät mit for-Schleife
for i in range(x):
    result *= (i + 1)

#Ergebnis ausgeben
print("Das Ergebnis ist:", result)