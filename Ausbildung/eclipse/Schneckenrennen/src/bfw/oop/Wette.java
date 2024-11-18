package bfw.oop;

/**
 * Stellt eine Wette innerhalb des Wettbueros dar<p></p>
 * <b>Parameter:</b>
 * <ul>
 * <li><b>schneckenName</b> {@code string} Name der Schnecke auf die gewettet wird
 * <li><b>wettEinsatz</b> {@code int} der Wetteinsatz
 * <li><b>spieler</b> {@code string} Name des Spielers
 * </ul>
 */
public class Wette {
	private String schneckenName;
	private int wettEinsatz;
	private String spieler;
	
	/**
	 * Konstruktor
	 * @param schneckenName {@code string} Name der Schnecke auf die gewettet wird
	 * @param wettEinsatz {@code integer} der Wetteinsatz
	 * @param spieler {@code string} Name des Spielers
	 */
	public Wette(String schneckenName, int wettEinsatz, String spieler) {
		setSchneckenName(schneckenName);
		setWettEinsatz(wettEinsatz);
		setSpieler(spieler);
	}

	//Getter Mehoden
	
	/**
	 * Getter Methode für den Schneckennamen
	 * @return {@code string} Name der Schnecke auf die gewettet wird
	 */
	public String getSchneckenName() {
		return schneckenName;
	}

	/**
	 * Getter Methode für den Wetteinsatz
	 * @return {@code integer} der Wetteinsatz
	 */
	public int getWettEinsatz() {
		return wettEinsatz;
	}

	/**
	 * Getter Methode für den Spielernamen
	 * @return {@code string} Name des Spielers
	 */
	public String getSpieler() {
		return spieler;
	}

	//Setter Methoden
	
	/**
	 * Setter Methode für den Schneckennamen
	 * @param schneckenName {@code string} Name der Schnecke
	 */
	public void setSchneckenName(String schneckenName) {
		this.schneckenName = schneckenName;
	}

	/**
	 * Setter Methode für den Wetteinsatz
	 * @param wettEinsatz {@code integer} Höhe des Weitteinsatzes
	 */
	public void setWettEinsatz(int wettEinsatz) {
		this.wettEinsatz = wettEinsatz;
	}

	/**
	 * Setter Methode für den Spielernamen
	 * @param spieler {@code string} Name des Spielers
	 */
	public void setSpieler(String spieler) {
		this.spieler = spieler;
	}

	/**
	 * Eigene toString Methode für eine Wette
	 */
	@Override
	public String toString() {
		return String.format("Wette:\n"
				+ "Schneckenname: %s\n"
				+ "Wetteinsatz: %d\n"
				+ "Spieler: %s\n", schneckenName, wettEinsatz, spieler);
	}
}