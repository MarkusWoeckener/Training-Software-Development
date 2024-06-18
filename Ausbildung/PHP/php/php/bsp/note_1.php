<?php
// note_1.php
// Das Weglassen der geschweiften Klammern ist zulaessig,
// da es nur jeweils eine Anweisung gibt.

echo "Bitte geben Sie Ihre Note ein : ";
$note = fgets(STDIN);

if ($note == 1)
{
	echo "sehr gut";
}

if ($note == 2)
{
	echo "gut";
}

if ($note == 3)
{
	echo "befriedigend";
}

if ($note == 4)
{
	echo "ausreichend";
}

if ($note == 5)
{
	echo "mangelhaft";
}

if ($note == 6)
{
	echo "ungenuegend";
}

if ($note <= 0)
{
	echo "Es wurde keine Note eingegeben!";
}

?>