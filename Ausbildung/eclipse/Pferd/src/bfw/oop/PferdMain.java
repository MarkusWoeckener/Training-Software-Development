package bfw.oop;
/**
 * Hauptklasse des Projektes "Pferd"
 * @author WoeckenerM
 */
import java.io.*;

public class PferdMain {
	public static void main(String[] args) {
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
		
		/*
		 * ToDo: Implement neuesPferd Methode wenn nochmal()=true
		 */
		
//		/**
//		 * Geschwindigkeiten ändern
//		 */
//		xanthos.beschleunigen(76);
//		balios.bremsen(20);
		
	}
	
	static boolean nochmal() throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		char nochmal;
		System.out.print("Soll ein neues Pferd eingegeben werden (j/n)? ");
		nochmal = Character.toLowerCase(kb.readLine().charAt(0));
		if (nochmal == 'j') return true;
		else return false;
	}
}
