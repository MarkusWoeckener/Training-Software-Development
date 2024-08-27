/*
	Name: Markus Woeckener
	Kontakt: WoeckenerM@bfwmail.de
	Datum: 27.08.2024
	Dateiname: GeometrieRechteck2.java
*/

import java.io.*;

public class GeometrieRechteck2 {
	public static void main(String[] args) throws Exception{
		//Buffered Reader Instanz erstellen
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		//Variablen deklarieren
		double x, y, flaeche, umfang;
		String text;
		
		//Eingabe der Kantenlängen
		System.out.println("Bitte die Kantenlängen des Rechtecks eingeben:");
		System.out.print("x = ");
		text = tastatur.readLine();
		x = Double.parseDouble(text);
		System.out.print("y = ");
		text = tastatur.readLine();
		y = Double.parseDouble(text);
				
		//Berechnung Fläche und Umfang
		flaeche = x * y;
		umfang = 2 * (x + y);
		
		//Ausgabe
		System.out.println("\nBerechnung von Fläche und Umfang eines Rechtecks:");
		System.out.println("Kantenlängen x: " + x + "; y: " +y);
		System.out.println("Fläche: " + flaeche);
		System.out.println("Umfang: " + umfang);
	}
}