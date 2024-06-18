<?php
// bereiche_err.php

echo "Bitte Zahl eingeben : "; 
$z = (int) fgets(STDIN);

  if  (($z > 0 AND $z <= 100) OR ($z == 200 AND $z <= 300)) {
    printf("Die Zahl %d ist im richtigen Bereich!\n", $z);
  }    

  else {
    printf("Falscher Bereich!\n");
  }

?>
