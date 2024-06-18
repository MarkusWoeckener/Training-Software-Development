<?php
// krypt_ueb.php

echo "Buchstabe-alt : "; // Beispiel "A"
$b = trim(fgets(STDIN));

echo "Schluessel    : "; // Beispiel 5
$s = (int) fgets(STDIN);

$c = ord($b) + $s;
echo "Buchstabe-neu : ".chr($c); // Beispiel "F"

?> 

