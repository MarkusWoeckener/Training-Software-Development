<?php
// FuncDemo_5.php
// Aufgabe: Variabler Steuersatz

function steuer($z) {
  $mwst = $z * 19 / 100;
  return $mwst;
  echo "\nDas ist ein Test!";
}

// ---------------------------------------

echo "Nettobetrag  : ";
$netto = fgets(STDIN);

$brutto = $netto + steuer($netto);
printf("Bruttobetrag : %0.2f\n", $brutto);

?>
