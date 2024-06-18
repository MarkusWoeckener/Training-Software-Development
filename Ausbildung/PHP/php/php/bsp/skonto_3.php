<?php
echo "Rechnung    : ";$betrag 
=(double)fgets(STDIN);echo 
"Skontofrist : ";
$tage=(int)fgets(STDIN);if(!($tage>0))
{$skontosatz=0;}if 
($tage<=10){$skontosatz= 
4;}elseif($tage<=30)
{$skontosatz=2.25;}else$skontosatz=0;
$skontobetrag=$betrag*$skontosatz
/100;$bezahlen=$betrag 
-$skontobetrag;echo"\n";echo
"Sie bezahlen  : ".$bezahlen.
" Euro\n";echo "Skonto in %   : ".
$skontosatz." %"."\n";
echo "Sonto in Euro : $skontobetrag"." Euro\n";

?>