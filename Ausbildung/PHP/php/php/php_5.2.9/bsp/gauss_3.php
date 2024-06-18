<?php
// gauss_3.php
// So rechnete C. F. Gauss
// Musterloesung by UvA

$z = NULL; // Zaehler
$e = 101;  // Ende

echo "Zahlen von 1 bis 100 zusammenzaehlen\n";
echo "------------------------------------\n\n";

for ($z = 1; $z <= 50; $z++) {
  $summe = ($z + ($e-$z)) * $z; // fuer das Endergebnis
  printf(" %2d + %3d = %3d\r", $z, ($e-$z), ($z + ($e-$z)));
  fgets(STDIN); // Haltepunkt
}

printf("\nGauss berechnete : %d\n", $summe);
?>