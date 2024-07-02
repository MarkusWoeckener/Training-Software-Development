<?php
//03-tanken.php
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

echo "T a n k e n\n";
echo "-----------\n\n";

//Eingabe der Werte
echo "Verbrauch in Liter: ";
$liter = fgets(STDIN);

echo "Gefahrene Strecke in Kilometer: ";
$kilometer = fgets(STDIN);

//Berechnung des Verbrauchs
$verbrauch = $liter / $kilometer * 100;

//Ausgabe
//echo "\nDas Auto verbraucht: ".$verbrauch." Liter pro 100 Km";
printf ("Das Auto verbraucht %0.2f Liter", $verbrauch);

?>