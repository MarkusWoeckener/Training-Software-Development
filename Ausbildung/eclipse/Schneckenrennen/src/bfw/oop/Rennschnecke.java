package bfw.oop;

public class Rennschnecke {
	private String name;
	private String rasse;
	private double vMax;
	private double distanz = 0;
	
	public Rennschnecke(String name, String rasse, double vMax) {
		this.name = name;
		this.rasse = rasse;
		this.vMax = vMax;
	}
	
	public void krieche() {
		distanz += Math.random() * vMax;
	}
	
	public String toString() {
		return "Name: " + name + "\nRasse: " + rasse + "\nVmax: " + vMax + "\nZurückgelegte Strecke: " + distanz;
	}
	
}
