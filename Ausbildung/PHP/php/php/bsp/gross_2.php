<?php
// gross_2.php

echo "Umwandlung von Klein- in Grossbuchstaben (2)\n";
echo "--------------------------------------------\n\n";

echo "Bitte Text eingeben : ";
$text = trim(fgets(STDIN));
echo "\n";

// -----------------------------------------------

for ($n = 0; $n < strlen($text); $n++) 
{
	$c = substr($text, $n, 1);

	if ((ord($c) >= 97) && (ord($c) <= 122)) 
	{
		$a = chr(ord($c)-32);
		echo $a;
	}
	else
	{
		echo $c;
	}
}

?>