<?php
/*
Ask user to input a string.
Switch first and last char of string.
Print new string.
*/

//ask user for a string
echo("Enter a string: ");
$string = trim(fgets(STDIN));

//isolate first and last char
$first_char = $string[0];
$last_char = $string[strlen($string)-1];

//switch first and last char in $string
$nuw_string = $last_char . substr($string, 1, strlen($string)-2) . $first_char;

//print the new string
echo($nuw_string);
?>