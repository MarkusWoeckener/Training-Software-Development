import java.io.*;

public class WuerfelSpiel {
	public static void main(String[] args) throws Exception {
		//Variablendeklaration
		int wuerfel, eingabe;
		char nochmal;
		
		while(true) { //Endlosschleife für das Spiel starten
			System.out.println("Rate die nächsten 10 Würfelwürfe (1 - 6):\n");
			
			for (int i = 1; i <= 10; ++i) {
				wuerfel = wuerfeln(); //Zufallszahl für den aktuellen Wurf erzeugen
				
				//Eingabeaufforderung
				do {
					System.out.print("Wurf " + i + ": ");
					eingabe = getInt();
					if (eingabe <1 || eingabe > 6) {
						System.out.println("Die Eingabe muss zwischen 1 und 6 liegen.");
					}
				}
				while (eingabe <1 || eingabe >6); //Gültigen Zahlenbereich sicherstellen
				
				//Eingabe prüfen und Ergebnis ausgeben
				System.out.print("Wurf: " + wuerfel + "\t");
				if (eingabe == wuerfel) {
					System.out.println("Rightig geraten!");
				}
				else {
					System.out.println("Leider falsch.");
				}
			}

			//Abfrage ob weitergespielt werden soll
			do {
				System.out.print("Nochmal (J/N): ");
				nochmal = getChar();
			}
			while (nochmal != 'j' && nochmal != 'n'); //wiederholen solange bis 'j' oder 'n' eingegeben werden
			if (nochmal == 'n') {
				break;
			}

		}
	}
	
	static int wuerfeln() {
		//Gibt eine Zufallszahl zwischen 1 und 6 zurück
		return (int) Math.round(5 * Math.random() + 1);
	}
	
	static int getInt() throws Exception {
		//Gibt ein Integer zurüäck
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		return Integer.parseInt(tastatur.readLine());
	}

	static char getChar() throws Exception {
		//Gibt den ersten Character der Eingabe in lowercase zurück
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

		return Character.toLowerCase(tastatur.readLine().charAt(0));
	}
	
}
