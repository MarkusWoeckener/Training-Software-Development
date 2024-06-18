<?php
// besitzer.php
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

echo "\tKfZ-Wertverlustberechnung\n";
echo "\t-------------------------\n\n";

echo "Neupreis des Automobils   : ";
$neupreis = (int) fgets(STDIN);
echo "Anzahl (1-6) der Besitzer : ";
$besitzer = (int) fgets(STDIN);

$wert = $neupreis;

/*
1 Besitzer: Wert bleibt unver�ndert
2 Besitzer: Wert mal 0.95;
3 Besitzer: Wert mal 0.90;
4 Besitzer: Wert mal 0.85;
5 Besitzer: Wert mal 0.80;
6 Besitzer: Wert mal 0.75;
*/
switch ($besitzer){
    case 1: $wert = $neupreis;
        break;
    case 2: $wert = $neupreis * 0.95;
        break;
    case 3: $wert = $neupreis * 0.9;
        break;
    case 4: $wert = $neupreis * 0.85;
        break;
    case 5: $wert = $neupreis * 0.8;
        break;
    case 6: $wert = $neupreis * 0.75;
        break;
    default: echo"Ungültige Anzahl Vorbesitzer!";
        break;
}

printf ("\nDer Neupreis des Autos betrug %0.2f Euro.\n", $neupreis);
printf ("Das Auto ist aktuell noch %0.2f Euro wert.", $wert);

?>