<?php
// CarTax_Ueb2.php
// Funktion "kilometer" schreiben
/*
Name: Markus Woeckener
Datum: 07.05.2024
*/

echo "Neupreis  : ";
$np = (int) fgets(STDIN);

echo "KfZ-Alter : ";
$alt = (int) fgets(STDIN);
$zw  = alter($np, $alt);
//echo $zw."\n\n";

echo "Kilometer : ";
$km  = (int) fgets(STDIN);
$zw  = kilometer($alt, $km, $zw);
echo "Zeitwert: ".$zw."\n\n";

// ------------------------------

function alter($np, $jahre) 
{
	switch ($jahre) 
	{
		case 1  : 
			return $np * .9;

		case 2  : 
			return $np * .75;

		case 3  : 
			return $np * .65;

		case 4  : 
			return $np * .55;

		case 5  : 
			return $np * .45;

		case 6  : 
			return $np * .35;

		case 7  : 
			return $np * .25;

		case 8  : 
			return $np * .15;

		case 9  : 
			return $np * .1;

		case 10 : 
			return $np * .075;
	}

	if ($jahre > 10) 
	{
		return $np * 0.05;
	}
}

function kilometer($alt, $km, $zw)
{
    //Jahreskilometer berechnen
    $jkm = $km / $alt;
    
    //Zeitwert nach Jahreskilometer anpassen
    if ($jkm <= 15000)
	{
        return $zw * 1;
    }

    if ($jkm <= 20000)
	{
        return $zw * 0.9;
    }

    if ($jkm <= 25000)
    {
        return $zw * 0.85;
    }

    if ($jkm <= 30000)
    {
        return $zw * 0.80;
    }

    if ($jkm <= 35000)
    {
        return $zw * 0.75;
    }

    if ($jkm <= 40000)
    {
        return $zw * 0.70;
    }

    if ($jkm <= 45000)
    {
        return $zw * 0.65;
    }

    if ($jkm <= 50000)
    {
        return $zw * 0.60;
    }

    if ($jkm > 50000)
	{
        return $zw * 0.50;
    }

}

?>