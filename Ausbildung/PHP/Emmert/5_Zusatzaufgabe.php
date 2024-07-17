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

Fallunterscheidung für option
    option == 1:
        Wiederhole für i von 1 bis 10 Schrittweite 1
            Ausgabe: "*" ohne Zeilenumbruch
        Ende Wiederhole
    option == 2:
        Wiederhole für i von 1 bis 10 Schrittweite 1
            Ausgabe: "*" mit Zeilenumbruch
        Ende Wiederhole
    option == 3:
        Wiederhole für i von 10 bis 1 Schrittweite -1
            Wiederhole für n von 1 bis n Schrittweite 1
                Ausgabe: "*"
            Ende Wiederhole
        Ausgabe: Zeilenumbruch
        Ende Wiederhole
Ende Fallunterscheidung
Ende
*/

$option = 0;

do {
    echo "Wähle 1, 2 oder 3: ";
    $option = intval(trim(fgets(STDIN)));
    if ($option < 1 || $option > 3) {
        echo "Ungültige Eingabe\n";
    }
}
while ($option < 1 || $option > 3);

switch ($option) {
    case 1:
        for ($i = 1; $i <= 10; $i++) {
            echo "*";
        }
        echo "\n";
        break;
    case 2:
        for ($i = 1; $i <= 10; $i++) {
            echo "*\n";
        }
        break;
    case 3:
        for ($i = 10; $i >= 1; $i--) {
            for ($n = 1; $n <= $i; $n++) {
                echo "*";
            }
            echo "\n";
        }
        break;
}
