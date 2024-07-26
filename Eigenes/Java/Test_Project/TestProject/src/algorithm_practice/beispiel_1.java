/*
Aufgabe: Zahlen von 1 bis 100 auf dem Bildschirm ausgeben
Pseudocode:
Anfang
int zahl = 0
int i = 0
wiederhole, solange i < 100
    zahl += 1
    i++
    Ausgabe:     zahl
Ende wiederhole
Ende
*/


package algorithm_practice;

public class beispiel_1 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(i+1);
        }
    }
}