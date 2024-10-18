package bfw.oop;
/**
 * Hauptklasse des Projektes "Pferd"
 * @author WoeckenerM
 */
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
		
	}
}
