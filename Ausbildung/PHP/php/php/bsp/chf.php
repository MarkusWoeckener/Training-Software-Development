<?php
// chf.php

echo "Waehrungsrechner\n\n";

$umrechnung = 0.662296;
$franken = 379.15;
$euro = $umrechnung * $franken;

echo "Schweizer Franken : ".$franken."CHF\n";
echo "Betrag in EURO    : ".$euro."EURO\n";

?>