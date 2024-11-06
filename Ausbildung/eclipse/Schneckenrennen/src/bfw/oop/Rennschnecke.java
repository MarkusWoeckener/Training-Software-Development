package bfw.oop;

/**
 * Klasse die eine Rennschnecke darstellt
 * @param name {@code string}, Name der Schnecke
 * @param rasse {@code string}, Rasse der schnecke
 * @param vMax {@code double}, Höchstgeschwindigkeit in m/s
 * @author WoeckenerM
 */
public class Rennschnecke {
	private String name; //Name der Schnecke
	private String rasse; //Rasse der Schnecke
	private double vMax; //Höchstgeschwindigkeit in m/s
	private double distanz = 0; //Zurückgelegte Distanz in Meter
	
	/**
	 * Konstruktor
	 * @param name {@code string}, Name einer Schnecke
	 * @param rasse {@code string} gibt die Rasse der Schnecke an
	 * @param vMax {@code double}, Höchstgeschwindigkeit in m/s
	 */
	public Rennschnecke(String name, String rasse, double vMax) {
		setName(name);
		setRasse(rasse);
		setvMax(vMax);
	}
	
	/**
	 * Lässt eine Schnecke für eine Zeiteinheit eine zufällige Strecke kriechen<br>
	 * Addiert diese Strecke zu {@code distanz}.
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
	 * @return Name der Schnecke ({@code string})
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Rasse der Schnecke ({@code string})
	 */
	public String getRasse() {
		return rasse;
	}

	/**
	 * @return Vmax der Schnecke ({@code double})
	 */
	public double getvMax() {
		return vMax;
	}

	/**
	 * @return Die zurückgelegte Strecke in Meter ({@code double})
	 */
	public double getDistanz() {
		return distanz;
	}

	//Setter Mehoden
	
	/**
	 * @param name {@code string}, Name der Schnecke
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param rasse {@code string} Rasse der Schnecke
	 */
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	/**
	 * @param vMax {@code double} Höchstgeschwindigkeit der Schnecke
	 */
	public void setvMax(double vMax) {
		this.vMax = vMax;
	}

	/**
	 * @param distanz {@code double} Im Rennen zurückgelegte Distanz in Meter
	 */
	public void setDistanz(double distanz) {
		this.distanz = distanz;
	}
	
}
