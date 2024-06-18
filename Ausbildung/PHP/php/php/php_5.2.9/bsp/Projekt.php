<?php
// Projekt_CarTax.php
// Author :
// Datum  :

// -----------------------------------------------------------------------------

echo "Projekt \"CarTax\" (KfZ-Wertermittlung)\n";
echo "-------------------------------------\n\n";

echo "Aktueller Neupreis  : ";
$np = (int) fgets(STDIN);
echo "\n";

echo "KfZ-Alter           : ";
$alt = (int) fgets(STDIN);

$zw  = alter($alt, $np);
meldung($zw);

echo "Gefahrene Kilometer : ";
$km  = (int) fgets(STDIN);
$zw  = kilometer($km, $alt, $zw);
meldung($zw);

echo "Anzahl Besitzer     : ";
$halter = (int) fgets(STDIN);
$zw  = halter($halter, $zw);
meldung($zw);

echo "Modellwechsel (0-5) : ";
$modelle = (int) fgets(STDIN);
// $zw  = modelle(2 Parameter);
meldung($zw);

echo "Inspektion (j/n)    : ";
$ja_nein = trim(strtolower(fgets(STDIN)));
// $zw  = inspektion(2 Parameter);
meldung($zw);

echo "Zustand (1-5)       : ";
$zustand = (int) fgets(STDIN);
// $zw = zustand(2 Parameter);
meldung($zw);

echo "Zubehoer in Euro    : ";
$zubehoer = (int) fgets(STDIN);
// $zw  = zubehoer(2 Parameter);
meldung($zw);

// -----------------------------------------------------------------------------

function meldung($zeitwert) {
  printf("Neuer Zeitwert      : %d\n\n", $zeitwert);
}

// -----------------------------------------------------------------------------

function alter($jahre, $np) {

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

// -----------------------------------------------------------------------------

function kilometer($km, $alt, $zeitwert) {

$jkm = $km / $alt; // Jahreskilometer

   if ($jkm <= 15000) {
     $zeitwert = $zeitwert * 1;
   }

   elseif ($jkm <= 20000) {
     $zeitwert = $zeitwert * 0.90;
   }

   elseif ($jkm <= 25000) {
     $zeitwert = $zeitwert * 0.85;
   }

   elseif ($jkm <= 30000) {
     $zeitwert = $zeitwert * 0.80;
   }

   elseif ($jkm <= 35000) {
     $zeitwert = $zeitwert * 0.75;
   }

   elseif ($jkm <= 40000) {
     $zeitwert = $zeitwert * 0.70;
   }

   elseif ($jkm <= 45000) {
     $zeitwert = $zeitwert * 0.65;
   }

   elseif ($jkm <= 50000) {
     $zeitwert = $zeitwert * 0.60;
   }

   else 
     $zeitwert = $zeitwert * 0.50;

return $zeitwert;

}

// -----------------------------------------------------------------------------

/*
Funktion halter

Es werden übergeben:

1. Anzahl der Besitzer 
2. Der aktuelle Zeitwert

1 Halter = $zw * 1
2 Halter = $zw * 0.95
3 Halter = $zw * 0.9
4 Halter = $zw * 0.85
5 Halter = $zw * 0.7
6 Halter = $zw * 0.55

Rückgabe

*/

// -----------------------------------------------------------------------------

/*
Funktion modelle

Es werden übergeben:
1. Anzahl der Modellwechsel 
2. Der aktuelle Zeitwert


1 Wechsel = Zeitwert * .95
2 Wechsel = Zeitwert * .9
3 Wechsel = Zeitwert * .85
4 Wechsel = Zeitwert * .8
5 Wechsel = Zeitwert * .75

Beachten Sie, dass sich der Zeitwert
nicht ändert, wenn es keinen Modellwechsel gab.

0 Wechsel = Zeitwert = Zeitwert

Rückgabe

*/

// -----------------------------------------------------------------------------

/*
Funktion inspektion

Es werden übergeben:
1. "j" oder "n"
2. Der Zeitwert 

Berechnung:

Bei regelmäßiger Inspektion:
Zeitwert * 1.15 (Der Wert steigt!!)

ansonsten:
Zeitwert * 0.9

Rückgabe

/*

// -----------------------------------------------------------------------------

/*
Funktion zustand

Es werden übergeben:
1. Eine ganzzahlige Note (1-5) für den Zustand
2. Der Zeitwert

Note 1 = Zeitwert * 1
Note 2 = Zeitwert * .9
Note 3 = Zeitwert * .8
Note 4 = Zeitwert * .7
Note 5 = Zeitwert * .6

Rückgabe

/*

// -----------------------------------------------------------------------------

/*
Funktion zubehoer

- Wenn
Extras (z. B. Stereoanlage, Navigation) vorhanden sind, 

- dann 
erhöht sich der Zeitwert um den Preis, der für diese Extras bezahlt worden ist.

- Sonst
bleibt es beim übergebenen Zeitwert.

Rückgabe

*/

// -----------------------------------------------------------------------------

printf("Neuwagenpreis       : %d\n", $np);
printf("Aktueller Zeitwert  : %d\n", $zeitwert);
printf("Wertverlust         : %0.2f %s", 100-($zeitwert / $np * 100), "%");

// -----------------------------------------------------------------------------

?>




