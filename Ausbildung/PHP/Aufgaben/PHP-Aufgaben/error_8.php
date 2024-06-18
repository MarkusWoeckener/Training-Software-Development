<?php
// error_8.php
# Die Funktion "mitte()" wird dreimal aufgerufen

echo "Text \(z. B. BFW Wuerzburg\) eingeben : ";
$t = trim(fgets(STDIN));

echo mitte($t, 10);
echo "\n";
echo mitte($t, 20);
echo "\n";
echo mitte($t, 30);

// ---------------------------------------

function mitte($text, $rr) 
{
  $lang = strlen($text);
  $pos = ($rr-$lang) / 2;

  for ($n = 0; $n <= $pos; $n ++) 
  {
    echo " ";
  }
  return $text;
}

?>