# Aufgabe: Schreiben Sie ein Programm, das die Summe der 
# Ziffern von 1 bis 30 berechnet und ausgibt.

summe: int = 0

for i in range(1, 31):
    summe += i

print("Die Summe der Ziffern von 1 bis 30 ist:", summe)