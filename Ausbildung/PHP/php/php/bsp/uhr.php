<?php
// uhr.php

for ($h = 0; $h <= 23; $h++) 
{
	for ($m = 0; $m <= 59; $m++) 
	{
		for ($s = 0; $s <= 59; $s++) 
		{
			printf("%02d:%02d:%02d\r", $h, $m, $s);
			sleep(1);
		}
	}
}

?>