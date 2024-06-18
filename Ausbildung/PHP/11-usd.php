<?php
//11-usd.php
/*
Name: Markus Woeckener
Datum: 23.04.24
*/

//Variablen deklarieren
$dollar = NULL;
$euro = NULL;

//Konstanten definieren
DEFINE ("UMRECHNUNG", 0.9460);

//Ausgabe Überschrift
echo "\tUmrechnung Dollar-Euro\n";
echo "\t----------------------\n";

//Eingabe des Dollar-Wertes
echo "Betrag eingeben\t: ";
$dollar = (int) fgets(STDIN); 
echo "\nBetrag in Dollar: ".$dollar;

//berechnung des Betrags in Euro
$euro = $dollar * UMRECHNUNG;

//Ausgabe der Berechneten Werte
echo "\nBetrag in Euro\t: ".$euro;
echo "\nEuro (gerundet)\t: ".round($euro, 2); //Berechnung und Ausgabe des gerundeten Wertes
echo "\n";

?>