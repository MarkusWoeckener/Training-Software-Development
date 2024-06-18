<?php
// anagramm_A.php

/*
Programmieraufgabe. Das unten stehende Programm
gibt ein eingegebenes Wort rueckwaerts aus.
Bauen Sie das Programm um und verwenden Sie anstelle der
While-Schleife die FOR-Schleife. Ausserdem sollen die
einzelnen Buchstaben des Wortes untereinander stehen.

Probieren Sie das Programm mit dem Wort: "lexikon" aus.
*/

echo "Bitte ein Wort eingeben : ";
$wort = trim(fgets(STDIN));
$z = strlen($wort);

/* alte Schleife
  while ($z >= 0) {
    $b = substr($wort, $z, 1);
    echo $b;
    $z = $z - 1;
  }
  */
  
  //neue Schleife:
  for ($n = strlen($wort); $n >= 0; $n--)
  {
  	$c = substr($wort, $n, 1);
  	echo $c."\n";
  }

?>