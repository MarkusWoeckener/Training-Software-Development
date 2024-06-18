<?php
// 01-hallo.php
$anzahl = NULL;
echo "Wie oft soll \"Hallo Welt!\" ausgegeben werden?";
$anzahl = fgets(STDIN);

for ($x = 0; $x<$anzahl; $x++)
{
echo $x.". Hallo Welt!\n";
}
?>