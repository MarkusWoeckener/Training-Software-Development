package schneckenrennen;

import javax.swing.*;
import java.awt.*;

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
        return JOptionPane.showOptionDialog(
            null,
            "Willkommen bei Schneckenrennen\n"
                + "Was möchten Sie tun?", 
            "Hauptmenü", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            optionen, 
            optionen[0]);
    }

    /**
     * Auswhl ob ein neues oder das default Rennen erstellt wird
     * @return {@code Rennen} das neu erstellte Rennen
     */
    static Rennen menuAuswahl(int auswahl) {
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
     */
    static Rennen rennenErstellen() {
        //Variablendeklaration
        String name;
        int strecke;
        //Eingabefelder instanziieren
        JTextField nameFeld = new JTextField();
        JTextField streckeFeld = new JTextField();

        //Layout des Eingabedialogs erstellen
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Name des Rennens: "));
        panel.add(nameFeld);
        panel.add(new JLabel("Länge des Rennens: "));
        panel.add(streckeFeld);

        //Dialogfenster anzeigen
        int auswahl = JOptionPane.showConfirmDialog(
            null, 
            panel, 
            "Neues Rennen", 
            JOptionPane.OK_CANCEL_OPTION);

        //Wenn OK gedrückt wird Daten in den Variablen speichern
        if (auswahl == JOptionPane.OK_OPTION) {
            name = nameFeld.getText();
            strecke = Integer.parseInt(streckeFeld.getText());
        }
        //oder NULL zurückgeben
        else return null;

        Rennen rennen = new Rennen(name, strecke); //Neues Rennen erzeugen
        return rennen;
    }


    /**
     * Benutzereingabe für neue Schnecken für ein Rennen
     * @param rennen {@code Rennen} Das Rennen dem die Schnecken zugefügt werden
     */
    static void addRennschnecke(Rennen rennen) {
        //Variablendeklaration
        String name, rasse;
        double vMax;
        //Array mit den Beschriftungen der Auswahlbuttons
        String[] optionen = {"Speichern", "Abbrechen"};
        //Eingabefelder instanziieren
        JTextField nameFeld = new JTextField();
        JTextField rasseFeld = new JTextField();
        JTextField vMaxFeld = new JTextField();

        //Layout des Eingabedialogs erstellen
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Name"));
        panel.add(nameFeld);
        panel.add(new JLabel("Rasse"));
        panel.add(rasseFeld);
        panel.add(new JLabel("Höchstgeschwindigkeit"));
        panel.add(vMaxFeld);

        while(true) {
            //Dialogfenster anzeigen
            int auswahl = JOptionPane.showOptionDialog(
                null, 
                panel, 
                "Neue Schnecke hinzufügen", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                optionen, 
                null);

            if(auswahl == JOptionPane.OK_OPTION) {
                name = nameFeld.getText();
                rasse = rasseFeld.getText();
                vMax = Double.parseDouble(vMaxFeld.getText());
                rennen.addRennschnecke(new Rennschnecke(name, rasse, vMax));
            }
            else break;

            //Abfrage ob weitere Schnecke eingegeben werden soll
            int weiter = JOptionPane.showConfirmDialog(null, 
            "Noch eine Schnecke hinzufügen=", "Weitere Schnecke", JOptionPane.YES_NO_OPTION);
            if(weiter == JOptionPane.NO_OPTION) break;
        }
    }

    /**
     * Fragt ob ein neues Wettbüro erstellt werden soll<br>
     * und erstellt es für das aktuelle Rennen
     * @param rennen {@code Rennen} für das das Büro erstellt wird
     * @return {@code Wettbuero} ein neues Wettbüro
     */
    static Wettbuero wettbuero(Rennen rennen) {
        int auswahl = JOptionPane.showConfirmDialog(
            null, 
            "Soll ein Wettbüro erstellt werden?", 
            "Wettbüro erstellen", 
            JOptionPane.YES_NO_OPTION);
        if(auswahl == JOptionPane.YES_OPTION) {
            return new Wettbuero(rennen);
        }
        else return null;
    }

    //TODO Ab hier die Methoden zu JOptionPane umwandeln:
    
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