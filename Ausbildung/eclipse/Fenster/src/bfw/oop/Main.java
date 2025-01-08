
package bfw.oop;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
	//Hauptmenü aufrufen
	int auswahl = Gui.hauptMenu();
	//Bei Auswahl "Neue Person eingeben"
	if(auswahl == JOptionPane.OK_OPTION) {
	    Person person = Gui.datenEingabe();
	    Datei.schreiben(person);	    
	}
	if(auswahl == JOptionPane.NO_OPTION) {
	    List<Person> personen = Datei.datenLesen();
	    Gui.datenAnzeigen(personen);
	}
    }//EOM

}//End of Class