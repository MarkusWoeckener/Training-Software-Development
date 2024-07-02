<?php
/*
Ask the user for a string.
Take the last character of the string and add it to the beginning and end
of the string. Print the result.
*/

//ask user for a string
$string = readLine("Enter a string: ");

//extract last char of $string
$lastChar = substr($string, -1, 1);

//print the result
echo $lastChar . $string . $lastChar;

?>
