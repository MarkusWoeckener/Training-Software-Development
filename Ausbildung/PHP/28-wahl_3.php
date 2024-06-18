<?php
// wahl_2.php
// Musterloesung by UvA
/*
Name: Markus Woeckener
Datum: 07.05.2024
*/

echo "Ergebnis Partei-1 : ";
$p1 = fgets(STDIN);

echo "Ergebnis Partei-2 : ";
$p2 = fgets(STDIN);

echo "Ergebnis Partei-3 : ";
$p3 = fgets(STDIN);

echo "\n\n";

// ---------------------------------

echo "H o c h r e c h n u n g\n";
echo "-----------------------\n\n";

partei("Partei-1", $p1);
partei("Partei-2", $p2);
partei("Partei-3", $p3);

// ---------------------------------

function partei($name, $p) 
{
	$balken = chr(219);

	printf("%s : ", $name);

	for ($n = 1; $n <= $p; $n++) 
	{
		echo $balken;
		usleep(20000);
	}

	//echo "\n\n";
    zeige_prozent($p);
}

function zeige_prozent($pw)
{
    printf(" %2d %%\n\n", $pw);
}

?>