<?php
// zinsen_A.php

echo "Kapital  : ";
$kapital = (float) fgets(STDIN); # Kapital eingeben  

echo "Zinssatz : ";
$zinssatz = (float) fgets(STDIN); # Zinssatz eingeben 

echo "Tage     : ";
$tage = (int) fgets(STDIN); # Nur ganze Tage eingeben

# Tageszinsformel: Zinsertrag = Kapital * Zinssatz * Tage / (100 * 360);
$ertrag = $kapital * $zinssatz * $tage / (100 * 360); # Zinsertrag ausrechnen

echo"\n"; # Jetzt eine Zeilenschaltung


printf("Zinsertrag : %0.2f Euro", $ertrag); # hier steht die printf-Anweisung
# Muster: "Zinsertrag : 18.30 Euro"

?>