<?php
/*
Ask user for a string. Check if the string starts with "if "
When the string starts with "if ", print the original string.
If not, add "if " to the start of the string and print the new string.
*/

//get user input
echo "Enter a string: ";
$text = trim(fgets(STDIN));

//check if string starts with "if "
if (substr($text, 0, 3) != "if ") {
    //add "if " to the start of the string if missing
    $text = "if " . $text;
}

//print the new string
echo $text;