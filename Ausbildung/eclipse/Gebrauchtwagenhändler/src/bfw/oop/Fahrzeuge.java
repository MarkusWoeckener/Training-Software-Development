package bfw.oop;

/**
 * Superklasse für Fahrzeuge<br>
 * Erstellt Autos und Motorräder
 * @author WoeckenerM */
public class Fahrzeuge {

	//Attribute
	private double preis; //Preis des Autos
	private String modell; //Modell des Autos
	private int baujahr; //Baujahr des Autos
	private int kilometerstand; //Kilometerstand des Autos

	/**
	 * Konstruktor
	 * @param preis {@code double} Preis des Fahrzeugs
	 * @param modell {@code string} Modellname
	 * @param baujahr {@code integer} Baujahr
	 * @param kilometer {@code integer} Kilometerstand
	 */
	public Fahrzeuge (double preis, String modell, int baujahr, int kilometer) {
		setPreis(preis);
		setModell(modell);
		setBaujahr(baujahr);
		setKilometerstand(kilometer);
	}
	
	//Getter Methoden
	/**
	 * Getter Mehtode für den Preis
	 * @return [@code double} Preis
	 */
	public double getPreis() {
		return preis;
	}
	
	/**
	 * Getter Methode für den Modellnamen
	 * @return {@code string} Modellname
	 */
	public String getModell() {
		return modell;
	}
	
	/**
	 * Getter Methode für das Baujahr
	 * @return {@code integer} Baujahr
	 */
	public int getBaujahr() {
		return baujahr;
	}
	
	/**
	 * Getter Mothode für den Kilometerstand
	 * @return {@code integer} Kilometerstand
	 */
	public int getKilometerstand() {
		return kilometerstand;
	}
	
	//Setter Methoden
	/**
	 * Setter Methode für den Preis
	 * @param wert {@code double}
	 */
	public void setPreis(double wert) {
		this.preis = wert;
	}
	
	/**
	 * Settermethode für den Modellnamen
	 * @param wert {@code string}
	 */
	public void setModell(String wert) {
		this.modell = wert;
	}

	/**
	 * Setter Methode für das Baujah
	 * @param baujahr {@code integer}
	 */
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	/**
	 * Setter Methode für den Kilometerstand
	 * @param kilometerstand {@code integer}
	 */
	public void setKilometerstand(int kilometerstand) {
		this.kilometerstand = kilometerstand;
	}
}
