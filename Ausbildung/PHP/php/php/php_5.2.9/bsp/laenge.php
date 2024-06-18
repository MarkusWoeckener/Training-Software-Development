<?php
// Laenge.php

echo "Dein Vorname bitte : ";
$vn   = trim(fgets(STDIN));
$lang = strlen($vn);

printf("\nDer Name %s hat %d Zeichen\n", $vn, $lang);

# Doppelte Klammer am Ende der nächsten Zeile
printf("Der Name %s hat %d Zeichen\n", $vn, strlen($vn));

?>
