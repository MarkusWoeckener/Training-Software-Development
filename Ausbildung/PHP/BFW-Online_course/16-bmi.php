<?php
// bmi.php
/*
Name: Markus Woeckener 
Datum: 30.04.24
*/

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

printf("\n%s, Du hast einen BMI von %0.3f!\n", $vn, $bmi);

if ($bmi > 27)
{
    echo"Bitte abnehmen!\nDeine Gesundheit ist in Gefahr!";
}
elseif ($bmi < 22)
{
    echo"Bitte mehr essen!";
}
else
{
    echo"Dein BMI ist in Ordnung!";
}

?>