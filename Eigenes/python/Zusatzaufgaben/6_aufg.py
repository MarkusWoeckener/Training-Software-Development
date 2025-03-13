# Aufgabe: Schreiben Sie ein Programm, das eine 
# Liste mit den Zahlen von 0 bis 99 erstellt.

# Liste mit Zahlen füllen, zfill(2) stellt zwei dezimalstellen sicher
numbers: list[str] = [str(i).zfill(2) for i in range(100)]

# Listenelemente mit Kommas getrennt ausgeben
print(*numbers, sep=", ")