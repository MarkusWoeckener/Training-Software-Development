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
	 * @param neueSchnecke Schneckenobjekt
	 */
	public void addRennschnecke(Rennschnecke neueSchnecke) {
		schnecken.add(neueSchnecke);
	}
	
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
