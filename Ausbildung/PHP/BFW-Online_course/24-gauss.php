<?php
// gauss.php
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

$summe = NULL;

for ($zahl = 1; $zahl <= 100; $zahl++) 
{
	$summe = $summe + $zahl;
    printf("Schritt %03d = Summe %d\r", $zahl, $summe);
	# "Pause" einbauen
    fgets(STDIN);
}

echo "Summe der Zahlen bis 100 : ".$summe; 
echo "\n";

?>