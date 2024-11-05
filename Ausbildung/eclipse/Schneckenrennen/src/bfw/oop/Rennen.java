package bfw.oop;

import java.util.ArrayList;

 /**
  * Klasse die ein Rennen darstellt
  * @author WoeckenerM
  */
public class Rennen {
	private String name;
	private int nTeilnehmer;
	private ArrayList<Rennschnecke> schnecken = new ArrayList<Rennschnecke>();
	private int strecke;
	
	/**
	 * Konstruktor für ein Rennen
	 * @param name Name des Rennens (String)
	 * @param strecke Länge des Rennens in Meter (Integer)
	 */
	public Rennen(String name, int strecke) {
		setName(name);
		setStrecke(strecke);
	}
	
	/**
	 * Dem Rennen eine Schnecke hinzufügen
	 * @param neueSchnecke (Schneckenobjekt)
	 */
	public void addRennschnecke(Rennschnecke neueSchnecke) {
		schnecken.add(neueSchnecke);
	}
	
	/**
	 * Gibt die Daten eines Rennens als String aus
	 */
	@Override
	public String toString() {
		return "Name des Rennens: " + name + "\nAnzahl der Teilnehmer: " + nTeilnehmer + "\nLänge des Rennens: " + strecke;
	}
	
	//Setter Methoden
	
	/**
	 * Name des Rennens eingeben
	 * @param name Name des Rennens (String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Anzahl der Teilnehmer festlegen
	 * @param anzahl (Integer)
	 */
	public void setNTeilnehmer(int anzahl) {
		this.nTeilnehmer = anzahl;
	}
	
	/**
	 * Länge des Rennens editieren
	 * @param strecke Länge des Rennens in Meter (Integer)
	 */
	public void setStrecke(int strecke) {
		this.strecke = strecke;
	}
}
