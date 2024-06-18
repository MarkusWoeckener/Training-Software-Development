<?php
// kasse.php
#  Zeilenumbruch einbauen

$rechnung = 17.78;  // Datentyp: double (float, real)
$gegeben  = 20;

$zurueck  = $gegeben-$rechnung;

echo "Rechnungsbetrag : ".$rechnung;
echo "\nGegeben         : ".$gegeben;
echo "\nSie bekommen    : ".$zurueck;

?>
