package bfw.oop;

public class Auto {
	/**Diese Klasse stellt einen Gebrauchtwagen dar. Sie enthält
	 * den Preis, das Modell, das Baujahr, den Kilometerstand
	 * und die Farbe.*/
	
	//Attribute
	private double preis; //Preis des Autos
	private String modell; //Modell des Autos
	private int baujahr; //Baujahr des Autos
	private int kilometerstand; //Kilometerstand des Autos
	private String farbe; //Farbe des Autos
	
	//Konstruktor
	public Auto (double wert1, String wert2, int wert3, int wert4, String wert5) {
		this.preis = wert1;
		this.modell = wert2;
		this.baujahr = wert3;
		this.kilometerstand = wert4;
		this.farbe = wert5;
	}
	
	//Getter Methoden
	public double getPreis() {
		return preis;
	}
	public String getModell() {
		return modell;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public int getKilometerstand() {
		return kilometerstand;
	}
	public String getFarbe() {
		return farbe;
	}
	
	//Setter Methoden
	public void setPreis(double wert) {
		this.preis = wert;
	}
}
