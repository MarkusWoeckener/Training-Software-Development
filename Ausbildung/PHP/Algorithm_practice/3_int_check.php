<?php
/*
Ask the user for two integers. Print "True" if one of them or their sum is 30
*/

//ask user for input
echo ("Enter two integers, divided by a comma:");
$input = fgets(STDIN);

//seperate input into two variables
list($int1, $int2) = explode(",", $input);

//check for the given logic and print the result
if ($int1 ==30 || $int2 == 30 || $int1 + int2 == 30) {
    echo ("True");
}
else {
    echo ("False");
}