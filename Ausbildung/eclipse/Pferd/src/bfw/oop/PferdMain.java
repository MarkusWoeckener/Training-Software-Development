package bfw.oop;
import java.io.*;

/**
 * Hauptklasse des Projektes "Pferd"
 * @author WoeckenerM
 */
public class PferdMain {
	/**
	 * Main methode des Projektes
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		/**
		 * Pferd-Objekte instanziieren
		 */
		Pferd xanthos = new Pferd(1.90, 0, 65, "Xanthos");
		Pferd balios = new Pferd(1.85, 5, 60, "Balios");
		
		/**
		 * Daten der Pferde ausgeben
		 */
		xanthos.printData();
		balios.printData();
		
		/**
		 * Neues Pferd erstellen (Aufgabe 15)
		 */
		if (nochmal()) {
			Pferd pferdNeu = new Pferd();
			pferdNeu.setAttributes();
			xanthos.printData();
			balios.printData();
			pferdNeu.printData();
		}
		
		/**
		 * Methodenaufruf zu Aufgabe 16
		 */
		prognose(xanthos.getName(), xanthos.getVmax(), balios.getName(), balios.getVmax());
		
//		/**
//		 * Geschwindigkeiten ändern (Aufgabe 13)
//		 */
//		xanthos.beschleunigen(76);
//		balios.bremsen(20);
		
	} //End main()
	
	/**
	 * Fragt den Benutzer ob ein neues Pferd erstellt werden soll
	 * (siehe Aufgabe 15)
	 * @return true oder false entsprechend der Benutzereingabe
	 * @throws Exception
	 */
	static boolean nochmal() throws Exception{
		System.out.print("Soll ein neues Pferd eingegeben werden (j/n)? ");
		if (getChar() == 'j') return true;
		else return false;
	}
	
	/**
	 * Vergleicht die Höchstgeschwindigkeiten zweier Pferde und gibt eine
	 * Prognose ab, welches Pferd ein Rennen gewinnen könnte (Aufgabe 16)
	 * @param name1 Name des ersten Pferdes
	 * @param v1 Höchstgeschwindigkeit des ersten Pferdes
	 * @param name2 Name des zweiten Pferdes
	 * @param v2 Höchstegeschwindigkeit des zweiten Pferdes
	 */
	static void prognose(String name1, double v1, String name2, double v2) {
		if (v1 > v2) System.out.printf("%s ist schneller als %s und wird wahrscheinlich gewinnen.", name1, name2);
		else System.out.printf("%s ist schneller als %s und wird wahrscheinlich gewinnen.", name2, name1);
	}
	
	/**
	 * Liest einen String ein
	 * @return Benutzereingabe als String
	 * @throws Exception
	 */
	static String getString() throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		return kb.readLine();
	}
	
	/**
	 * Liest die Benutzereingabe und parst sie als Double
	 * @return eingegebene Zahl als Double
	 * @throws Exception
	 */
	static double getDouble() throws Exception{
		return Double.parseDouble(getString());
	}
	
	/**
	 * Gibt das erste Zeichen der Benutzereingabe als lower case Character zurück
	 * @return lower case Character
	 * @throws Exception
	 */
	static char getChar() throws Exception{
		return Character.toLowerCase(getString().charAt(0));
	}
}
