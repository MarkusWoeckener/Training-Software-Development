import java.util.Scanner;

public class ui {
    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        int auswahl;
        Boolean gueltigeEingabe;

        do {
            gueltigeEingabe = true;
            // Hauptmenü anzeigen
            clearConsole();
            System.out.println("Hauptmenü");
            System.out.println("1: Neue Buchung eingeben");
            System.out.println("2: Buchungen anzeigen");
            System.out.println("3: Beenden");
            System.out.print("Wählen Sie eine Option: ");
            
            // Eingabe der Auswahl durch User
            auswahl = scanner.nextInt();
            scanner.nextLine();

            // Aufrufen der Untermenüs
            switch(auswahl){
                case 1:
                    // Neue Buchung eingeben
                    eingabeNeueBuchung(scanner);
                    break;
                case 2:
                    // Buchungen anzeigen
                    ausgabeBuchungen(scanner);
                    break;
                case 3:
                    // Beenden
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
                    gueltigeEingabe = false;
            }
        } while (!gueltigeEingabe);
        scanner.close();
    }

    public static void eingabeNeueBuchung(Scanner scanner){
        char auswahl;
        do {
            clearConsole();
            auswahl = 'n';
            System.out.println("Neue Buchung eingeben");
            functions.neueBuchung(scanner);
            do {
                System.out.print("Noch eine Buchung eingeben (j/n)? ");
                auswahl = Character.toLowerCase(scanner.nextLine().charAt(0));
            } while (auswahl != 'j' && auswahl != 'n');
        } while (auswahl == 'j');
        if (auswahl == 'n') {
            mainMenu();
        }
        return;
    }

    public static void ausgabeBuchungen(Scanner scanner){
        /**
         * Gibt die gespeicherten Buchungen und die Summe der
         * Buchungen aus.
        */

        char auswahl; //Variable für das Untermenü

        clearConsole(); //Konsole löschen
        System.out.println("Buchungen anzeigen");
        functions.visualisierung();
        functions.summeBuchungen();
        do {
            System.out.print("\nZum [H]auptmenü oder [B]eenden: ");
            auswahl = Character.toLowerCase(scanner.nextLine().charAt(0));
        } while (auswahl != 'h' && auswahl != 'b');
        if (auswahl == 'h') {
            mainMenu();
        }
        return;

    }

    public static void clearConsole() {
        /**
         * Lösche die Konsole
         */
        System.out.print("\033[H\033[2J");
        System.out.flush(); //Ausgabe sofort an die Konsole schicken
    }
    
}
