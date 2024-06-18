<?php
// CarTax_Ueb1.php

echo "Neupreis  : ";
$np = (int) fgets(STDIN);

echo "KfZ-Alter : ";
$alt = (int) fgets(STDIN);

$zw = alter($np, $alt); // Zeitwert
printf("Zeitwert  : %d\n", $zw);

function alter($preis, $jahre) 
{
	if ($jahre == 1)
	{
		$z = $preis * .9;
	}

	if ($jahre == 2)
	{
		$z = $preis * .75;
	}

	if ($jahre == 3)
	{
		$z = $preis * .65;
	}

	if ($jahre == 4) 
	{
		$z = $preis * .55;
	}

	if ($jahre == 5)
	{
		$z = $preis * .45;
	}

	if ($jahre > 5)
	{
		$z = $preis * .25;
	}

	return $z;
}

?>