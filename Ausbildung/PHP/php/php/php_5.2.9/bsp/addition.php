<?php
// addition.php
// Zahlen von 1 bis 20 zusammenzaehlen

$zahl  = NULL; $summe = NULL;

  do {
    $zahl++;
    $summe = $summe + $zahl;
    echo $summe."\n";
  } while ($zahl < 20);

printf("\nSumme der Zahlen bis 20 : %d", $summe);

?>
