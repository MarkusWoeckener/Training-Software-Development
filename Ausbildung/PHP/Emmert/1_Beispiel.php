<?php
/*
Aufgabe: Zahlen von 1 bis 100 auf dem Bildschirm ausgeben
Pseudocode:
Anfang
int zahl = 1
int i = 0
wiederhole, solange i < 100
    zahl += 1
    i++
    ausgabe zahl
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
?>