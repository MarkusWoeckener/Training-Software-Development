<?php
/*
Ask User for a string and an integer. The integer should be in the range of 1 to
length of the string. It indicates which character of the string is to be deleted.
Then print the editied string.
*/

//Ask user for a string
echo("Enter a string: ");
$string = trim(fgets(STDIN));

//Get the length of $string
$string_length = strlen($string);

//ask user for an integer
printf( "Enter an integer between 1 and %d: ", $string_length);
$number = ((int) trim(fgets(STDIN))) - 1;

//delete char at index of %number
$string = substr_replace($string, "", $number, 1);

//print the edited string
echo($string);
?>