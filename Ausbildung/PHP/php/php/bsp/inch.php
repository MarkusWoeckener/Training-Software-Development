<?php
// inch.php

echo "\tUmrechnung von Zentimeter/Zoll\n";
echo "\t------------------------------\n\n";

echo "cm-Wert : ";
$cm = fgets(STDIN);

$inch = $cm / 2.54;
echo "In Zoll : ".$inch;

#  Vervollständigen Sie die letzte Zeile (18) folgendermaßen: 
#  Formatstring: Breite 0, 1 Nachkommastelle, Datentyp "float"
#  Zeilenwechsel hinter dem Formatstring.
#  Korrekte Variable hinter dem Komma

// printf("\nIn Zoll :  ", );

?>