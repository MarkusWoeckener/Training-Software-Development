//package schneckenrennen;

import java.util.ArrayList;

 /**
  * Klasse die ein Rennen darstellt<p></p>
  * <b>Parameter:</b>
  * <ul>
  * <li><b>name</b> {@code string} der Name des Rennens
  * <li><b>strecke</b> {@code integer} die Strecke des Rennens in Meter
  * </UL>
  * 
  * @author WoeckenerM
  */
public class Rennen {
	private String name; //Name des Rennens
	private int nTeilnehmer; //Anzahl der Teilnehmer
	private ArrayList<Rennschnecke> schnecken; //Liste der teilnehmenden Schnecken
	private int strecke; //Länge des Rennens
	
	/**
	 * Konstruktor für ein Rennen
	 * @param name {@code string}, Name des Rennens
	 * @param strecke {@code integer}, Länge des Rennens in Meter
	 */
	public Rennen(String name, int strecke) {
		setName(name);
		setStrecke(strecke);
		this.schnecken = new ArrayList<Rennschnecke>();
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
	 * Ermittelt ob und wenn ja welche Schnecke das Rennen gewonnen hat.<br>
	 * Prüft für jede Schnecke, ob die zurückgelegte Distanz größer als<br>
	 * die Länge des Rennens ist und gibt die Gewinnerschnecke als Objekt zurück.
	 * @return {@code Rennschnecke} Schnecke, die das Rennen gewonnen hat
	 */
	Rennschnecke ermittleGewinner() {
		for(Rennschnecke schnecke : schnecken) {
			if(schnecke.getDistanz() >= strecke) {
				return schnecke;
			}
		}
		return null;
	}
	
	/**
	 * Lässt jede Schnecke im Rennen einmal kriechen.
	 */
	void lasseSchneckenKriechen() {
		for(Rennschnecke schnecke : schnecken) {
			schnecke.krieche();
		}
	}
	
	/**
	 * Führt das Rennen durch<br>
	 * Lässt die Schnecken kriechen, bis {@link #ermittleGewinner()}<br>
	 * einen Gewinner zurückgibt.
	 */
	void durchfuehren() {
		while(ermittleGewinner() == null) {
			lasseSchneckenKriechen();
		}
	}
	
	/**
	 * Gibt die Daten eines Rennens als String aus
	 */
	@Override
	public String toString() {
		return String.format("%s\n\nAnzahl der Teilnehmer: %d\n"
				+ "Länge des Rennens: %d Meter\n"
				+ "\nGewinner:\n", name, nTeilnehmer, strecke) + ermittleGewinner();
	}
	
	//Setter Methoden
	
	/**
	 * Setter Methode für den Namen des Rennens
	 * @param name {@code string}, Name des Rennens
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter Methoden
	
	/**
	 * Setter Methode für die Anzahl der Teilnehmer
	 * @param anzahl {@code integer}, repräsentiert die Anzahl der teilnehmenden Schnecken
	 */
	public void setNTeilnehmer(int anzahl) {
		this.nTeilnehmer = anzahl;
	}
	
	/**
	 * Setter Methode für die Länge des Rennens
	 * @param strecke {@code integer}, Länge des Rennens in Meter 
	 */
	public void setStrecke(int strecke) {
		this.strecke = strecke;
	}

	/**
	 * Getter Methode für die Liste der teilnehmenden Schnecken
	 * @return the schnecken
	 */
	public ArrayList<Rennschnecke> getSchnecken() {
		return schnecken;
	}

	/**
	 * Gibt eine Liste der Teilnehmenden Schnecken aus
	 */
	public void getSchneckenNamen() {
		for (int i = 1; i <= schnecken.size(); i++) {
			String name = schnecken.get(i - 1).getName();
			System.out.println(i + " :" + name);
		}
	}
}