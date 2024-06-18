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

if($bmi > 27) {
	printf("\n%s, Bitte abnehmen, deine Gesundheit ist in Gefahr", $vn);
}
elseif($bmi < 22) {
	printf("\n%s, Bitte mehr essen", $vn);
}
else {
	printf("\n%s, Dein BMI ist in Ordnung!", $vn);
}
//printf("\n%s, Du hast einen BMI von %d!", $vn, $bmi);

?>