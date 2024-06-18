<?php
// CarTax_Ueb2.php
// Funktion "kilometer" schreiben

echo "Neupreis  : ";
$np = (int) fgets(STDIN);

echo "KfZ-Alter : ";
$alt = (int) fgets(STDIN);
$zw  = alter($np, $alt);
echo $zw."\n\n";

// echo "Kilometer : ";
// $km  = (int) fgets(STDIN);
// $zw  = kilometer(3 Parameter übergeben)

// ------------------------------

function alter($np, $jahre) {

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

// ------------------------------

/*
Funktion kilometer

Drei Werte kommen vom Hauptprogramm:
- Alter
- Kilometer
- Der aktuelle Zeitwert

Sie müssen zunächst die Jahreskilometer berechnen!
$jkm = Kilometer / Alter

Fallunterscheidung:

wenn 
  ($jkm <= 15.000)
    $z = Zeitwert * 1
wenn
  ($jkm <= 20.000)
    $z = Zeitwert * 0.9;

wenn fortführen mit folgenden Werten:
bis 25.000 (0.85)
bis 30.000 (0.80)
bis 35.000 (0.75)
bis 40.000 (0.70)
bis 45.000 (0.65)
bis 50.000 (0.60)

über 50.000 Jahreskilometer
  $z = Zeitwert * 0.50

Wert an die rufende Stelle zurückgeben

*/


?>