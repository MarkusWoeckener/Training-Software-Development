<?php
$wort = "ein neger mit gazelle zagt im regen nie";
//echo strrev($wort);
for($i = strlen($wort); $i >= 0; $i = $i-=2)
{
	echo substr($wort, $i, 1);
}
?>