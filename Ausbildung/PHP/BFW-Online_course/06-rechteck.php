<?php
// rechteck.php

/*
Name	: Markus Woeckener
Datum	: 23.04.24
*/

//Variablen deklarieren
$x = NULL;
$y = NULL;
$flaeche = NULL;
$umfang = NULL;

//den Variablen Werte zuweisen
$x = 4.25;
$y = 5.3;

//Werte für Fläche und Umfang berechnen
$flaeche = $x * $y;
$umfang  = ($x + $y) * 2;

//Ausgabe in der Konsole
echo "Die Flaeche betraegt : ".$flaeche." Quadrameter\n";
echo "Der Umfang betraegt  : ".$umfang." Meter";
echo "\n";

?>