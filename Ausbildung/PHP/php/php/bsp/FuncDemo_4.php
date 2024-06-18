<?php
// FuncDemo_4.php

echo "BFW\n";
linie(5, "-");
linie(10, "*");
linie(15, "=");

function linie($wieoft, $was) 
{
	for ($z = 1; $z <= $wieoft; $z++) 
	{
		echo $was;
	}
	echo "\n";
}

?>