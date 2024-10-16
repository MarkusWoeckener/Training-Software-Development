package bfw.oop;

public class Fahrzeuge {
	//Attribute
	private double preis; //Preis des Autos
	private String modell; //Modell des Autos
	private int baujahr; //Baujahr des Autos
	private int kilometerstand; //Kilometerstand des Autos
	private String farbe; //Farbe des Autos
		
	//Konstruktor
	public Fahrzeuge (double wert1, String wert2, int wert3, int wert4) {
		this.preis = wert1;
		this.modell = wert2;
		this.baujahr = wert3;
		this.kilometerstand = wert4;
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
}
