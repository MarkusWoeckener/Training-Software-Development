# Übungsaufgaben zu Array-Variablen

## Übungsaufgabe 1:
Erstellen Sie einen Programmablaufplan/Struktogramm oder alternativ Pseudocode für folgende Problemstellung:
Schreiben Sie ein Programm, das die Eingabe von 5 Buchstaben erwartet. Speichern Sie diese Buchstaben in einem Array. Die Buchstaben werden danach in der eingegebenen Reihenfolge auf dem Bildschirm ausgegeben.

Pseudocode:
```
Anfang
char[5] buchstaben
Für int i = 0 bis i < 5 (Schrittweite 1) wiederhole
  Ausgabe: "Gib einen Buchstaben ein: "
  Eingabe: buchstaben[i]
Ende Wiederhole
Für int j = 0 bis j < 5 (Schrittweite i) wiederhole
  Ausgabe: buchstaben[j]
Ende Wiederhole
Ende
```

## Übungsaufgabe 2:
Erstellen Sie einen Programmablaufplan, ein Struktogramm oder alternativ den Pseudocode für folgendes Programm: Es wird die Eingabe von 3 ganzen Zahlen erwartet. Die Zahlen sollen daraufhin in umgekehrter Reihenfolge wieder ausgegeben werden.

Pseudocode:
```
Anfang
int[3] zahlen
Für int i = 0 bis i < 3 (Schrittweite 1) wiederhole
  Ausgabe: "Gib eine Ganzzahl ein: "
  Eingabe: zahlen[i]
Ende Wiederhole
Für int j = 2 bis 0 (Schrittweite -1) wiederhole
  Ausgabe: Zahlen[j]
Ende Wiederhole
Ende
```

## Übungsaufgabe 3:
Statt einfachen Zählschleifen ist es auch möglich, Schleifen mit anderen Abbruchbedingungen zu konstruieren. Entwickeln Sie ein Programm, das die Eingabe von ganzen Zahlen erwartet. Sobald eine 0 eingegeben wird, werden die bisher eingegeben Zahlen in umgekehrter Reihenfolge wieder ausgegeben. Erstellen Sie den zugehörigen Programmablaufplan und das Struktogramm, bzw. alternativ Pseudocode.

Pseudocode:
```
Anfang
int[] zahlen
int zahl
int n = 0

Wwiederhole
  Ausgabe: "Gib eine Ganzzahl ein: "
  Eingabe zahl
  Wenn zahl != 0 dann
    zahlen[n] = zahl
    n++
  Ende Wenn
Solange zahl != 0
Ende Wiederhole
Für int i = zahlen.length bis 0 --i wiederhole
  Ausgabe: zahlen[i]
Ende Wiederhole
Ende
```

## Übungsaufgabe 4:
Erstellen Sie einen Programmablaufplan, ein Struktogramm oder den Pseudocode für folgendes Programm: Es wird die Eingabe von ganzen Zahlen erwartet. Sobald eine 0 eingegeben wird, ist die Eingabe beendet. Daraufhin wird 
Die 1. Zahl ausgegeben
Die Summe der 1. und 2. Zahl ausgegeben
Die Summe der 1. und 2. und 3. Zahl ausgegeben

und so weiter, bis zum Schluss die Summe aller Zahlen ausgegeben wird. Danach ist das Programm beendet.

Pseodocode:
```
Anfang
int[] zahlen
int zahl
int summe
int n = 0

wiederhole
  Ausgabe: "Gib eine Ganzzahl ein: "
  Eingabe zahl
  Wenn zahl != 0 dann
    zahlen[n] = zahl
    n++
  Ende Wenn
Solange zahl != 0
Ende Wiederhole
Für int i = 0 bis i < n (Schrittweite 1) wiederhole
  Ausgabe: zahlen[i]
Ende Wiederhole
Für int j = 0 bis j < n (Schrittweite 1) wiederhole
  summe = 0
  Für int k = 0 bis j (Schrittweite 1) wiederhole
    summe += zahlen[k]
  Ende Wiederhole
  Ausgabe: summe
Ende Wiederhole
Ende
```

## Übungsaufgabe 5:
Erstellen Sie einen Programmablaufplan, ein Struktogramm oder den Pseudocode für folgendes Programm: Es wird die Eingabe von ganzen Zahlen erwartet. Sobald eine 0 eingegeben wird, ist die Eingabe beendet. Daraufhin werden die Zahlen aufsteigend sortiert und am Bildschirm ausgegeben. Danach ist das Programm beendet.

Pseodocode:

Anfang
int[] zahlen
int zahl, temp
int n = 0

Solange Wahr wiederhole

wiederhole
  Ausgabe: "Geben Sie eine Ganzzahl ein: "
  Eingabe zahl
  Wenn zahl != 0 dann
    zahlen[n] = zahl
    i++
  Ende Wenn
Solange zahl != 0
Ende Wiederhole