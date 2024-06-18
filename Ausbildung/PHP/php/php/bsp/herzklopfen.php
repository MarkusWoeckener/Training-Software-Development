<?php
// herzklopfen.php
#  Ersetzen Sie die NULL-Werte durch Berechnungen mit Variablen.
#  Probieren Sie sp�ter auch andere Herzschlagfrequenzen.

$minute = 70;

$stunde = $minute * 60; // Nicht: 70 * 60!
$tag    = NULL; // Tag  =  24 Stunden
$jahr   = NULL; // Jahr = 365 Tage

$alter  = NULL; // angenommene Lebenserwartung = 80 Jahre
$leben  = $alter * $jahr;

echo "Anzahl der Herzschlaege : ";

?>