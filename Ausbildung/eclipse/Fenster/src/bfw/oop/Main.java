
package bfw.oop;

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
    }//EOM

}//End of Class