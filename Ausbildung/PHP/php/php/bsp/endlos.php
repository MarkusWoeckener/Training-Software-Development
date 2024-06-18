<?php
// endlos.php

$i = 1;
	
while ($i <= 10) 
{
	printf("%d Ich darf nicht luegen\n", $i);
	$i++;

	if ($i == 10) 
	{
		$i = $i-3;
	}
}

?>