<?php
// strafe_3.php
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

echo"Welcher Satz:";
$satz = trim(fgets(STDIN));
echo"Wie oft    :";
$oft = (int) fgets(STDIN);

  for ($z = 1; $z <= $oft; $z++) {
    printf("%2d. %s\n", $z, $satz);
  }

?>