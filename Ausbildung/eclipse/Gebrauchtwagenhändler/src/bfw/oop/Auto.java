package bfw.oop;

public class Auto extends Fahrzeuge{
	/**Diese Klasse stellt einen Gebrauchtwagen dar. Sie enthält
	 * den Preis, das Modell, das Baujahr, den Kilometerstand
	 * und die Farbe.
	 * Edit: in Unterklasse der Superklasse Fahrzeuge geändert.
	 * @author WoeckenerM*/
	
	//Attribut für die Unterklasse
	private String farbe; //Farbe des Autos
	
	//Konstruktor
	public Auto (double prs, String mdl, int bj, int km, String col) {
		super(prs, mdl, bj, km);
		this.farbe = col;
	}
	
	//Getter Methode für die Farbe
	public String getFarbe() {
		return farbe;
	}
	
}
