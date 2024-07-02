<?php
//25-spiegel.php
/*
Name: Markus Woeckener
Datum: 30.04.24
*/

//Variablendifinition
$wort = (string) NULL;

//Eingabeaufforderung
echo"Gib ein Wort ein: ";
$wort = trim(fgets(STDIN));

//Schleife
for($x = strlen($wort); $x >= 0; $x--){
    $zchn = substr($wort, $x, 1);
    echo $zchn;
}

?>