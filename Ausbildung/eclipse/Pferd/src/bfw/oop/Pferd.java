package bfw.oop;

/**
 * Klasse die ein Pferd repräsentiert
 * @author WoeckenerM
 */
public class Pferd {
	//Attribute
	private double groesse; //Größe des Pferdes
	private double speed; //Geschwindigkeit des Pferdes
	private double vmax; //Höchstgeschwindigkeit des Pferdes
	private String name; //Name des Pferdes

	/**
	 * Konstructor für ein neues Pferd
	 * @param size Größe (Stockmaß)
	 * @param velo aktuelle Geschwindigkeit
	 * @param maxv Höchstgeschwindigkeit
	 * @param name Name des Pferdes
	 */
	public Pferd(double size, double velo, double maxv, String name) {
		this.groesse = size; //Größe
		this.speed = velo; //Geschwindigkeit
		this.vmax = maxv; //Maximale Geschwindigkeit
		this.name = name; //Name
	}
	
	/**
	 * Leerer Konstruktor
	 */
	public Pferd() {}
	
	/**
	 * Erhöht dich Geschwindigkeit des Pferden um den weitergegebenen Wert
	 * @param deltaV Gibt an um wie viele km/h die Geschwindigkeit erhöhrt werden soll
	 */
	public void beschleunigen(double deltaV) {
		this.speed += deltaV;
		if (speed > vmax) speed = vmax; //Wenn Vmax erreicht, Geschwindigkeit deckeln
		System.out.printf("Neue Geschwindigkeit: %.1f km/h \n", speed);
	}
	
	/**
	 * Verringert die Geschwindigkeit um den gegebneen Wert bis zum Stillstand
	 * @param deltaV Gibt an um wie viele km/h die Geschwindigkeit reduziert werden soll
	 */
	public void bremsen(double deltaV) {
		this.speed -= deltaV;
		if (speed <= 0) speed = 0; //Wenn die Geschwindigkeit 0 km/h erreicht, anhalten.
		System.out.printf("Neue Geschwindigkeit: %.1f km/h \n", speed);
	}
	
	/**
	 * Lässt den Benutzer die Attribute für ein neues Pferd eingeben
	 * @throws Exception
	 */
	public void setAttributes() throws Exception {
		System.out.println("Gib die Daten für das neue Pferd ein");
		System.out.print("Name: ");
		this.name = PferdMain.getString();
		System.out.print("Größe: ");
		this.groesse = PferdMain.getDouble();
		System.out.print("Höchstgeschwindigkeit: ");
		this.vmax = PferdMain.getDouble();
		System.out.print("akt Geschwindigkeit: ");
		this.speed = PferdMain.getDouble();
		System.out.println();
	}
	
	/**
	 * Gibt alle Daten eines Pferdes aus
	 */
	public void printData() {
		System.out.println("Name: " + name);
		System.out.printf("Größe: %.2f m%n", groesse);
		System.out.printf("Höchstgeschwindigkeit %.1f km/h\n", vmax);
		System.out.printf("Geschwindigkeit: %.1f km/h\n", speed);
		System.out.println();
	}
	
	/**
	 * Gibt die Größe des Pferdes zurück
	 * @return Größe in Meter
	 */
	public double getGroesse() {
		return groesse;
	}
	
	/**
	 * Gibt die aktuelle Geschwindigkeit zurück
	 * @return Geschwindigkeit in km/h
	 */
	public double getSpeed() {
		return speed;
	}
	
	/**
	 * Gibt die Höchstgeschwindigkeit zurück
	 * @return Höchstgeschwindigkeit in km/h
	 */
	public double getVmax() {
		return vmax;
	}
	
	/**
	 * Gibt den Namen des Pferdes zurück
	 *  @return Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Ändert die Größe
	 * @param wert Neue Größe in Meter
	 */
	public void setGroesse(double wert) {
		this.groesse = wert;
	}
	
	/**
	 * Ändert die aktuelle Geschwindigkeit
	 * @param wert aktuelle Geschwindigkeit in km/h
	 */
	public void setSpeed(double wert) {
		this.speed = wert;
	}
	
	/**
	 * Ändert die Höchstgeschwindigkeit
	 * @param wert neue Höchstgeschwindigkeit in km/h
	 */
	public void setVmax(double wert) {
		this.vmax = wert;
	}
	
	/**
	 * Ändert den Namen
	 * @param wert neuer Name
	 */
	public void setName(String wert) {
		this.name = wert;
	}
}
