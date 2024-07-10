<?php
/*
Aufgabe: Der Nutzer soll eine Zahl zwischen 0 und 10 eingeben, die Eingabeaufforderung,
bzw. Eingabe selbst wird solange wiederholt, bis die Zahl innerhalb der vorgegebenen Grenzen
liegt.

Pseudocode:

Anfang
int zahl = 0
bool bedingung = false

Wiederhole, solange bedingung = false
    Eingabe "Geben sie eine Zahl zwischen 0 und 10 ein:" zahl
    Wenn 0 <= zahl >= 10
        bedingung = true
    Sonst
        Ausgabe "Die Zahl muss zwischen 0 und 10 liegen"
    Ende Wenn
Ende Wiederhole
Ausgabe: "Ihre Eingabe war: zahl"
Ende
*/

$zahl = 0;
$bedingung = false;

while ($bedingung == false) {
    echo "Geben Sie eine Zahl zwischen 0 und 10 ein: ";
    $zahl = intval(trim(fgets(STDIN)));
    if ($zahl >= 0 && $zahl <= 10) {
        $bedingung = true;
    }
    else {
        echo "Die Zahl muss zwischen 0 und 10 liegen\n";
    }
}
echo "Ihre Eingabe war: " . $zahl;

?>