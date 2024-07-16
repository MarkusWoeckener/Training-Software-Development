<?php
/*
Erstellen Sie ein Programm, welches den Nutzer auffordert eine Zahl einzugeben.
Wird keine 1 oder 2 eingetippt, erscheint eine Fehlermeldung. Ist die Eingabe
hingegeben richtig, erscheint entweder die Ausgabe „Sie haben 1 gewählt“ oder
entsprechend „Sie haben 2 gewählt“.
Mit fußsteuerter Schleife.

Pweudocode:
Anfang
int zahl = 0
Wiederhole
    Ausgabe: "Wählen Sie Option 1 oder 2 aus: "
    Eingabe: zahl
    Wenn zahl != 1 && zahl != 2
        Ausgabe: "Ungüültige Eingabe"
    Ende Wenn
solange zahl != 1 && zahl != 2
Ende Wiederhole
Fallunterscheidung
    zahl == 1
        Ausgabe: "Sie haben 1 gewählt"
    zahl == 2
        Ausgabe: "Sie haben 2 gewählt"
Ende Fallunterscheidung
Ende
*/

$zahl = 0;

do{
    echo "Wählen Sie Option 1 oder 2 aus: ";
    $zahl = intval(trim(fgets(STDIN)));
    if ($zahl != 1 && $zahl != 2) {
        echo "Ungültige Eingabe\n";
    }
} while ($zahl != 1 && $zahl != 2);

switch ($zahl) {
    case 1:
        echo "Sie haben 1 gewählt\n";
        break;
    case 2:
        echo "Sie haben 2 gewählt\n";
        break;
}
?>
?>