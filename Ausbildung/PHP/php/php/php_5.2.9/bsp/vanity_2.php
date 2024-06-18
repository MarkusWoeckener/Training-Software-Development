<?php
// Vanity_2.php

echo "Wortwahlrufnummer (Vanity)\n";
echo "--------------------------\n\n";

echo "Begriff : ";
$wort = strtolower(trim(fgets(STDIN)));
echo "Vanity  : ";

  for ($z = 0; $z < strlen($wort); $z++) {
     $zeichen = substr($wort, $z, 1);
     echo ziffer($zeichen);
  }

echo "\n";

// -----------------------------------------------

function ziffer($buchstabe) {

  if ($buchstabe <= "c")
    return 2;
  if ($buchstabe <= "f")
    return 3;
  if ($buchstabe <= "i")
    return 4;
  if ($buchstabe <= "l")
    return 5;
  if ($buchstabe <= "o")
    return 6;
  if ($buchstabe <= "s")
    return 7;
  if ($buchstabe <= "v")
    return 8;
  if ($buchstabe <= "z")
    return 9;
  else 
    return 0;
}

?>
