<?php
// zeugnis.php

DEFINE ("E1", "Die Leistung war professionell");
DEFINE ("E2", "Die Leistung war gut");
DEFINE ("E3", "Die Leistung war befriedigend");
DEFINE ("E4", "Die Leistung war ausreichend");
DEFINE ("E5", "Die Leistung war mangelhaft");
DEFINE ("E6", "Die Leistung war ungenuegend");

echo "Die Punktzahl (max. 100) bitte : ";
$punkte = (int) fgets(STDIN);

if (($punkte <= 100) && ($punkte >= 87)) 
{
	echo E1; 
	echo "\n";
}
	
if (($punkte < 87) && ($punkte >= 67)) 
{
	echo E2; 
	echo "\n";
}

if (($punkte < 67) && ($punkte >= 50)) 
{
	echo E3; 
	echo "\n";
}

if (($punkte < 50) && ($punkte >= 33)) 
{
	echo E4; 
	echo "\n";
}

if (($punkte < 33) && ($punkte >= 22)) 
{
	echo E5; 
	echo "\n";
}

if (($punkte < 22) && ($punkte >= 0)) 
{
	echo E6; 
	echo "\n";
}

?>