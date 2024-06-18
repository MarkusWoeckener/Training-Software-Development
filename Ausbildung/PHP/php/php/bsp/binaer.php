<?php
// binaer.php
// Darstellung von ausgew�hlten ASCII-Zeichen in bin/hex/ASCII

echo "Beginn bei ASCII-Position (Vorschlag: 65) : ";
$a = trim(fgets(STDIN));

echo "Ende bei ASCII-Position   (Vorschlag: 90) : ";
$e = trim(fgets(STDIN));

for ($i = $a; $i <= $e; $i++) 
{
	printf("Pos : %d\tbin : %b\thex : %X\tASCII : %c\n", $i, $i, $i, $i);
}

?>