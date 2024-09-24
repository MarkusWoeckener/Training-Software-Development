import java.io.*;

public class Zahlenschloss_3 {
    public static void main(String[] args) throws Exception{
        int[] kombination = {1, 7, 11};

        for (int i = 0; i < 3; i++) {
            if (schloss(kombination)) {
                break;
            }
        }
    }
    
    private static Boolean schloss(int[] kombination) throws Exception {
        int zahl;
        Boolean gleich = true;
        //Für jede Stelle der Kombination eine Eingabe des Benutzers anfordern
        //und prüfen. Ggf. Flag für falsche Eingabe setzen
        for (int i = 0; i < kombination.length; i++) {
            System.out.print("Geben Sie eine Zahl der Kombination ein: ");
            zahl = getInt();
            if (zahl != kombination[i]) {
                gleich = false;
            }
        }
        
        //Ausgabe des Ergebnisses nachdam alle Stellen eingegben wurden
        if (gleich) {
            System.out.println("Richtige Kombination");
        }
        else {
            System.out.println("Falsche Kombination");
        }

        return gleich;
    }

    static int getInt() throws Exception {
		//Gibt ein Integer zurüäck
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		return Integer.parseInt(tastatur.readLine());
	}
}