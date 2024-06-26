<?php
/*
script that asks for input of two integers and returns the sum if the integers
are different. If they are the same, it returns the sum * 3.
Input format is a, b
Output format is a single number
*/

//Ask user for input
echo("Enter two integers devided by comma (a, b):");
$input = trim(fgets(STDIN));

//seperate input into two variables
list($a, $b) = explode(",", $input);

//convert to int
$a = intval($a);
$b = intval($b);

//calculate sum
$sum = $a + $b;

//triple sum if a, b are equal
if ($a == $b) {
    $sum = $sum * 3;
}

//print sum
echo($sum);

?>