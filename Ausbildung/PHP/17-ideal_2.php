<?php
// ideal_2.php
// Korrigieren und erweitern Sie
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

echo "Berechnungen des Idealgewichts (2)\n" ;
echo "----------------------------------\n\n" ;

echo "Ihre Groesse (in cm) bitte : ";
$gross = (int) fgets(STDIN);

echo "Welches Geschlecht (m/w)   : ";
$sex = trim(fgets(STDIN)); //trim() hinzugefügt um überflüssige Zeichen zu eliminieren

$im = ($gross-100) * .90; // Idealmann
$if = ($gross-100) * .85; // Idealfrau

if (strtolower($sex) == "m") //strtolower() eingefügt um Großschreibung zu ignorieren
{
	printf("Idealgewicht als Mann      : %0.2f\n", $im);
}
else 
{
	printf("Idealgewicht als Frau      : %0.2f\n", $if); //Formatierung angepasst zu %0.2f
}

?>