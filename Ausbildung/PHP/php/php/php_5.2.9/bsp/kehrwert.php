<?php
// kehrwert.php

do {
  echo "Eine Zahl (1-9) : ";
  $zahl = fgets(STDIN);

  $kehrwert = 1 / $zahl;
  printf("Der Kehrwert    : %0.2f\n", $kehrwert);
  echo "\nNochmal (j/n)   : ";
  $frage = trim(fgets(STDIN));
  echo "\n";

} while ($frage == "j");

?>