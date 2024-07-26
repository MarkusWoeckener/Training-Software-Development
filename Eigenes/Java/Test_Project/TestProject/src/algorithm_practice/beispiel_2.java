/*
Aufgabe: Der Nutzer soll eine Zahl zwischen 0 und 10 eingeben,
die Eingabeaufforderung, bzw. Eingabe selbst wird solange wiederholt,
bis die Zahl innerhalb der vorgegebenen Grenzen liegt.

Pseudocode:

Anfang
int zahl = 0
bool bedingung = false
Wiederhole, solange bedingung = false
    Ausgabe: "Geben sie eine Zahl zwischen 0 und 10 ein:"
    Eingabe: zahl
    Wenn 0 <= zahl <= 10
        bedingung = true
    Sonst
        Ausgabe: "Die Zahl muss zwischen 0 und 10 liegen"
    Ende Wenn
Ende Wiederhole
Ausgabe: "Ihre Eingabe war: zahl"
Ende
*/


package algorithm_practice;

public class beispiel_2 {
    public static void main(String[] args) {
        int zahl = 0;
        boolean bedingung = false;
        while(!bedingung){
            System.out.print("Geben Sie eine Zahl zwischen 1 und 10 ein: ");
            zahl = Integer.parseInt(System.console().readLine());
            if (0 <= zahl && zahl <= 10){
                bedingung = true;
            }
            else{
                System.out.println("Die Zahl muss zwischen 0 und 10 liegen!");
            }
        }
        System.out.println("Ihre Eingabe war: " + zahl);
    }
}
