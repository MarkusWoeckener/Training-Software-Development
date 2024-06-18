<?php
// kreis.php
#  Nehmen Sie bitte als Radius den Wert 23

DEFINE ("PI", 3.14159265); 

echo "Berechnungen am Kreis\n";
echo "---------------------\n\n";

echo "Radius in cm : ";
$r = (double) fgets(STDIN);

$kumfang  = 2 * $r * PI;
$kflaeche = $r * $r * PI;

printf ("\nUmfang  : %7.2f\n", $kumfang);
printf ("Flaeche : %7.2f\n\n", $kflaeche);

?>