<?php
// note_2.php

echo "Bitte geben Sie Ihre Note ein : ";
$schulnote = fgets(STDIN);

  switch ($schulnote) {
    case 1 : echo "sehr gut";
      break;
    case 2 : echo "gut";
      break;
    case 3 : echo "befriedigend";
      break;
    case 4 : echo "ausreichend";
      break;
    case 5 : echo "mangelhaft";
      break;
    case 6 : echo "ungenuegend";
      break;
    default: echo "Keine Note eingegeben!";
      break;
}

echo "\n";
?>
