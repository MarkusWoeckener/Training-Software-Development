<?php
// FuncDemo_3.php

echo "BFW\n";
linie(5);
linie(10);
linie(15);

function linie($wieoft) 
{
	for ($z = 0; $z <= $wieoft; $z++) 
	{
		echo "-";
	}

	echo "\n";
}  

?>