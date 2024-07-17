<?php
/*
Erstellen Sie ein Programm, welches den Nutzer auffordert eine Zahl einzugeben.
Wird keine 1 oder 2 eingetippt, erscheint eine Fehlermeldung. Ist die Eingabe
hingegeben richtig, erscheint entweder die Ausgabe „Sie haben 1 gewählt“ oder
entsprechend „Sie haben 2 gewählt“.
Mit kopfgesteuerter Schleife.

Pseudocode:
int option = 0

Wiederhole solange option != 1 && option != 2
    Ausgabe: "Wählen Sie Option 1 oder 2 aus: "
    Eingabe: option
    Wenn option != 1 && option != 2
        Ausgabe: "Ungültige Eingabe"        
    Ende Wenn
Ende Wiederhole

Fallunterscheidung option
    option == 1
        Ausgabe: "Sie haben 1 gewählt"
    option == 2
        Ausgabe: "Sie haben 2 gewählt"
Ende Fallunterscheidung
Ende
*/

$option = 0;

while ($option != 1 && $option !=2){
    echo "Wählen Sie Option 1 oder 2 aus: ";
    $option = intval(trim(fgets(STDIN)));
    if ($option != 1 && $option != 2) {
        echo "Ungültige Eingabe\n";
    }
}

switch ($option) {
    case 1:
        echo "Sie haben 1 gewählt\n";
        break;
    case 2:
        echo "Sie haben 2 gewählt\n";
        break;
}
?>