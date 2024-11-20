package schneckenrennen;

/**
 * Main-Klasse des Projektes Schneckenrennen
 * @author WoeckenerM 
 */
public class Main {
	/**
	 * Main Methode des Programms
	 * @param args {@code String[]} Befehlszeilenargumente
	 */
	public static void main(String[] args) throws Exception{
		Ui.mainMenu();
		Rennen rennen = Ui.menuAuswahl();
		if (rennen != null) {
			Ui.addRennschnecke(rennen);
			Wettbuero wb = Ui.wettbuero(rennen);
			//ToDo Wetten annehmen wenn Wettbüro vorhanden
			Ui.wettAnnahme(wb);
			//ToDo Rennen durchführen
		}
	}
}