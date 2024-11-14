package bfw.oop;

/**
 * Klasse die eine Rennschnecke darstellt<br>
 * Bei der erstellung anzugebene Parameter:<br>
 * <ul>
 * <li>{@code name} Name der Schnecke
 * <li>{@code rasse} Rasse der Schnecke
 * <li>{@code vMax} Höchstgeschwindigkeit in m/s
 * </ul>
 * @author WoeckenerM
 */
public class Rennschnecke {
	private String name; //Name der Schnecke
	private String rasse; //Rasse der Schnecke
	private double vMax; //Höchstgeschwindigkeit in m/s
	private double distanz; //Zurückgelegte Distanz in Meter
	
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
		setDistanz(0);
	}
	
	/**
	 * Lässt eine Schnecke für eine Zeiteinheit eine zufällige Strecke kriechen<br>
	 */
	public void krieche() {
		setDistanz(this.distanz += Math.random() * vMax);
	}
	
	/**
	 * Gibt die Daten einer Schnecke zurück
	 * @return Name, Rasse, Vmax und zurückgelegte Strecke
	 */
	@Override
	public String toString() {
		return String.format("Name: %s\n"
				+ "Rasse: %s\n"
				+ "Vmax: %.2f m/s\n"
				+ "Zurückgelegte Strecke: %.2f Meter\n", 
				getName(), getRasse(), getvMax(), getDistanz());
	}

	//Getter Methoden
	
	/**
	 * Getter Methode für den Namen der Schnecke
	 * @return Name der Schnecke ({@code string})
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter Methode für die Schneckenrasse 
	 * @return Rasse der Schnecke ({@code string})
	 */
	public String getRasse() {
		return rasse;
	}

	/**
	 * Getter Methode für Vmax
	 * @return Vmax der Schnecke ({@code double})
	 */
	public double getvMax() {
		return vMax;
	}

	/**
	 * Geter Methode für die zurückgelegte Strecke
	 * @return Die zurückgelegte Strecke in Meter ({@code double})
	 */
	public double getDistanz() {
		return distanz;
	}

	//Setter Mehoden
	
	/**
	 * Setter Methode für den Namen der Schnecke
	 * @param name {@code string}, Name der Schnecke
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter Methode für die Schneckenrasse
	 * @param rasse {@code string} Rasse der Schnecke
	 */
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	/**
	 * Setter Methode für Vmax der Schnecke
	 * @param vMax {@code double} Höchstgeschwindigkeit der Schnecke
	 */
	public void setvMax(double vMax) {
		this.vMax = vMax;
	}

	/**
	 * Setter Methode für die zurückgelegte Distanz
	 * @param distanz {@code double} Im Rennen zurückgelegte Distanz in Meter
	 */
	public void setDistanz(double distanz) {
		this.distanz = distanz;
	}	
}