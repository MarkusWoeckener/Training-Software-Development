<?php
// chf.php

/*
Programm : chf.php
Thema    : Umrechnung: Schweizer Franken/Euro
Stand    : Umrechnungsstand: 06.06.2010
Quelle   : kapitalwissen.de
Kurs     : Programmieren lernen mit PHP
Author   : Markus Woeckener
Datum    : 23.04.24
*/

echo "Waehrungsrechner\n\n";

$umrechnung = 0.662296;
$franken = 5010;
$euro = $umrechnung * $franken;

echo "Schweizer Franken : ".$franken." CHF\n";
echo "Betrag in EURO    : ".$euro." EURO\n";

?>