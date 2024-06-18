<?php
// laufschrift.php

$text = "Berechnung abgeschlossen! Das ist eine Demonstration";

  for ($x = 0; $x <= strlen($text); $x++) {
    $zchn = substr($text, $x, 1);
    echo $zchn;
    sleep(1);
  }

?>