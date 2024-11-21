package schneckenrennen;

import java.util.ArrayList;

/**
 * Repräsentiert das Wettbüro für die Rennen<br>
 * Nimmt Wetten entgegen und führt Rennen durch auf die gewettet wurde.<br>
 * Beim Erstellen eines neuen Wettbüros ist als Parameter das Rennen<br>
 * auf das gewettet werden soll als Parameter anzugeben.<p></p>
 * <b>Parameter</b>
 * <ul>
 * <li><b>rennId</b> {@code Rennen} Das Rennen auf das gewettet werden soll
 */
public class Wettbuero {
	private Rennen rennId;
	private ArrayList<Wette> wetten;
	private double faktor = 1.5;
	
	/**
	 * Konstruktor für ein Wettbüro
	 * @param rennId {@code Rennen} Das Rennen auf das gewettet werden soll
	 */
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
	
	/**
	 * Getter Methode für rennId
	 * @return {@code Rennen} das Rennen auf das gewettet wurde
	 */
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

	/**
	 * Gibt die Schneckennamen auf die gewettet wurde aus
	 */
	public void getSchneckenNamen() {
		for (int i = 1; i <= wetten.size(); i++) {
			String name = wetten.get(i - 1).getSchneckenName();
			System.out.println(i + " :" + name);
		}
	}

	@Override
	public String toString() {
		return "Wettbuero für " + rennId 
				+ "\nListe der Wetten:\n" + wetten 
				+ "\nGewinnfaktor: " + faktor;
	}
}