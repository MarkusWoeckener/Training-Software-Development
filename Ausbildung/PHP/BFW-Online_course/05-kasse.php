<?php
// kasse.php
#  Zeilenumbruch einbauen

$rechnung = 17.78;  // Datentyp: double (float, real)
$gegeben  = 20;

$zurueck  = $gegeben-$rechnung;

echo "Rechnungsbetrag : ".$rechnung."\n";
echo "Gegeben         : ".$gegeben;
echo "\nSie bekommen    : ".$zurueck;
echo "\n";
?>