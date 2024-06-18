<?php
// Schach.php

$korn  = 1;

echo "Schach\n";
echo "------\n\n";

printf("%2d. Feld  Korn: %d\r", 1, 1);

for ($feld = 2; $feld <= 64; $feld++) 
{
	$korn = $korn * 2;
	fgets(STDIN); // Haltepunkt
	printf("%2d. Feld  Korn: %0.0f\r", $feld, $korn);
}

?>