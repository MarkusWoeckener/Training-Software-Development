<?php

/*
Programm : chf.php
Thema    : Umrechnung: Schweizer Franken/Euro
Stand    : Umrechnungsstand: 06.06.2010
Quelle   : www.kapitalwissen.de
Kurs     : Erste Programmierschritte in PHP
Author   : 
Datum    : 
*/

// -----------------------------------------------
echo "Waehrungsrechner\n\n";

$umrechnung = 0.662296;
$franken    = 379.15;
$euro       = $umrechnung * $franken;

// ----------------------------------------------
#  Aufgabe: formatierte Ausgabe mit printf()

echo "Schweizer Franken : ".$franken."CHF\n";
echo "Betrag in EURO    : ".$euro."EURO\n";
?>