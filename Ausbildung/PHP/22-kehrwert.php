<?php
// kehrwert.php
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

do 
{
	echo "Eine Zahl (1-9) : ";
	$zahl = (int) fgets(STDIN); //Zahl als Integer definieren

	$kehrwert = 1 / $zahl;
	printf("Der Kehrwert    : %0.2f\n", $kehrwert);
	echo "\nNochmal (j/n)   : ";
	$frage = trim(fgets(STDIN));
	echo "\n";
} 
while (strtolower($frage) == "j"); //$frage in lowercase Konvertieren

?>