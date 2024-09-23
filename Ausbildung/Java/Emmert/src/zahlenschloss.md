## Pseudocode Zahlenschloss

Anfang
int[] kombination = {1, 7, 11}
int[3] eingabe = new int[3]
int zahl
Boolean gleich = false

Für int i = 0 bis i < kombination.length, Schrittweite 1, wiederhole
    Ausgabe: "Geben Sie eine Zahl der Kombination ein: "
    Eingabe: zahl
    eingabe[i] = zahl
    Wenn eingabe[i] == kombination[i]
        gleich = true
    Ende Wenn
Ende Wiederhole
Wenn gleich == true, dann
    Ausgabe: "Richtige Kombination"
Sonst
    Ausgabe: "FAlsche Kombination"
Ende Wenn
Ende