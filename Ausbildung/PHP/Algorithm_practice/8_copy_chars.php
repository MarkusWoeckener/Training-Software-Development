<?php
/*
Ask the user for a string
If the string is at least 2 chars long, take the first two, copy them in a new string
four times and print the new string. If the length is < 2, print the original string.
*/

//Ask the user for a string
echo("Enter a string:");
$string = readline();

//Print origianl string if length < 2
if (strlen($string) < 2) {
    echo $string;
}
//if string is longer, copy the first two chars 4 times and print the new string
else {
    $result = str_repeat(substr($string, 0, 2), 4);
    echo $result;
}

?>