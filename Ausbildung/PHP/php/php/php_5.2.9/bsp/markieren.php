<?php
// markieren.php

echo "Bitte Text eingeben : \n";
$text = trim(fgets(STDIN));

  for ($n = 1; $n <= strlen($text); $n++) {
    echo "-" ;
  }

echo "\n";
?>