<?php
// ideal_2.php
// Korrigieren und erweitern Sie

echo "Berechnungen des Idealgewichts (2)\n" ;
echo "----------------------------------\n\n" ;

echo "Ihre Groesse (in cm) bitte : ";
$gross = (int) fgets(STDIN);

echo "Welches Geschlecht (m/w)   : ";
$sex = fgets(STDIN);

$im = ($gross-100) * .90; // Idealmann
$if = ($gross-100) * .85; // Idealfrau

  if ($sex == "m")
    printf("Idealgewicht als Mann      : %0.2f\n", $im);
  else 
    printf("Idealgewicht als Frau      : %f\n", $if);

?>

