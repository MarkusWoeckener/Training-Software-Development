<?php
// rechnung.php
// Ergaenzen Sie das Programm an den Fragezeichen
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

$versand = 8;
$porto   = 3;

$rechnung = NULL; // Rechnungsbetrag
$total    = NULL; // Das muss bezahlt werden

echo "Rechnungsbetrag    : ";
$rechnung = fgets(STDIN);

if ($rechnung <= 100)
{
	$total = $rechnung + $versand + $porto;
}

else if ($rechnung >100 && $rechnung <= 200)
{
	$total = $rechnung + ($versand / 2);
}

else
	$total = $rechnung;

// Hier die Meldung mit zwei Nachkommastellen:
// "Bitte bezahlen Sie : ? Euro\n"
printf ("Bitte Bezahlen Sie : %0.2f Euro", $total);

?>