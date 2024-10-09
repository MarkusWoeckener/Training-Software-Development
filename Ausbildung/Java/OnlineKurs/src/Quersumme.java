import java.io.*;

public class Quersumme {
    public static void main(String[] args) throws Exception{
        //Variablendeklaration
        int zahl, quersumme;
        
        zahl = eingabeZahl();
        quersumme = berechneQuersumme(zahl);
        ausgabeQuersumme(quersumme);
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
