package bfw.oop;

import java.util.ArrayList;

/**
 * Repräsentiert das Wettbüro für die Rennen<br>
 * Nimmt Wetten entgegen und führt Rennen durch auf die gewettet wurde.<br>
 * Beim Erstellen eines neuen Wettbüros ist als Parameter das Rennen<br>
 * auf das gewettet werden soll als Parameter anzugeben.<p>
 * <b>Parameter</b>
 * <ul>
 * <li><b>rennId</b> {@code Rennen} Das Rennen auf das gewettet werden soll
 */
public class Wettbuero {
	private Rennen rennId;
	private ArrayList<Wette> wetten;
	private double faktor = 1.5;
	
	public Wettbuero(Rennen rennId) {
		setRennId(rennId);
		this.wetten = new ArrayList<>();
	}
	
	/**
	 * Nimmt eine neue Wette an<br>
	 * Die Wetten werden in einer {@code ArrayList} gespeichert.
	 * @param schneckenName {@code string} Name der Schnecke
	 * @param wettEinsatz {@code int} Wetteinsatz
	 * @param spieler {@code string} Name des Spielers
	 */
	public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
		Wette wette = new Wette(schneckenName, wettEinsatz, spieler);
		this.wetten.add(wette);
	}
	
	/**
	 * Führt ein Rennen auf das gewettet wurde durch.<br>
	 * Gibt anschließend aus welche Spiele wie viel gewonnen haben.
	 */
	void rennenDurchfuehren() {
		rennId.durchfuehren();
		
		//Name der Gewinnerschnecke in Variable speichern
		Rennschnecke gewinner = rennId.ermittleGewinner();
		String nameGewinner = gewinner.getName();
		
		//Für jede Wette prüfen ob auf die Gewinnerschnecke gewettet wurde und
		//entsprechende Ausgabe
		for(Wette wette : wetten) {
			if(wette.getSchneckenName() == nameGewinner) {
				System.out.println("Wettgewinner: " + wette.getSpieler());
				System.out.println("Gewonnener Betrag: " 
				+ (wette.getWettEinsatz() * getFaktor()) + "\n");
			}
		}
	}
	
	public Rennen getRennId() {
		return rennId;
	}
	
	/**
	 * Getter Methode für den Wettfaktor
	 * @return <b>faktor</b> {@code double} Multiplikator für den Gewinn 
	 */
	public double getFaktor() {
		return faktor;
	}
	
	/**
	 * Setter Methode für rennId
	 * @param rennId {@code Rennen}-Objekt
	 */
	public void setRennId(Rennen rennId) {
		this.rennId = rennId;
	}

	@Override
	public String toString() {
		return "Wettbuero für " + rennId 
				+ "\nListe der Wetten:\n" + wetten 
				+ "\nGewinnfaktor: " + faktor;
	}
}