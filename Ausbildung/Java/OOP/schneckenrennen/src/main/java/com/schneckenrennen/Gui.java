package schneckenrennen;
import javax.swing.JOptionPane;
/**
 * Klasse die die Menüs enthält
 * @author WoeckenerM
 */
public class Gui {
    /**
     * Das Hauptmenü des Spiels
     * @return {@code int} Auswahl des Benutzers
     */
    public static int mainMenu() {
        //Array mit den Beschriftungen der Auswahlbuttons
        String[] optionen = {"Neues Rennen", "Beispielrennen", "Beenden"};
        //Dialogfenster anzeigen
        int auswahl = JOptionPane.showOptionDialog(null,
            "Willkommen bei Schneckenrennen", 
            "Hauptmenü", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            optionen, 
            optionen[0]);
        return auswahl; //Auswahl zurückgeben
    }

    /**
     * Auswhl ob ein neues oder das default Rennen erstellt wird
     * @return {@code Rennen} das neu erstellte Rennen
     * @throws Exception
     */
    static Rennen menuAuswahl(int auswahl) throws Exception{
        switch(auswahl) {
            case 0: return rennenErstellen();
            case 1: beispielRennen();
            case 2: break;
        }
        return null;
    }

    /**
     * Erstellt ein neues Rennen<br>
     * Fordert den Benutzer auf, die Daten des neuen Rennens einzugeben.
     * @return {@code Rennen} das neue Rennen
     * @throws Exception
     */
    static Rennen rennenErstellen() throws Exception{
        String name; //Name des neuen Rennens
        int strecke; //Länge des neuen Rennens

        Funktionen.clearConsole();
        System.out.println("Neues Rennen");
        System.out.print("\nName des Rennens: ");
        name = Funktionen.readString();
        System.out.print("Länge des Rennens: ");
        strecke = Funktionen.readInt();

        Rennen rennen = new Rennen(name, strecke); //Neues Rennen erzeugen
        return rennen;
    }

    /**
     * Benutzereingabe für neue Schnecken für ein Rennen
     * @param rennen {@code Rennen} Das Rennen dem die Schnecken zugefügt werden
     * @throws Exception
     */
    static void addRennschnecke(Rennen rennen) throws Exception{
        String name, rasse;
        double vMax;

        while (true) {
            //Konsole löschen
            Funktionen.clearConsole();

            //Daten für eine Schnecke eingeben
            System.out.println("Neue Schnecke hinzufügen");
            System.out.print("Name: ");
            name = Funktionen.readString();
            System.out.print("Rasse: ");
            rasse = Funktionen.readString();
            System.out.print("Höchstgeschwindigkeit: ");
            vMax = Funktionen.readDouble();

            //Schnecke dem Rennen hinzufügen
            rennen.addRennschnecke(new Rennschnecke(
                name,
                rasse,
                vMax));

            //Benutzer fragen ob noch eine Schnecke eingegeben werden soll
            System.out.print("\nNoch eine Schnecke hinzufügen (j/n)?");
            if (Funktionen.readChar() != 'j') break;
        }
    }

    /**
     * Fragt ob ein neues Wettbüro erstellt werden soll<br>
     * und erstellt es für das aktuelle Rennen
     * @param rennen {@code Rennen} für das das Büro erstellt wird
     * @return {@code Wettbuero} ein neues Wettbüro
     * @throws Exception
     */
    static Wettbuero wettbuero(Rennen rennen) throws Exception{
        Funktionen.clearConsole();
        System.out.println("Wettbuero erstellen");
        System.out.print("\nSoll ein Wettbüro erstellt werden (j/n)");
        if (Funktionen.readChar() == 'j') {
            return new Wettbuero(rennen);
        } else {
            return null;
        }
    }

    /**
     * Menü zur Eingeabe einer neuen Wette<br>
     * Gibt mit Hilfe von {@code Rennen.toString} eine Liste<br>
     * der Teilnehmenden Schnecken aus<br>
     * Speichert die Wette mit {@code Wettbüro.wetteAnnehmen}
     * @param wb {@code Wettbuero} das aktuelle Wettbüro
     * @param rennen {@ Rennen} das Rennen auf das gewettet wird
     * @throws Exception
     */
    static void wettAnnahme(Wettbuero wb, Rennen rennen) throws Exception{
        int i, wettEinsatz;
        String scheckenName, spieler;

        while (true) {
            Funktionen.clearConsole(); //Konsole löschen
            System.out.println("Wetten annehmen\n");
            rennen.getSchneckenNamen(); //Liste der Schnecken ausgeben

            //Schnecke auswählen
            System.out.print("Auf welche Schnecke soll gewettet werden: ");
            i = Funktionen.readInt() - 1;
            //Namen der ausgewählten Schnecke speichern
            scheckenName = wb.getRennId().getSchnecken().get(i).getName();
            //Wetteinsatz eingeben
            System.out.print("Wie viel soll gewettet werden: ");
            wettEinsatz = Funktionen.readInt();
            //Spielername eingeben
            System.out.print("Spielername: ");
            spieler = Funktionen.readString();

            //Die neue Wette im Wettbüro speichern
            wb.wetteAnnehmen(
                scheckenName, wettEinsatz, spieler);

            System.out.print("Noch eine Wette platzieren (j/n)? ");
            if (Funktionen.readChar() != 'j') break;
        }
    }

    /**
     * Erstellt und führt ein Beispielrennen aus.
     */
    static void beispielRennen() {
        //Schnecken erstellen
		Rennschnecke schnecke = new Rennschnecke(
            "Frieda", 
            "Weinberg", 
            3.14);
        Rennschnecke schnecke2 = new Rennschnecke(
            "Ernie", 
            "Nackt", 
            3.2);
        Rennschnecke schnecke3 = new Rennschnecke(
            "Bert", 
            "Orange", 
            3.1);
        Rennschnecke schnecke4 = new Rennschnecke(
            "Kermit", 
            "Weinberg", 
            3.16);
    
        //Rennen erstellen
        Rennen rennen = new Rennen("Test", 256);
        
        //Schnecken einem Rennen hinzufügen
        rennen.addRennschnecke(schnecke);
        rennen.addRennschnecke(schnecke2);
        rennen.addRennschnecke(schnecke3);
        rennen.addRennschnecke(schnecke4);

        //Wettbüro erstellen
        Wettbuero wb = new Wettbuero(rennen);
        
        //Wetten hinzufügen
        wb.wetteAnnehmen(
                "Ernie", 
                100, 
                "Markus");
        
        wb.wetteAnnehmen(
                "Frieda", 
                70, 
                "Spieler");
        
        wb.wetteAnnehmen(
                "Bert", 
                80, 
                "Jar Jar");
        
        //Rennen durchführen
        wb.rennenDurchfuehren();
        System.out.println(wb);
    }
}