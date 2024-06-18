<?php
// vorname_3.php

echo "Dein Vorname bitte : ";
$vn   = trim(fgets(STDIN));
$lang = strlen($vn);

  if ($lang > 7) {
    printf("\nDer Name %s ist ein langer Name.\n", $vn);
  }

  elseif ($lang < 7) {
    printf("\nDer Name %s ist ein kurzer Name.\n", $vn);
  }

  else {
    printf("\nDer Name %s hat 7 Buchstaben.\n", $vn);
  }

?>
