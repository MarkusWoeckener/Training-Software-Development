# Liste mit Zahlen füllen
numbers: "list [str]" = [str(i).zfill(2) for i in range(100)]

# Listenelemente mit Kommas getrennt ausgeben
print(*numbers, sep=", ")