<?php
// Demo.php

$gesetz = (int) 25;  // Gesetzlicher Urlaub
$normal = (int) 220; // Normale Anzahl von Arbeitstagen
$sus = (int) 5;   // Sonderurlaub für Schwerbehinderte
$behindert = false;
$urlaub = NULL;
$tage = NULL;

$zusatz_alter = NULL; // Zusatzurlaub fuer das Alter
$zusatz_sb = NULL; // Zusatzurlaub fuer die Schwerbehinderung

// -----------------------------------------------------------------------------
intro(); // Titelleiste
// -----------------------------------------------------------------------------

echo "Arbeitnehmer         : ";
$an = trim(fgets(STDIN));

echo "Lebensalter          : ";
$alter = (int) fgets(STDIN);

echo "behindert (j/n)      : ";
$behindert = trim(fgets(STDIN));

echo "\nSchichtarbeitstage   : ";
$tage = (int) fgets(STDIN);

// -----------------------------------------------------------------------------
Moment_bitte(); // Zeitschleife
// -----------------------------------------------------------------------------

// Zeile 32
$urlaub = $urlaub + $gesetz;

if ($alter >= 40) 
{
	$urlaub = $urlaub + 4;
	$zusatz_alter = 4;
}
else if ($alter >= 30) 
{
	$urlaub = $urlaub + 3;
	$zusatz_alter = 3;
}

if (strtolower($behindert) == "j") 
{
	$urlaub = $urlaub + 5;
	$zusatz_sb = 5;
}

// -----------------------------------------------------------------------------
fertig(); // Meldung nach der Berechnung
// -----------------------------------------------------------------------------

printf("Tarifvertragsurlaub  : %d Arbeitstage\n", $gesetz); 

if ($zusatz_alter > 0) 
{
	printf("Fuer das Alter       : %2d Arbeitstage\n", $zusatz_alter);
}

if ($zusatz_sb > 0) 
{
	printf("Fuer die Behinderung : %2d Arbeitstage\n", $zusatz_sb);
}
	
// ----------------------------------------------------------------

if ($tage > $normal) 
{
	$mehr = $urlaub * ($tage-$normal) / 250; // Schichtarbeitsformel
	$urlaub = $urlaub + $mehr;
	$urlaub = round($urlaub, 0);
	printf("Fuer die Mehrarbeit  : %2d Arbeitstag(e) (%0.2f)\n", round($mehr), $mehr);

	lauf("\n".$an, 150000);
	lauf(" hat einen Urlaubsanspruch von", 100000);
	printf(" %d ", $urlaub);  
	lauf("Arbeitstagen!\n\n", 150000); 
}
else 
{
	lauf("\n".$an, 150000);
	lauf(" hat einen Urlaubsanspruch von", 100000);
	printf(" %d ", $urlaub);  
	lauf("Arbeitstagen!\n\n", 150000); 
}     

// -----------------------------------------------------------------------------

Function intro() 
{
	$a = 1;
	$b = 77;

	$tempo = 15000;
	$titel = "Berechnung der Schichtarbeit ";
	$lang = strlen($titel);
	$pos = (77-$lang) / 2;

	printf("%c", 218);
	schleife(1, 77, 196, $tempo);

	echo chr(191)."\n";
	echo chr(179);

	text_zeigen(2, $pos, 32, $tempo, $titel, $lang);
	
	echo chr(179)."\n";
	echo chr(192);

	schleife(1, 77, 196, $tempo);

	echo chr(217)."\n\n";
}

// -----------------------------------------------------------------------------

Function lauf($text, $tempo) 
{
	for ($z = 0; $z <= strlen($text); $z++) 
	{
		$b = substr($text, $z, 1);
		echo $b;
		usleep($tempo * 2);
	}   
}

// ----------------------------------------------------------

Function schleife($a, $b, $strich, $tempo) 
{
	for ($a = 1; $a <= $b; $a++) 
	{
		echo chr($strich);
		usleep($tempo);
	}  
}

// ----------------------------------------------------------

Function text_zeigen($a, $p, $leer, $tempo, $titel, $lang) 
{
	for ($i = 2; $i <= $p; $i++) 
	{
		echo chr($leer);
		usleep($tempo/10); // Tempo beschleunigen
	}  

	for ($z = 0; $z <= strlen($titel); $z++) 
	{
		$b = substr($titel, $z, 1);
		echo $b;
		usleep($tempo * 3);
	}

	for ($j = ($p + $lang); $j <= 77; $j++) 
	{
		echo chr($leer);
		usleep($tempo/10);
	}
}

// ----------------------------------------------------------

Function Moment_bitte() 
{
	echo "\n\n";
	echo "Moment, ich berechne ";
	usleep(1000);  
}

// ----------------------------------------------------------

Function fertig() 
{
	echo "\r                                   \r";
	$text = "\rBerechnung abgeschlossen!";   

	for ($x = 0; $x <= strlen($text); $x++) 
	{
		$zchn = substr($text, $x, 1);
		echo $zchn;
		usleep(1000);
	}
}

?>