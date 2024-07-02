<?php
// herzklopfen.php
/*
Name:		Markus Woeckener
Datum:	23.04.24
*/


$minute = 70;

$stunde = $minute * 60;
$tag    = $stunde * 24;
$jahr   = $tag * 365;

$alter  = 80; // angenommene Lebenserwartung = 80 Jahre
$leben  = $alter * $jahr;

echo "Anzahl der Herzschlaege : ".$leben;
echo "\n";

?>