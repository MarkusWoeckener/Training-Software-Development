<?php
// FuncDemo_5.php
// Aufgabe: Variabler Steuersatz

function steuer($z) 
{
	$mwst = $z * 19 / 100;
	return $mwst;
	echo "\nDas ist ein Test!"; // Wird nicht mehr ausgegeben, da die Funktion mit return den Wert zurückgibt und verlassen wird.
}

// ---------------------------------------

echo "Nettobetrag  : ";
$netto = fgets(STDIN);

$brutto = $netto + steuer($netto);
printf("Bruttobetrag : %0.2f\n", $brutto);

?>