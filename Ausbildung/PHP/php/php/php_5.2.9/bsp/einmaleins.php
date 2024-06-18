<?php
// einmaleins.php

$n = 1;
$s = NULL;

echo "Welches Einmaleins : ";
$z = (int) fgets(STDIN);

  while ($n <= 10) {
    $s = $z * $n;
    echo $s." ";
    $n++;
  }

?> 
