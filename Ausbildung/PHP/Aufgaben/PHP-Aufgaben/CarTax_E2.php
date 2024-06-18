<?php
// CarTax_E2.php

/*
Korrigieren Sie den kleinen logischen Fehler
und starten Sie das Programm mit den Werten:
Neupreis : 30.000
KfZ-Alter: 5 Jahre
*/

echo "Der Neupreis   : ";
$np = (int) fgets(STDIN);

echo "Das KfZ-Alter  : ";
$alt = (int) fgets(STDIN);

$zw = alter($alt, $np); // Zeitwert
printf("Neuer Zeitwert : %d\n", $zw);

// ---------------------------------

function alter($jahre, $np) { //die Attribute waren vertauscht

  switch ($jahre) {
    case 1  : return $np * .9;
    case 2  : return $np * .75;
    case 3  : return $np * .65;
    case 4  : return $np * .55;
    case 5  : return $np * .45;
    case 6  : return $np * .35;
    case 7  : return $np * .25;
    case 8  : return $np * .15;
    case 9  : return $np * .1;
    case 10 : return $np * .075;
  }

    if ($jahre > 10) {
      return $np * 0.05;
    }

}

?>