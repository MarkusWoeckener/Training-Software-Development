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
		//Hauptmenü anzeigen
		int auswahl = Gui.mainMenu();
		//Soll ein Rennen erstellt, oder das Beispiel gestartet werden?
		Rennen rennen = Gui.menuAuswahl(auswahl);
		//Wenn ein neues Rennen erstellt wurde
		if (rennen != null) {
			//Schnecken hinzufügen
			Gui.addRennschnecke(rennen);
			//Soll ein Wettbüro erstellt werden?
			Wettbuero wb = Gui.wettbuero(rennen);
			//Wenn ja, die Wetten annehmen
			if (wb != null) Ui.wettAnnahme(wb, rennen);
			//Rennen durchführen
			startRennen(rennen, wb);
		}
	}

	/**
	 * Startet ein Rennen<br>
	 * Je nach Auswahl des Benutzers mit oder ohne Wettbüro
	 * @param rennen {@code Rennen} das erstellte Rennen
	 * @param wb {@code Wettbuero} das Wetbüro, wenn erstellt
	 */
	static void startRennen(Rennen rennen, Wettbuero wb) {
		if (wb != null) wb.rennenDurchfuehren(); //Output needs further tweaking!
		else {
			rennen.durchfuehren();
			System.out.println(rennen);
		}
	}
}