<?php
// herzklopfen.php
#  Ersetzen Sie die NULL-Werte durch Berechnungen mit Variablen.
#  Probieren Sie später auch andere Herzschlagfrequenzen.

$minute = 70;

$stunde = $minute * 60; // Nicht: 70 * 60!
$tag    = $stunde * 24; // Tag  =  24 Stunden
$jahr   = $tag * 365; // Jahr = 365 Tage

$alter  = 80; // angenommene Lebenserwartung = 80 Jahre
$leben  = $alter * $jahr;

echo "Anzahl der Herzschlaege : $leben";

?>
