package bfw.oop;

/**
 * @author WoeckenerM
 */
public class Rennschnecke {
	private String name; //Name der Schnecke
	private String rasse; //Rasse der Schnecke
	private double vMax; //Höchstgeschwindigkeit in m/s
	private double distanz = 0; //Zurückgelegte Distanz in Meter
	
	/**
	 * Konstruktor
	 * @param name Name (String)
	 * @param rasse Rasse (String)
	 * @param vMax Höchstgeschwindigkeit in m/s (Double)
	 */
	public Rennschnecke(String name, String rasse, double vMax) {
		this.name = name;
		this.rasse = rasse;
		this.vMax = vMax;
	}
	
	/**
	 * Lässt eine Schnecke für eine Zeiteinheit eine zufällige Strecke kriechen
	 */
	public void krieche() {
		distanz += Math.random() * vMax;
	}
	
	/**
	 * Gibt die Daten einer Schnecke zurück
	 * @return Name, Rasse, Vmax und zurückgelegte Strecke
	 */
	public String toString() {
		return "Name: " + name + "\nRasse: " + rasse + "\nVmax: " + vMax + "\nZurückgelegte Strecke: " + distanz;
	}
	
}
