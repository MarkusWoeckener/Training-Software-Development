import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class functions {
    public static void neueBuchung(Scanner scanner){
        ui.clearConsole();
        System.out.println("Diese Funktion wird noch nicht implementiert!");
        /*
         * ToDo:
         * Eingabe von Datum, Einnahme/Ausgabe, Kategorie und Betrag
         * Speichern der Daten in einer CSV Datei
         */
        //Scanner scanner = new Scanner(System.in);

        //Datum eingeben, tagesaktuelles Datum als Standardwert
        System.out.print("Datum eingeben (yyyy-mm-dd): ");
        String datum = scanner.nextLine();
        if (datum.isEmpty()) {
            datum = java.time.LocalDate.now().toString();
        }

        //Art der Buchung (Einnahme oder Ausgabe)
        char art;
        while(true){
            System.out.print("Art der Buchung: Ausgabe oder Einnahme (A/E): ");
            art = Character.toLowerCase(scanner.nextLine().charAt(0));
            if(art != 'a' && art != 'e') {
                System.out.println("Ungülitige Eingabe. Bitte erneut versuchen");
            }
            else {
                break;
            }
        }
        
        //Kategorie eingeben
        System.out.print("Gib eine Kategorie für die Buchung ein: ");
        String kategorie = scanner.nextLine();

        //Betrag eingeben
        System.out.print("Gib den Betrag für die Buchung ein: ");
        double betrag = scanner.nextDouble();
        scanner.nextLine();
        if (betrag > 0 && art == 'a') {
            betrag = -betrag;
        }

        //Daten an eine CSV Datei anhängen und speichern
        try (FileWriter csvWriter = new FileWriter("buchungen.csv", true)) {
            File csvFile = new File("buchungen.csv");
            if (!csvFile.exists() || csvFile.length() == 0) {
                csvWriter.write("Datum,Art,Kategorie,Betrag\n");
            }
            csvWriter.write(datum + "," + art + "," + kategorie + "," + betrag + "\n");
            System.out.println("Buchung erfolgreich gespeichert.");
        }
        catch (IOException e) {
            System.out.println("Fehler beim Speichern der Buchung: " + e.getMessage());
        }

        //scanner.close();
    }

    public static void visualisierung(){
        ui.clearConsole();
        System.out.println("Diese Funktion wird noch nicht implementiert!");
        /*
         * ToDo:
         * Einlesen der gespeicherten Buchungen aus der CSV Datei
         * Darstellen der Daten in einer Tabelle
         */
        

    }
}
