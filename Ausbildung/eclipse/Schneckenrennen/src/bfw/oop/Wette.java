package bfw.oop;

/**
 * Stellt eine Wette innerhalb des {@link #Wettbuero} dar
 */
public class Wette {
	private String schneckenName;
	private int wettEinsatz;
	private String spieler;
	
	public Wette(String schneckenName, int wettEinsatz, String spieler) {
		setSchneckenName(schneckenName);
		setWettEinsatz(wettEinsatz);
		setSpieler(spieler);
	}

	/**
	 * @return the schneckenName
	 */
	public String getSchneckenName() {
		return schneckenName;
	}

	/**
	 * @return the wettEinsatz
	 */
	public int getWettEinsatz() {
		return wettEinsatz;
	}

	/**
	 * @return the spieler
	 */
	public String getSpieler() {
		return spieler;
	}

	/**
	 * @param schneckenName the schneckenName to set
	 */
	public void setSchneckenName(String schneckenName) {
		this.schneckenName = schneckenName;
	}

	/**
	 * @param wettEinsatz the wettEinsatz to set
	 */
	public void setWettEinsatz(int wettEinsatz) {
		this.wettEinsatz = wettEinsatz;
	}

	/**
	 * @param spieler the spieler to set
	 */
	public void setSpieler(String spieler) {
		this.spieler = spieler;
	}

	@Override
	public String toString() {
		return "Wette [schneckenName=" + schneckenName + ", wettEinsatz=" + wettEinsatz + ", spieler=" + spieler + "]";
	}

}
