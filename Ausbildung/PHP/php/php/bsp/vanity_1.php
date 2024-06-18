<?php
// Vanity_1.php

echo "Wortwahlrufnummer (Vanity)\n";
echo "--------------------------\n\n";

echo "Begriff : ";
$wort = strtolower(trim(fgets(STDIN)));
echo "Vanity  : ";

for ($z = 0; $z <= strlen($wort); $z++) 
{
	$buchstabe = substr($wort, $z, 1);

	if ($buchstabe == "a") 
	{
		$n = 2;
		echo $n;
	}

	else if ($buchstabe == "b") 
	{
		$n = 2;
		echo $n;
	}  

	else if ($buchstabe == "c") 
	{
		$n = 2;
		echo $n;
	}

	else if ($buchstabe == "d") 
	{
		$n = 3;
		echo $n;
	}  

	else if ($buchstabe == "e") 
	{
		$n = 3;
		echo $n;
	}

	else if ($buchstabe == "f") 
	{
		$n = 3;
		echo $n;
	}  

	else if ($buchstabe == "g") 
	{
		$n = 4;
		echo $n;
	}

	else if ($buchstabe == "h") 
	{
		$n = 4;
		echo $n;
	}  

	else if ($buchstabe == "i") 
	{
		$n = 4;
		echo $n;
	}

	else if ($buchstabe == "j") 
	{
		$n = 5;
		echo $n;
	}  

	else if ($buchstabe == "k") 
	{
		$n = 5;
		echo $n;
	}

	else if ($buchstabe == "l") 
	{
		$n = 5;
		echo $n;
	}  

	else if ($buchstabe == "m") 
	{
		$n = 6;
		echo $n;
	}

	else if ($buchstabe == "n") 
	{
		$n = 6;
		echo $n;
	}  

	else if ($buchstabe == "o") 
	{
		$n = 6;
		echo $n;
	}

	else if ($buchstabe == "p") 
	{
		$n = 7;
		echo $n;
	}  

	else if ($buchstabe == "q") 
	{
		$n = 7;
		echo $n;
	}

	else if ($buchstabe == "r") 
	{
		$n = 7;
		echo $n;
	}

	else if ($buchstabe == "s") 
	{
		$n = 7;
		echo $n;
	}  

	else if ($buchstabe == "t") 
	{
		$n = 8;
		echo $n;
	}

	else if ($buchstabe == "u") 
	{
		$n = 8;
		echo $n;
	}  

	else if ($buchstabe == "v") 
	{
		$n = 8;
		echo $n;
	}

	else if ($buchstabe == "w") 
	{
		$n = 9;
		echo $n;
	}  

	else if ($buchstabe == "x") 
	{
		$n = 9;
		echo $n;
	}

	else if ($buchstabe == "y") 
	{
		$n = 9;
		echo $n;
	}  

	else if ($buchstabe == "z") 
	{
		$n = 9;
		echo $n;
	}

} // Schleifenende

?>