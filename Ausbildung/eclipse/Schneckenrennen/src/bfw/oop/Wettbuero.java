package bfw.oop;

import java.util.ArrayList;

public class Wettbuero {
	private Rennen rennId;
	private ArrayList<Wette> wetten;
	private double faktor = 1.5;
	
	public Wettbuero(Rennen rennId) {
		setRennId(rennId);
	}
	
	void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
		Wette wette = new Wette(schneckenName, wettEinsatz, spieler);
		wetten.add(wette);
	}
	
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
				System.out.println("Gewonnener Betrag: " + (wette.getWettEinsatz() * getFaktor()));
			}
		}
	}
	
	public Rennen getRennId() {
		return rennId;
	}
	
	public double getFaktor() {
		return faktor;
	}
	
	public void setRennId(Rennen rennId) {
		this.rennId = rennId;
	}
}
