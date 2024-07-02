<?php
//03-tanken.php

echo "T a n k e n\n";
echo "-----------\n\n";

//Eingabe der Werte
echo "Liter: ";
$liter = fgets(STDIN);

echo "Kilometer: ";
$kilometer = fgets(STDIN);

//Berechnung des Verbrauchs
$verbrauch = $liter / $kilometer * 100;

//Ausgabe
echo "\nVerbrauch: ".$verbrauch." Liter pro 100 Km";
echo "\n";
?>