/*
Anfang
    int zufallszahl = Zufallszahl(1, 100)
    int eingabe = 0
    bool erraten = false
    Wiederhole solange erraten = false
        Ausgabe: "Rate eine Zahl zwischen 1 und 100:"
        Eingabe: eingabe
        Wenn eingabe < zufallszahl
            Ausgabe: "Die Zahl ist zu niedrig."
        Sonst wenn eingabe > zufallszahl
            Ausgabe: "Die Zahl ist zu hoch."
        Sonst
            erraten = true
            Ausgabe: "Richtig geraten!"
        Ende Wenn
    Ende Wiederhole
Ende
*/

package algorithm_practice;

public class zahlenraten {
    public static void main(String[] args) {
        int zufallszahl = (int)(Math.random() * 100) + 1;
        int eingabe = 0;
        boolean erraten = false;
        while(!erraten){
            System.out.print("Rate eine Zahl zwischen 1 und 100: ");
            eingabe = Integer.parseInt(System.console().readLine());
            if(eingabe < zufallszahl){
                System.out.println("Die Zahl ist zu niedrig.");
            }
            else if(eingabe > zufallszahl){
                System.out.println("Die Zahl ist zu hoch.");
            }
            else{
                erraten = true;
                System.out.println("Richtig geraten!");
            }
        }
    }
}
