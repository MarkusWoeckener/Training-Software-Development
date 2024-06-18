<?php
// ideal_1.php

$gross = NULL; // Koerpergroesse in cm
$ig    = NULL; // Idealgewicht

echo "\tBerechnungen des Idealgewichts (1)\n";
echo "\t----------------------------------\n\n";

echo "Ihre Koerpergroesse (in cm) bitte : ";
$gross = (int) fgets(STDIN);

$ig = ($gross - 100) * 1.9; // ist identisch mit 0.9

echo "Das ist Ihr Idealgewicht (in Kg)  : ".$ig;

?>
