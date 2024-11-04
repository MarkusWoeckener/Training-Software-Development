package bfw.oop;

import java.util.ArrayList;

public class Rennen {
	private String name;
	private int nTeilnehmer;
	private ArrayList<Rennschnecke> schnecken = new ArrayList<Rennschnecke>();
	private int strecke;
	
	public Rennen(String name, int strecke) {
		setName(name);
		setStrecke(strecke);
	}
	
	public void addRennschnecke(Rennschnecke neueSchnecke) {
		schnecken.add(neueSchnecke);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setNTeilnehmer(int anzahl) {
		this.nTeilnehmer = anzahl;
	}
	
	public void setStrecke(int strecke) {
		this.strecke = strecke;
	}
}
