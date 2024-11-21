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
			if (wb != null) Ui.wettAnnahme(wb, rennen);
			//ToDo Rennen durchführen
			startRennen(rennen, wb);
		}
	}

	static void startRennen(Rennen rennen, Wettbuero wb) {
		if (wb != null) wb.rennenDurchfuehren(); //Output needs further tweaking!
		else {
			rennen.durchfuehren();
			System.out.println(rennen);
		}
	}
}