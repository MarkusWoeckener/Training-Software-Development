<?php
// wahl_ueb.php
/*
Name: Markus Woeckener
Datum: 07.05.2024
*/

$tempo  = 200000;
$balken = chr(219);

echo "Ergebnis der Partei-1 : ";
$p1 = (int) fgets(STDIN);
echo "Ergebnis der Partei-2 : ";
$p2 = (int) fgets(STDIN);
echo "Ergebnis der Partei-3 : ";
$p3 = (int) fgets(STDIN);

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

echo "Partei-2  ";
for ($n = 1; $n <= $p2; $n++) 
{
	echo $balken;
	usleep(20000);
}

echo "\n\n";

echo "Partei-3  ";
for ($n = 1; $n <= $p3; $n++) 
{
	echo $balken;
	usleep(20000);
}

echo "\n\n";

?>