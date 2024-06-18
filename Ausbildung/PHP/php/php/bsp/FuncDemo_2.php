<?php
// FuncDemo_2.php

echo "BFW\n";
linie();
linie();

// ---------------------------------

function linie() 
{
	for ($n = 0; $n <= 30; $n++) 
	{
		echo "-";
		usleep(1000);
	}

	echo "\n";
}  

?>