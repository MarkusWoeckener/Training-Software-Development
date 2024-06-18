<?php
// brutto_netto.php

DEFINE ("STEUER", 19);
DEFINE ("NL","\n");
DEFINE ("TAB","\t");

echo TAB."Nettobetrag ermitteln".NL;
echo TAB."---------------------".NL.NL;

echo "Bitte den Bruttobetrag : ";
$brutto = (double) fgets(STDIN);

$mwst  = $brutto / (100 + STEUER) * STEUER;
$netto = $brutto - $mwst;

echo NL;
echo "Bruttobetrag   : ".$brutto.NL;
echo "Mehrwertsteuer : ".$mwst.NL;
echo "Nettobetrag    : ".$netto.NL;

echo "     \\ \$ \r\x41";
?>