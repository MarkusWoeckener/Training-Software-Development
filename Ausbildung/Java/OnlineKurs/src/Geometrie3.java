/*
	Name: Markus Woeckener
	Kontakt: WoeckenerM@bfwmail.de
	Datum: 27.08.2024
	Dateiname: Geometrie3.java
*/

import java.io.*;

public class Geometrie3 {
	public static void main(String[] args) throws Exception {
		//Variablen deklarieren
		int auswahl;
		
		while(true) {
			//Auswahlmenü
			System.out.println("Wähle aus was berechnet werden soll:");
			System.out.println("1: Rechteck");
			System.out.println("2: Kreis");
			System.out.println("0: Beenden");
			System.out.print("Auswahl: ");
			
			//Benutzereingabe
			auswahl = liesInt();
						
			if(auswahl == 1) {
				rechteckGeometrie();
			}
			else if(auswahl == 2) {
				kreisGeometrie();
			}
			else if(auswahl == 0) {
				break;
			}
			else {
				System.out.println("Ungülitge Eingabe!");
			}
		}
	}
	
	static void rechteckGeometrie() throws Exception {
		//Variablen deklarieren
		double x, y, flaeche, umfang;
		
		//Eingabe der Kantenlängen
		System.out.println("Bitte die Kantenlängen des Rechtecks eingeben:");
		System.out.print("x = ");
		x = liesDouble();
		System.out.print("y = ");
		y = liesDouble();
		
		//Berechnung Fläche und Umfang
		flaeche = flaecheRechteck(x, y);
		umfang = umfangRechteck(x, y);
		
		//Ausgabe
		System.out.println("\nBerechnung von Fläche und Umfang eines Rechtecks:");
		System.out.println("Kantenlängen x: " + x + "; y: " +y);
		System.out.println("Fläche: " + flaeche);
		System.out.println("Umfang: " + umfang);
	}

	static void kreisGeometrie() throws Exception {
		//Variablen deklarieren
        double r, pi, flaeche, umfang;
        
        //Eingabe des Radius
        System.out.println("Bitte den Radius des Kreises eingeben:");
        System.out.print("r = ");
        r = liesDouble();


        //Berechnung Fläche und Umfang
        flaeche = flaecheKreis(r);
        umfang  = umfangKreis(r);

        //Ausgabe der Ergebnisse
        System.out.println("Fläche und Umfang eines Kreises:");
        System.out.println("Radius: " +r);
        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);
	}
	
	static double flaecheRechteck(double x, double y) {
		return x * y;
	}
	
	static double umfangRechteck(double x, double y) {
		return 2 * (x + y);
	}
	
	static double flaecheKreis(double r) {
		double pi = 3.14159265;
		return r * r * pi;
	}
	
	static double umfangKreis(double r) {
		double pi = 3.14159265;
		return 2 * r * pi;
	}
	static int liesInt() throws Exception {
		//Buffered Reader Instanz erstellen
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		return Integer.parseInt(tastatur.readLine());
	}
	
	static double liesDouble() throws Exception {
		//Buffered Reader Instanz erstellen
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

		return Double.parseDouble(tastatur.readLine());
	}
}