# Pseudocode Zahlenschloss
```
Anfang
int[] kombination = {1, 7, 11}
int[] eingabe = new int[kombination.length]
int zahl
Boolean gleich = true

Für int i = 0 bis i < kombination.length, Schrittweite 1, wiederhole
    Ausgabe: "Geben Sie eine Zahl der Kombination ein: "
    Eingabe: zahl
    eingabe[i] = zahl
Ende Wiederhole

Für int j = 0 bis j < kombination.length, Schrittweite 1, wiederhole
    Wenn eingabe[j] != kombination[j], dann
        gleich = false
        Beende Schleife
    Ende Wenn
Ende Wiederhole

Wenn gleich == true, dann
    Ausgabe: "Richtige Kombination"
Sonst
    Ausgabe: "FAlsche Kombination"
Ende Wenn
Ende
```