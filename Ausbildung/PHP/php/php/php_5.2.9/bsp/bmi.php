<?php
// bmi.php

echo "\tB M I - M e s s u n g\n";
echo "\t---------------------\n\n";

echo "Bitte Deinen Vornamen eingeben   : ";
$vn = trim(fgets(STDIN));

echo "Verrate uns Dein Gewicht (in kg) : ";
$kg = (int) fgets(STDIN);


echo "Nenne uns Deine Groesse (in cm)  : ";
$cm = (int) fgets(STDIN);

$cm = $cm / 100;
$bmi = $kg / ($cm * $cm); // BMI-Formel

printf("\n%s, Du hast einen BMI von %d!", $vn, $bmi);

?>