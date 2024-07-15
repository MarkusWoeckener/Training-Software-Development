<?php
/*
Aufgabe: Zahlen von 1 bis 100 auf dem Bildschirm ausgeben
Pseudocode:
Anfang
int zahl = 0
int i = 0
wiederhole, solange i < 100
    zahl += 1
    i++
    Ausgabe:     zahl
Ende wiederhole
Ende
*/

$zahl = 0;
$i = 0;
while ($i < 100) {
    $zahl += 1;
    $i++;
    echo $zahl . ", ";
}

//kürzere Alternative:
for ($z = 1; $z <= 100; $z++) {
    echo $z . ", ";
}

?>