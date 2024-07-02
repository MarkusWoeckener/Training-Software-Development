<?php
/*
Ask user for an integer. If the integer is within a range of +-10 around 100
and 200 print "True".
*/

# Ask user for input
$number = readline("Enter a number: ");

# Check if $number is within one of the given ranges
if ((90 <= $number && $number <= 110) || (190 <= $number && $number <= 210)) {
    echo "True";
} 
else {
    echo "False";
}