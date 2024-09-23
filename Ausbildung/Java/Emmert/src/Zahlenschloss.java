import java.io.*;

public class Zahlenschloss {
    public static void main(String[] args) throws Exception{
        int[] kombination = {1, 7, 11};
        int[] eingabe = new int[kombination.length];
        int zahl;
        Boolean gleich = true;

        //Für jede Stelle der Kombination eine Eingabe des Benutzers anfordern
        //Eingaben in einem Array speichern
        for (int i = 0; i < kombination.length; i++) {
            System.out.print("Geben Sie eine Zahl der Kombination ein: ");
            zahl = getInt();
            eingabe[i] = zahl;
        }
        
        //Eingabe mit Kombination vergleichen
        for (int i = 0; i < kombination.length; i++) {
            if (kombination[i] != eingabe[i]) {
                gleich = false;
                break;
            }
        }

        //Ausgabe des Ergebnisses
        if (gleich) {
            System.out.println("Richtige Kombination");
        }
        else {
            System.out.println("Falsche Kombination");
        }
    }

    static int getInt() throws Exception {
		//Gibt ein Integer zurüäck
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		return Integer.parseInt(tastatur.readLine());
	}
}
