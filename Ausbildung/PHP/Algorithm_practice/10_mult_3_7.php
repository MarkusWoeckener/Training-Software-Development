<?php
/*
Ask the user for a positive number.
Check if the number is a multiple of 3 or 7.
Print True or False as answer.
*/

//ask user for a positive number
while (true) {
    echo("Enter a positive number:");
    $number = trim(fgets(STDIN));
    if ($number > 0) {
        break;
    }
    echo("Please enter a positive number.\n");
}

//check if the number is a multiple of 3 or 7
if ($number % 3 == 0 || $number % 7 == 0) {
    echo("True\n");
} else {
    echo("False\n");
}

?>