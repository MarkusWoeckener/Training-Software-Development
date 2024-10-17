import java.io.*;

public class Zahlenschloss_3 {
    public static void main(String[] args) throws Exception{
        int[] kombination = {1, 7, 11}; //Gesuchte Kombination
        int versuche = 3; //Anzahl der erlaubten Versuche

        for (int i = 0; i < versuche; i++) {
            if (schloss(kombination)) {
                System.out.println("Richtige Kombination");
                break;
            }
            else {
                System.out.println("Falsche Kombination");
            }
        }

    }
    
    private static boolean schloss(int[] kombination) throws Exception {
        int zahl;
        boolean gleich = true;

        //Für jede Stelle der Kombination eine Eingabe des Benutzers anfordern
        //und prüfen. Ggf. Flag für falsche Eingabe setzen
        for (int i = 0; i < kombination.length; i++) {
            System.out.print("Geben Sie eine Zahl der Kombination ein: ");
            zahl = getInt();
            if (zahl != kombination[i]) {
                gleich = false;
            }
        }
        return gleich; //Flag zurückgeben, ob richtige Kombination
    }

    static int getInt() throws Exception {
		//Gibt ein Integer zurück
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
        
        return Integer.parseInt(tastatur.readLine());
    }
}