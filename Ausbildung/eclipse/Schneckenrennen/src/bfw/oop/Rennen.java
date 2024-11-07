package bfw.oop;

import java.util.ArrayList;

 /**
  * Klasse die ein Rennen darstellt
  * @param name {@code string} der den Namen des Rennens enthält
  * @param strecke {@code integer} die die Strecke des Rennens in Meter angibt
  * 
  * @author WoeckenerM
  */
public class Rennen {
	private String name;
	private int nTeilnehmer;
	private ArrayList<Rennschnecke> schnecken = new ArrayList<Rennschnecke>();
	private int strecke;
	
	/**
	 * Konstruktor für ein Rennen
	 * @param name {@code string}, Name des Rennens
	 * @param strecke {@code integer}, Länge des Rennens in Meter
	 */
	public Rennen(String name, int strecke) {
		setName(name);
		setStrecke(strecke);
	}
	
	/**
	 * Dem Rennen eine Schnecke hinzufügen<br>
	 * Passt {@code nTeilnehmer} entsprechend an.
	 * @param neueSchnecke {@code Rennschnecke}, die Schnecke, die hinzugefügt werden soll
	 */
	public void addRennschnecke(Rennschnecke neueSchnecke) {
		schnecken.add(neueSchnecke);
		setNTeilnehmer(schnecken.size());
	}
	
	/**
	 * Eine Schnecke aus dem Rennen entfernen<br>
	 * Passt {@code nTeilnehmer} entsprechend an.
	 * @param index {@code integer}, Index der zu entfernenden Schnecke
	 */
	public void removeRennschnecke(int index) {
		schnecken.remove(index);
		setNTeilnehmer(schnecken.size());
	}
	
	/**
	 * Löscht eine Schnecke aus dem Rennen<br>
	 * Sucht nach dem Namen und löscht alle Schnecken mit diesem Namen.
	 * @param name {@code string}, Name der zu entfernenden Schnecke
	 */
	public void removeRennschnecke(String name) throws Exception{
		for(Rennschnecke schnecke : schnecken) {
			if(schnecke.getName() == name) schnecken.remove(schnecke);
		}
	}
	
	public Rennschnecke ermittleGewinner() {
		for(Rennschnecke schnecke : schnecken) {
			if(schnecke.getDistanz() >= strecke) return schnecke;
			//else return null;
		}
//	}
	
	/**
	 * Gibt die Daten eines Rennens als String aus
	 */
	@Override
	public String toString() {
		return "Name des Rennens: " + name + "\nAnzahl der Teilnehmer: " + nTeilnehmer + "\nLänge des Rennens: " + strecke + "\nTeilnehmer: " + schnecken;
	}
	
	//Setter Methoden
	
	/**
	 * Name des Rennens eingeben
	 * @param name {@code string}, Name des Rennens
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Anzahl der Teilnehmer festlegen
	 * @param anzahl {@code integer}, repräsentiert die Anzahl der teilnehmenden Schnecken
	 */
	public void setNTeilnehmer(int anzahl) {
		this.nTeilnehmer = anzahl;
	}
	
	/**
	 * Länge des Rennens editieren
	 * @param strecke {@code integer}, Länge des Rennens in Meter 
	 */
	public void setStrecke(int strecke) {
		this.strecke = strecke;
	}
}
