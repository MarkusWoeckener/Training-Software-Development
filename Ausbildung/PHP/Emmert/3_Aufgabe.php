<?php
/*
Erstellen Sie ein Programm, welches den Nutzer auffordert eine Zahl einzugeben.
Wird keine 1 oder 2 eingetippt, erscheint eine Fehlermeldung. Ist die Eingabe
hingegeben richtig, erscheint entweder die Ausgabe „Sie haben 1 gewählt“ oder
entsprechend „Sie haben 2 gewählt“.
Mit kopfgesteuerter Schleife.

Pseudocode:
int zahl = 0

Wiederhole solange zahl != 1 && zahl != 2
    Ausgabe: "Wählen Sie Option 1 oder 2 aus: "
    Eingabe: zahl
    Wenn zahlt != 1 && zahl != 2
    Ausgabe: "Ungültige Eingabe"        
    Ende Wenn
Ende Wiederhole

Fallunterscheidung
    zahl == 1
        Ausgabe: "Sie haben 1 gewählt"
    zahl == 2
        Ausgabe: "Sie haben 2 gewählt"
Ende Fallunterscheidung
Ende
*/

zahl = 0;

while (zahl != 1 && zahl !=2){
    echo "Wählen Sie Option 1 oder 2 aus: ";
    $zahl = intval(trim(fgets(STDIN)));
    if ($zahl != 1 && $zahl != 2) {
        echo "Ungültige Eingabe\n";
    }
}

switch (zahl) {
    case 1:
        echo "Sie haben 1 gewählt\n";
        break;
    case 2:
        echo "Sie haben 2 gewählt\n";
        break;
}
?>