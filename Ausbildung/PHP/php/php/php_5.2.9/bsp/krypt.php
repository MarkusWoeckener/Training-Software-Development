<?php
// krypt.php

echo "Krypt 1.0 - Programm zur Verschluesselung\n";
echo "-----------------------------------------\n\n";

echo "Text eingeben : ";
$text = trim(fgets(STDIN));

echo "Schluessel    : ";
$s = (int) fgets(STDIN);
echo "\n";

for ($n = 0; $n < strlen($text); $n++) {
     $c = substr($text, $n, 1);
     $a = chr(ord($c) + $s);
         
     usleep(10000);

     echo $a;
}

echo "\n";

// -----------------------------------------------

function pause() {
$tempo = 200000;

  for ($i =0; $i <= $tempo; $i++) {
  } 
}

// -----------------------------------------------

?>