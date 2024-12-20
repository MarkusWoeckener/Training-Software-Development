package bfw.oop;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Übernimmt die grafische Oberfläche für Ein- und Ausgabe
 */
public class Gui {
    /**
     * Stellt das Hauptmenü dar
     * @return die gewählte Option als {@code int}
     */
    public static int hauptMenu() {
	//Array mit Auswahloptionen
	String[] optionen = {"Neue Person", "Person(en) einlesen", "Beenden"};
	
	//Dialogfenster anzeigen
	int auswahl = JOptionPane.showOptionDialog(
		null,
		"Bitte wählen Sie eine Option",
		"Hauptmenü",
		JOptionPane.YES_NO_CANCEL_OPTION,
		0,
		null,
		optionen,
		null);
	return auswahl;
    }//EOM
    
    /**
     * Daten für eine neue Person eingeben<br>
     * Öffnet eine Eingabemaske um die Daten für eine neue Person eingeben zu können.<br>
     * <p>Die einzugebenden Daten sind Nach- und Vorname und die Adresse.
     * @return die eingegebenen Daten als {@code Person} Objekt
     */
    public static Person datenEingabe() {
	//Variablendeklaration
	String nachname, vorname, strasse, stadt;
	int hausNr, plz;

	//Eingabefelder definieren
	JTextField nachnameFeld = new JTextField();
	JTextField vornameFeld = new JTextField();
	JTextField strasseFeld = new JTextField();
	JTextField stadtFeld = new JTextField();
	JTextField hausNrFeld = new JTextField();
	JTextField plzFeld = new JTextField();

	//Eingabefenster-Layout erstellen
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(3,4));
	panel.add(new JLabel("Nachname:"));
	panel.add(nachnameFeld);
	panel.add(new JLabel("Vorname:"));
	panel.add(vornameFeld);
	panel.add(new JLabel("Strasse:"));
	panel.add(strasseFeld);
	panel.add(new JLabel("Hausnummer:"));
	panel.add(hausNrFeld);
	panel.add(new JLabel("Stadt:"));
	panel.add(stadtFeld);
	panel.add(new JLabel("Postleitzahl:"));
	panel.add(plzFeld);

	//Dialogfenster anzeigen
	int auswahl = JOptionPane.showConfirmDialog(
		null,
		panel,
		"Neue Person hinzufügen",
		JOptionPane.OK_CANCEL_OPTION);

	//Wenn OK, dann Werte in Variablen schreiben und neue Person zurückgeben
	if(auswahl == JOptionPane.OK_OPTION) {
	    nachname = nachnameFeld.getText();
	    vorname = vornameFeld.getText();
	    strasse = strasseFeld.getText();
	    hausNr = Integer.parseInt(hausNrFeld.getText());
	    plz = Integer.parseInt(plzFeld.getText());
	    stadt = stadtFeld.getText();
	    //Neues Person-Objekt erstellen und zurückgeben
	    return new Person(nachname, vorname, strasse, hausNr, plz, stadt);
	}
	//Wird abgebrochen, leeres Objekt zurückgeben
	return null;
    }//EOM
}//End of class
