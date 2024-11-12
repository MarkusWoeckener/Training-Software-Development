package bfw.oop;

/**
 * Main-Klasse des Projektes Schneckenrennen
 * @author WoeckenerM 
 */
public class Main {
	/**
	 * Main Methode des Programms
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		//Schnecken erstellen
		Rennschnecke schnecke = new Rennschnecke("Frieda", "Weinberg", 3.14);
		Rennschnecke schnecke2 = new Rennschnecke("Ernie", "Nackt", 3.2);
		Rennschnecke schnecke3 = new Rennschnecke("Bert", "Orange", 3.1);
		Rennschnecke schnecke4 = new Rennschnecke("Kermit", "Weinberg", 3.16);
		
		//Rennen erstellen
		Rennen rennen = new Rennen("Test", 256);
		
		//Schnecken einem Rennen hinzufügen
		rennen.addRennschnecke(schnecke);
		rennen.addRennschnecke(schnecke2);
		rennen.addRennschnecke(schnecke3);
		rennen.addRennschnecke(schnecke4);
		
		rennen.durchfuehren();
		
		System.out.println(rennen);
		
	}
}
