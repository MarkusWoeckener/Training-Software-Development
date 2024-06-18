<?php
// besitzer.php

echo "\tKfZ-Wertverlustberechnung\n";
echo "\t-------------------------\n\n";

echo "Neupreis des Automobils   : ";
$neupreis = (int) fgets(STDIN);
echo "Anzahl (1-6) der Besitzer : ";
$besitzer = (int) fgets(STDIN);

$wert = $neupreis;

/*
1 Besitzer: Wert bleibt unver�ndert
2 Besitzer: Wert mal 0.95;
3 Besitzer: Wert mal 0.90;
4 Besitzer: Wert mal 0.85;
5 Besitzer: Wert mal 0.80;
6 Besitzer: Wert mal 0.75;
*/

echo "\n";
echo "Der Neupreis des Autos betrug ".$neupreis." Euro.\n";
echo "Das Auto ist aktuell noch ".$wert." Euro wert.";

?>