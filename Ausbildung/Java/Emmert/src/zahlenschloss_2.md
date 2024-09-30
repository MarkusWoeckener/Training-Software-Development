# Pseudocode Zahlenschloss
## kürzerer Algorithmus
```
Anfang
int[] kombination = {1, 7, 11}
int zahl
Boolean gleich = true

Für int i = 0 bis i < kombination.length, Schrittweite 1, wiederhole
    Ausgabe: "Geben Sie eine Zahl der Kombination ein: "
    Eingabe: zahl
    Wenn zahl != kombination[i], dann
        gleich = false
    Ende Wenn
Ende Wiederhole

Wenn gleich == true, dann
    Ausgabe: "Richtige Kombination"
Sonst
    Ausgabe: "Falsche Kombination"
Ende Wenn
Ende
```