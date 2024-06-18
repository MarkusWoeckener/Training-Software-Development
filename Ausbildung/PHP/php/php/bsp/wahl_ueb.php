<?php
// wahl_ueb.php

$tempo  = 200000;
$balken = chr(219);

echo "Ergebnis der Partei-1 : ";
$p1 = (int) fgets(STDIN);

echo "\n\n";

// --------------------------------------

echo "H o c h r e c h n u n g\n";
echo "-----------------------\n\n";

echo "Partei-1  ";
for ($n = 1; $n <= $p1; $n++) 
{
	echo $balken;
	usleep(20000);
}

echo "\n\n";

?>