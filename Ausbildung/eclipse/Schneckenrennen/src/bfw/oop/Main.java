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
	public static void main(String[] args) {
		//Schnecken erstellen
		Rennschnecke schnecke = new Rennschnecke("Frieda", "Weinberg", 3.14);
		Rennschnecke schnecke2 = new Rennschnecke("Ernie", "Nackt", 4.2);
		Rennschnecke schnecke3 = new Rennschnecke("Bert", "Orange", 3.6);
		
		//Rennen erstellen
		Rennen rennen = new Rennen("Test", 25);
		
		//Schnecken einem Rennen hinzufügen
		rennen.addRennschnecke(schnecke);
		rennen.addRennschnecke(schnecke2);
		rennen.addRennschnecke(schnecke3);
		
		schnecke.krieche();
		
		System.out.println(rennen);

	}
}
