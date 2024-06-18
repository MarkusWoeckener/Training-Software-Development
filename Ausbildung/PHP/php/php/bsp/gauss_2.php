<?php
// gauss_2.php

echo "Zahlen von 1 bis 100 zusammenzaehlen\n";
echo "------------------------------------\n\n";
$s = 1; // Summe

for ($zahl = 2; $zahl <= 100; $zahl++) 
{
	printf("%4d + %3d = %4d\r", $s, $zahl, $s + $zahl);
	$s = $s + $zahl;

	fgets(STDIN); // das Programm anhalten
}

?>