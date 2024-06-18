<?php
// chr_2.php
/*
Name: Markus Woeckener
Datum: 07.05.2024
*/

//Start- und Endposition abfragen
echo"Startposition: ";
$start = (int) fgets(STDIN);
echo"Endposition: ";
$end = (int) fgets(STDIN);

//ASCII Zeichen ausgeben
for ($n = $start; $n <= $end; $n++) 
{
	printf("Position %3d = %c\t(%2Xh)\n", $n, $n, $n); //Position Hex-Zahl macht komische Sachen
}    

?>