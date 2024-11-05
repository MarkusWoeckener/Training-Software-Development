package bfw.oop;

/**
 * Klasse die eine Rennschnecke darstellt
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
		setName(name);
		setRasse(rasse);
		setvMax(vMax);
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

	//Getter Methoden
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the rasse
	 */
	public String getRasse() {
		return rasse;
	}

	/**
	 * @return the vMax
	 */
	public double getvMax() {
		return vMax;
	}

	/**
	 * @return the distanz
	 */
	public double getDistanz() {
		return distanz;
	}

	//Setter Mehoden
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param rasse the rasse to set
	 */
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	/**
	 * @param vMax the vMax to set
	 */
	public void setvMax(double vMax) {
		this.vMax = vMax;
	}

	/**
	 * @param distanz the distanz to set
	 */
	public void setDistanz(double distanz) {
		this.distanz = distanz;
	}
	
}
