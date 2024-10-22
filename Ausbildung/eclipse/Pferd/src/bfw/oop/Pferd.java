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
	 * @return Größe des Pferdes
	 */
	public double getGroesse() {
		return groesse;
	}
	
	/**
	 * @return Aktuelle Geschwindigkeit
	 */
	public double getSpeed() {
		return speed;
	}
	
	/**
	 * @return Höchstgeschwindigkeit
	 */
	public double getVmax() {
		return vmax;
	}
	
	/**
	 *  @return Name des Pferdes
	 */
	public String getName() {
		return name;
	}
}
