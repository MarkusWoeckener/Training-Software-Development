package schneckenrennen;

/**
 * Klasse die das Menü enthält
 * @author WoeckenerM
 */
public class Ui {
    /**
     * Das Hauptmenü des Spiels
     * @throws Exception
     */
    public static void mainMenu() throws Exception{
        System.out.println("Willkommen bei Schneckenrennen\n");
        System.out.println("Hauptmenu\n");
        System.out.println("1: Neues Rennen erstellen");
        System.out.println("2: Beispielrennen starten");
        System.out.println("0: Beenden");
        System.out.print("\nBitte wählen: ");
    }

    /**
     * Auswhl ob ein neues oder das default Rennen erstellt wird
     * @return {@code Rennen} das neu erstellte Rennen
     * @throws Exception
     */
    static Rennen menuAuswahl() throws Exception{
        switch(Funktionen.readInt()) {
            case 1: return rennenErstellen();
            case 2: beispielRennen();
            case 0: break;
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
        String name;
        int strecke;

        System.out.println("Neues Rennen");
        System.out.print("Name des Rennens: ");
        name = Funktionen.readString();
        System.out.print("Länge des Rennens: ");
        strecke = Funktionen.readInt();

        Rennen rennen = new Rennen(name, strecke);
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
            System.out.println("Neue Schnecke hinzufügen");
            System.out.print("name: ");
            name = Funktionen.readString();
            System.out.print("rasse: ");
            rasse = Funktionen.readString();
            System.out.print("Höchstgeschwindigkeit: ");
            vMax = Funktionen.readDouble();
            rennen.addRennschnecke(new Rennschnecke(name, rasse, vMax));
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
        System.out.println("Wettbuero erstellen");
        System.out.print("\nSoll ein Wettbüro erstellt werden (j/n)");
        if (Funktionen.readChar() == 'j') {
            return new Wettbuero(rennen);
        } else {
            return null;
        }
    }

    static void wettAnnahme(Wettbuero wb) throws Exception{
        //To be implemented
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
