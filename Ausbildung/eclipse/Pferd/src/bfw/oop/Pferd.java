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
	 * Gibt alle Daten eines Pferdes aus
	 */
	public void printData() {
		System.out.println("Name: " + name);
		System.out.printf("Größe: %.2f%n", groesse);
		System.out.println("Höchstgeschwindigkeit " + vmax);
		System.out.println("Geschwindigkeit: " + speed + "\n");
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
