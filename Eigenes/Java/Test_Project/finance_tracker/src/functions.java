import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class functions {
    public static void neueBuchung(Scanner scanner){
        ui.clearConsole();
        
        //Datum eingeben, tagesaktuelles Datum als Standardwert
        System.out.print("Datum eingeben (yyyy-mm-dd): ");
        String datum = scanner.nextLine();
        //Aktuelles Datum als Standardwert bei leerer Eingabe
        if (datum.isEmpty()) {
            datum = java.time.LocalDate.now().toString();
        }

        //Art der Buchung (Einnahme oder Ausgabe)
        char art;
        while(true){
            System.out.print("Art der Buchung: Ausgabe oder Einnahme (A/E): ");
            art = Character.toLowerCase(scanner.nextLine().charAt(0));
            //Eingabe des Users prüfen und ggf. Fehlermeldung ausgeben
            if(art != 'a' && art != 'e') {
                System.out.println("Ungülitige Eingabe. Bitte (A) für Ausgabe oder (E) für Einnahme eingeben.");
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
        //Betrag für Ausgaben bei Bedarf in einen negativen Wert wandeln
        if (betrag > 0 && art == 'a') {
            betrag = -betrag;
        }

        //Daten an eine CSV Datei anhängen und speichern
        try (FileWriter csvWriter = new FileWriter("buchungen.csv", true)) {
            File csvFile = new File("buchungen.csv");
            //Prüfen ob die Datei existiert. Wenn nicht, Datei erstellen und Header schreiben
            if (!csvFile.exists() || csvFile.length() == 0) {
                csvWriter.write("Datum,Art,Kategorie,Betrag\n");
            }
            //Neue Buchung zur CSV hinzufügen
            csvWriter.write(datum + "," + art + "," + kategorie + "," + betrag + "\n");
            System.out.println("Buchung erfolgreich gespeichert.");
        }
        catch (IOException e) {
            System.out.println("Fehler beim Speichern der Buchung: " + e.getMessage());
        }
    }

    public static void visualisierung(){
        String csvFile = "buchungen.csv";
        String line;
        String splitBy = ",";
        
        ui.clearConsole();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null){
                String[] data = line.split(splitBy);
                System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3]);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Einlesen der Buchungen: " + e.getMessage());
            }

    }
}
