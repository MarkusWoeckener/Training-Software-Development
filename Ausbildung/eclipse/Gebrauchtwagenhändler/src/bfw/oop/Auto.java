package bfw.oop;

/**Diese Klasse stellt einen Gebrauchtwagen dar.<br>
 * Sie enthält den Preis, das Modell, das Baujahr,<br>
 * den Kilometerstand und die Farbe.<br>
 * <i>Edit: in Unterklasse der Superklasse Fahrzeuge geändert.</i>
 * @author WoeckenerM
 */
public class Auto extends Fahrzeuge{
	//Attribut für die Unterklasse
	private String farbe; //Farbe des Autos
	
	/**
	 * Konstruktor
	 * @param preis {@code doulbe}
	 * @param modell {@code string}
	 * @param baujahr {@code integer}
	 * @param kilometerstand {@code integer}
	 * @param farbe {@code string}
	 */
	public Auto (double preis, String modell, int baujahr, int kilometerstand, String farbe) {
		super(preis, modell, baujahr, kilometerstand);
		setFarbe(farbe);
	}
	
	/**
	 * Getter Methode für die Farbe
	 * @return {@code string} Farbe des Fahrzeugs
	 */
	public String getFarbe() {
		return farbe;
	}
	
	/**
	 * Setter Methode für die Farbe
	 * @param farbe {@code string}
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
}
