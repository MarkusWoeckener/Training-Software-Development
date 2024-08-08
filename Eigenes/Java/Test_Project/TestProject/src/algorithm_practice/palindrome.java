/*
 Aufgabe: Palindrom-Prüfung
 
 Pseudocode:

Anfang
Ausgabe: "Geben Sie ein Wort ein:"
Eingabe: wort
String umgekehrtesWort = ""
Für i von Länge(wort) - 1 bis 0 Schrittweite -1
    umgekehrtesWort += wort[i]
Ende Für
Wenn wort == umgekehrtesWort
    Ausgabe: "Das Wort ist ein Palindrom."
Sonst
    Ausgabe: "Das Wort ist kein Palindrom."
Ende Wenn
Ende
 */

package algorithm_practice;

public class palindrome {
    public static void main(String[] args) {
        String wort = "";
        String umgekehrtesWort = "";
        
        System.out.print("Gib ein Wort ein: ");
        wort = System.console().readLine();

        for(int i = wort.length() - 1; i >= 0; i--){
            umgekehrtesWort += wort.charAt(i);
        }
        System.out.println(wort + ", " + umgekehrtesWort);
        if(wort.equals(umgekehrtesWort)){
            System.out.println(wort + " ist ein Palindrom.");
        }
        else{
            System.out.println(wort + " ist kein Palindrom.");
        }
    }
}
