<?php
// 03-tanken.php

echo "T a n k e n\n";
echo "-----------\n\n";

echo "Bitte geben sie die Liter ein    : ";
$liter     = fgets(STDIN);
echo "Bitte geben sie die Kilometer ein: ";
$kilometer = fgets(STDIN);

$verbrauch = $liter / $kilometer * 100;

echo "Liter: $liter";
echo "Kilometer: $kilometer";
echo "Verbrauch : $verbrauch Liter";
echo "\n";
?>