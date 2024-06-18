<?php
// vorname_3.php

echo "Dein Vorname bitte : ";
$vn   = trim(fgets(STDIN));
$lang = strlen($vn);

 if ($lang > 7) {
   printf("\nDer Name %s ist lang.\n", $vn);
 }
 elseif ($lang < 7) {
   printf("\nDer Name %s ist kurz\n", $vn);
 }
 else {
   printf("\nDer Name hat 7 Buchstaben\n");
 }

?>