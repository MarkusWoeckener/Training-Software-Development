# Pseudocode Zahlenschloss
## alle Zusatzaufgaben
```
Anfang
main Methode
    int[] kombination = {1, 7, 11}
    int versuche = 3

    Für int i = 0 bis i < kombination, Schrittweite 1, wiederhole
        Wenn Rückgabewert von schloss(kombination) == wahr, dann
            Unterbreche Schleife
        Ende Wenn
    Ende Wiederhole

    Wenn Rückgabewert von schloss(kombination) == wahr, dann
        Ausgabe: "Korrekt"
    Sonst
        Ausgabe: "Falsche Kombination"
    Ende Wenn
Ende Methode

Methode schloss, Rückgabewert boolean
    int zahl
    boolean gleich = true

    Für int i = 0 bis i < kombination.length, Schrittweite 1, wiederhole
        Ausgabe: "Geben Sie eine Zahl der Kombination ein: "
        Eingabe: zahl
        Wenn zahl != kombination[i], dann
            gleich = false
        Ende Wenn
    Ende Wiederhole

    Rückgabe: gleich
Ende Methode
Ende
```