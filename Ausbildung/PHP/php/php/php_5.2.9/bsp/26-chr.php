<?php
// chr_2.php

echo "Bitte geben Sie den Startwert ein:";
$start = (int)fgets(STDIN);
echo "Bitte geben Sie den Endwert ein:";
$ende = (int)fgets(STDIN);

for ($n = $start; $n <= $ende; $n++) {
     printf("Position %3d = %c (%xh)\n", $n, $n, $n);
}

echo ord("a");

?> 

