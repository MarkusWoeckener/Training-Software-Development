import java.io.*;
import java.time.*;

public class Alter {
    public static void main(String[] args) throws Exception {
        //Variablendeklaration
        String name;
        Period alter;
        int[] geburtstag = new int[3];

        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        name = getString();

        geburtstag = getGeburtstag();
        alter = getAlter(geburtstag);

        System.out.println("Hallo " + name + ", hier Ihr Alter in verschiednen Formaten:");
        System.out.println("Jahre: " + alter.getYears());
        System.out.println("Tage: : " + alter.getDays());
        System.out.println("Stunden: " + alter.getDays() * 24);
        System.out.println("Minuten: " + alter.getDays() * 24 * 60);
        System.out.println("Sekunden: " + alter.getDays() * 24 * 60 * 60);
    }

    static int[] getGeburtstag() throws Exception {
        int[] geburtstag = new int[3];

        System.out.println("Geben Sie bitte Ihren Geburtstag ein:");
        System.out.print("Jahr (yyyy): ");
        geburtstag[0] = getInt();
        System.out.print("Monat (mm): ");
        geburtstag[1] = getInt();
        System.out.print("Tag (dd): ");
        geburtstag[2] = getInt();

        return geburtstag;
    }

    static Period getAlter(int[] geburtstag) {
        LocalDate bday = LocalDate.of(geburtstag[0], geburtstag[1], geburtstag[2]);
        LocalDate heute = LocalDate.now();
        
        Period alter = Period.between(bday, heute);

        return alter;
    }

    //Hilfsfunktionen
    static String getString() throws Exception{
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
        return tastatur.readLine();
    }

    static int getInt() throws Exception{
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(tastatur.readLine());
    }
}
