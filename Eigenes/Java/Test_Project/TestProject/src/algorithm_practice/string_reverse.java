/*
Anfang
    Ausgabe: "Geben Sie eine Zeichenkette ein:"
    Eingabe: zeichenkette
    String umgekehrteZeichenkette = ""
    Für i von Länge(zeichenkette) - 1 bis 0 Schrittweite -1
        umgekehrteZeichenkette += zeichenkette[i]
    Ende Für
    Ausgabe: umgekehrteZeichenkette
Ende
*/

package algorithm_practice;

public class string_reverse {
    public static void main(String[] args) {
        System.out.print("Gib eine Zeichenkette ein: ");
        String eingabe = System.console().readLine();
        String umgekehrteEingabe = "";
        for (int i = eingabe.length() - 1; i >= 0; i--){
            umgekehrteEingabe += eingabe.charAt(i);
        }
        System.out.println(umgekehrteEingabe);
    }
}
