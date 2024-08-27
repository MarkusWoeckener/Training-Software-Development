/*
	Name: Markus Woeckener
	Kontakt: WoeckenerM@bfwmail.de
	Datum: 27.08.2024
	Dateiname: GeometrieRechteck.java
*/

public class GeometrieRechteck {
	public static void main(String[] args) {
		//Variablen deklarieren
		double x, y, flaeche, umfang;
		
		//Kantenlängen initialisieren
		x = 4.25;
		y = 5.3;
		
		//Berechnung Fläche und Umfang
		flaeche = x * y;
		umfang = 2 * (x + y);
		
		//Ausgabe
		System.out.println("Kantenlängen des Rechtecks:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("Fläche: " + flaeche);
		System.out.println("Umfang: " + umfang);
	}
}