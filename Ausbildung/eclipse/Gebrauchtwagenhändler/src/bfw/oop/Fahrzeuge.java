package bfw.oop;

public class Fahrzeuge {
	/**@category Superklasse
	 * @summary Erstellt Autos und Motorräder
	 * @author WoeckenerM */
	
	//Attribute
	private double preis; //Preis des Autos
	private String modell; //Modell des Autos
	private int baujahr; //Baujahr des Autos
	private int kilometerstand; //Kilometerstand des Autos
		
	//Konstruktor
	public Fahrzeuge (double prs, String mdl, int bj, int km) {
		this.preis = prs;
		this.modell = mdl;
		this.baujahr = bj;
		this.kilometerstand = km;
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
	
	//Setter Methoden
		public void setPreis(double wert) {
			this.preis = wert;
		}
}
