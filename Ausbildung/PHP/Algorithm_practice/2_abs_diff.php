<?php
/*
Ask the user to input an integer n.
Calculate the absolute difference between n and 51.
If n is greater than 51 return triple the absolute difference.
*/

//ask user to input an integer
$n = readline("Enter an integer: ");

//calculate the absolute difference
$diff = abs(51 - $n);

//if n is greater than 51 return triple the absolute difference
if($n > 51){
    $diff = $diff * 3;
}

//output the result
echo($diff);
?>