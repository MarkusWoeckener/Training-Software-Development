<?php
// schicht_err.php // mod: 26.12.2010 by UvA
// Das Programm ist inhaltlich mit Demo.php identisch
// Es beeinhaltet einen kleinen logischen Fehler

$gesetz       = (int) 25;
$normal       = (int) 220;
$sus          = (int) 5;
$behindert    = false;
$urlaub       = NULL;
$tage         = NULL;

$zusatz_alter = NULL; // Zusatzurlaub fuer das Alter
$zusatz_sb    = NULL; // Zusatzurlaub fuer die Schwerbehinderung

// -----------------------------------------------------------------------------
// Die Module zur Programm-Optik wurde hier weggelassen
// -----------------------------------------------------------------------------

echo "\tSchichtarbeitsberechnung\n";
echo "\t------------------------\n\n";

echo "Arbeitnehmer         : ";
$an = "Helga Mustermann";
echo $an."\n";

echo "Lebensalter          : ";
$alter = 42;
echo $alter."\n";

echo "behindert (j/n)      : ";
$behindert = "j";
echo $behindert."\n";

echo "\nSchichtarbeitstage   : ";
$tage = (int) fgets(STDIN);

// -----------------------------------------------------------------------------

$urlaub = $urlaub + $gesetz;

   if ($alter >= 40) {
      $urlaub = $urlaub + 4;
      $zusatz_alter = 4;
   }

   if ($alter >= 30) {
      $urlaub = $urlaub + 3;
      $zusatz_alter = 3;
   }

   if (strtolower($behindert) == "j") {
      $urlaub = $urlaub + 5;
      $zusatz_sb = 5;
   }

// -----------------------------------------------------------------------------

printf("\nTarifvertragsurlaub  : %2d Arbeitstage\n", $gesetz); 
   if ($zusatz_alter > 0) {
      printf("Fuer das Alter       : %2d Arbeitstage\n", $zusatz_alter);
   }
   if ($zusatz_sb > 0) {
      printf("Fuer die Behinderung : %2d Arbeitstage\n", $zusatz_sb);
   }
   
// -----------------------------------------------------------------------------

   if ($tage > $normal) {
      $mehr = $urlaub * ($tage-$normal) / 250; // Schichtarbeitsformel
      $urlaub = $urlaub + $mehr;
      $urlaub = round($urlaub, 0);
      printf("Fuer die Mehrarbeit  : %2d Arbeitstag(e) (%0.2f)\n", round($mehr), $mehr);
      printf("\n$an hat einen Urlaubsanspruch von %d Arbeitstagen.\n", $urlaub);
   }

   else {
      printf("\n$an hat einen Urlaubsanspruch von %d Arbeitstagen.\n", $urlaub);
   }   

?>