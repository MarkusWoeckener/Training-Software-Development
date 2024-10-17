import java.io.*;
/**
 * @author Markus Woeckener
 */
public class Quersumme {
    public static void main(String[] args) throws Exception{
        aufgabeA();
        aufgabeB();
        aufgabeC();
    }

    static void aufgabeA() throws Exception {
        /**Berechnet die Quersumme der eingegebneen Zahl */
        int zahl;
        int quersumme;
        zahl = eingabeZahl();
        quersumme = berechneQuersumme(zahl);
        ausgabeQuersumme(quersumme);
    }

    static void aufgabeB() {
        /**Gibt alle Zahlen zwischen 1 und 1000 aus, deren Quersumme 15 ist*/
        System.out.println("Die Zahlen zwischen 1 und 1000, deren Quersumme 15 ist:");
        for (int i = 1; i <= 1000; i++) {
            if (berechneQuersumme(i) == 15) {
                System.out.println(i);
            }
        }
    }

    static void aufgabeC() {
        /**Gibt die Zahlen zwischen 1 und 1000 aus, deren Quersumme
         * ein Vielfaches von 7 ist.
         */
        for (int i = 1; i <= 1000; i++) {
            if (berechneQuersumme(i) % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    static int eingabeZahl() throws Exception{
        /**Fordert den Benutzer auf eine Zahl einzugeben
         * Gibt die eingegebene Zahl zurück
         */
        int zahl;
        System.out.print("Geben Sie eine Zahl ein: ");
        try {
            zahl = getInt();
        } catch (NumberFormatException e) {
            System.out.println("Ungültige Eingabe: " + e.getMessage());
            return 0;
        }
        return zahl;
    }

    static int berechneQuersumme(int zahl) {
        /**Berechnet die Quersumme einer Zahl
         * Gibt die Quersumme zurück
         */
        int quersumme = 0;
        while (zahl > 0) {
            quersumme += zahl % 10;
            zahl /= 10;
        }
        return quersumme;
    }
    
    static void ausgabeQuersumme(int quersumme) {
        System.out.println("Die Quersumme ist: " + quersumme);
    }

    static int getInt() throws Exception {
		/**Nutzt den BufferedReader um die Eingabe des Benutzers zu lesen
         * Eingabe wird als Integer geparsed
         * Gibt ein Integer zurüäck
		 */
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		return Integer.parseInt(tastatur.readLine());
	}

}
