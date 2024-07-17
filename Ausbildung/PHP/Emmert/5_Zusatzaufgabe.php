<?php
/*
Bei Eingabe der Zahl 1 geben Sie bitte 10 Sterne in einer Zeile aus,
bei Eingabe von Zahl 2 soll eine Ausgabe von 10 Sternen untereinander stattfinden.
(Option für Tüftler, bei Eingabe der Zahl 3 bitte Ausgabe:
1. Zeile 10 Sterne, zweite 9, dritte 8 usw. bis zu einem in der letzten Zeile).

Pseudocode:
Anfang
int option = 0
Wiederhole
    Ausgabe: "Wähle 1, 2 oder 3:"
    Eingabe: option
    Wenn option < 1 || option > 3
        Ausgabe: "Ungültige Eingabe"
    Ende Wenn
Solange bis option >=1 && option <= 3
Ende Wiederhole
Fallunterscheidung
    option = 1:
        Wiederhole für i von 1 bis 10 Schrittweite 1
            Ausgabe: "*" ohne Zeilenumbruch
        Ende Wiederhole
    option = 2:
        Wiederhole für i von 1 bis 10 Schrittweite 1
            Ausgabe: "*" mit Zeilenumbruch
        Ende Wiederhole
    option 3:
        Wiederhole für i von 10 bis 1 Schrittweite -1
            Wiederhole für n von 1 bis n Schrittweite 1
                Ausgabe: "*"
            Ende Wiederhole
        Ausgabe: Zeilenumbruch
        Ende Wiederhole
Ende Fallunterscheidung
Ende
*/