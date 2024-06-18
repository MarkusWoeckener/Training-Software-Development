<?php
// rechteck.php

#  Aufgaben:
#  Die Variable $x erhält den Wert: 4.25
#  Die Variable $y erhält den Wert: 5.3
#  Die Ergebnisse von $flaeche und $umfang ausgeben
#  Verwenden Sie zur Ausgabe den Verknüpfungsoperator (Punkt).
#  Zeilenschaltung vor der Meldung "Der Umfang ..." einprogrammieren
#  Eine weitere Zeilenschaltung vor dem Programmende


$x = NULL;
$y = NULL;

$x = 4.25;
$y = 5.3;


$flaeche = $x * $y;
$umfang  = ($x + $y) * 2;

echo "Die Flaeche betraegt : $flaeche";
echo "\nDer Umfang betraegt  : $umfang\n";

?>