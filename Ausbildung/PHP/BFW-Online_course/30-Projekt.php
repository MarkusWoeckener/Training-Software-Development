<?php
// Projekt_CarTax.php
// Author : Markus Woeckener
// Datum  : Stand 14.05.2024

echo "Projekt \"CarTax\" (KfZ-Wertermittlung)\n";
echo "-------------------------------------\n\n";

echo "Aktueller Neupreis  : ";
$np = (int) fgets(STDIN);
echo "\n";

echo "KfZ-Alter           : ";
$alt = (int) fgets(STDIN);

$zw = alter($alt, $np);
meldung($zw);

echo "Gefahrene Kilometer : ";
$km = (int) fgets(STDIN);
$zw = kilometer($km, $alt, $zw);
meldung($zw);

echo "Anzahl Besitzer     : ";
$halter = (int) fgets(STDIN);
$zw = halter($halter, $zw);
meldung($zw);

echo "Modellwechsel (0-5) : ";
$modelle = (int) fgets(STDIN);
$zw  = modelle($modelle, $zw);
meldung($zw);

echo "Inspektion (j/n)    : ";
$ja_nein = trim(strtolower(fgets(STDIN)));
$zw  = inspektion($ja_nein, $zw);
meldung($zw);

echo "Zustand (1-5)       : ";
$zustand = (int) fgets(STDIN);
$zw = zustand($zustand, $zw);
meldung($zw);

echo "Zubehoer in Euro    : ";
$zubehoer = (int) fgets(STDIN);
$zw  = zubehoer($zubehoer, $zw);
meldung($zw);

// -----------------------------------------------------------------------------

function meldung($zeitwert) 
{
	printf("Neuer Zeitwert      : %d\n\n", $zeitwert);
}

// -----------------------------------------------------------------------------

function alter($jahre, $np) 
{
	switch ($jahre) 
	{
		case 1:
			return $np * 0.9;

		case 2:
			return $np * 0.75;

		case 3:
			return $np * 0.65;

		case 4:
			return $np * 0.55;

		case 5:
			return $np * 0.45;

		case 6:
			return $np * 0.35;

		case 7:
			return $np * 0.25;

		case 8:
			return $np * 0.15;

		case 9:
			return $np * 0.1;

		case 10:
			return $np * 0.075;
	}

	if ($jahre > 10) 
	{
		return $np * 0.05;
	}
}

// -----------------------------------------------------------------------------

function kilometer($km, $alt, $zeitwert) 
{
	$jkm = $km / $alt; // Jahreskilometer berechnen

	if ($jkm <= 15000) 
	{
		return $zeitwert * 1;
	}

	elseif ($jkm <= 20000) 
	{
		return $zeitwert * 0.90;
	}

	elseif ($jkm <= 25000) 
	{
		return $zeitwert * 0.85;
	}

	elseif ($jkm <= 30000) 
	{
		return $zeitwert * 0.80;
	}

	elseif ($jkm <= 35000) 
	{
		return $zeitwert * 0.75;
	}

	elseif ($jkm <= 40000) 
	{
		return $zeitwert * 0.70;
	}

	elseif ($jkm <= 45000) 
	{
		return $zeitwert * 0.65;
	}

	elseif ($jkm <= 50000) 
	{
		return $zeitwert * 0.60;
	}

	else 
	{
		return $zeitwert * 0.50;
	}
}

// -----------------------------------------------------------------------------


function halter($halter, $zeitwert)
{
    switch ($halter)
    {
        case 1: 
            return $zeitwert * 1;

        case 2:
            return $zeitwert * 0.95;

        case 3:
            return $zeitwert * 0.9;

        case 4:
            return $zeitwert * 0.85;

        case 5:
            return $zeitwert * 0.7;

        case 6:
            return $zeitwert * 0.55;

        default:
            return $zeitwert * 0.5;
    }
}


// -----------------------------------------------------------------------------

function modelle($modelle, $zeitwert)
{
    switch ($modelle)
    {
        case 1:
            return $zeitwert * 0.95;

        case 2:
            return $zeitwert * 0.9;

        case 3:
            return $zeitwert * 0.85;

        case 4:
            return $zeitwert * 0.8;

        case 5:
            return $zeitwert * 0.75;

        case 0:
            return $zeitwert;
    }
}


// -----------------------------------------------------------------------------

function inspektion($ja_nein, $zeitwert)
{
	if ($ja_nein == "j")
	{
		return $zeitwert * 1.15;
	}
	
	else
	{
		return $zeitwert * 0.9;
	}
}

// -----------------------------------------------------------------------------

function zustand($zustand, $zeitwert)
{
	switch ($zustand)
	{
		case 1:
			return $zeitwert * 1;
		
		case 2:
			return $zeitwert * 0.9;

		case 3:
			return $zeitwert * 0.8;

		case 4:
			return $zeitwert * 0.7;

		case 5:
			return $zeitwert * 0.6;
	}

}

// -----------------------------------------------------------------------------

function zubehoer($zubehoer, $zeitwert)
{
	if ($zeitwert > 0)
	{
		return $zeitwert + $zubehoer;
	}
	
	else
	{
		return $zeitwert;
	}
}

// -----------------------------------------------------------------------------

printf("Neuwagenpreis       : %d\n", $np);
printf("Aktueller Zeitwert  : %d\n", $zw);
printf("Wertverlust         : %d %s", 100-($zw / $np * 100), "%");

// -----------------------------------------------------------------------------

?>




