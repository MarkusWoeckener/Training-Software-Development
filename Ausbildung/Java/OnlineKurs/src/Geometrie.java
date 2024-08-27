/*
	Name: Markus Woeckener
	Kontakt: WoeckenerM@bfwmail.de
	Datum: 27.08.2024
	Dateiname: Geometrie.java
*/

import java.io.*;

public class Geometrie {
	public static void main(String[] args) throws Exception {
		//Buffered Reader Instanz erstellen
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		
		String eingabe;
		int auswahl;
		
		//Auswahlmenü
		System.out.println("Wähle aus was berechnet werden soll:");
		System.out.println("1: Rechteck");
		System.out.println("2: Kreis");
		System.out.print("Auswahl: ");
		
		//Benutzereingabe
		eingabe = tastatur.readLine();
		auswahl = Integer.parseInt(eingabe);
		
		if(auswahl == 1) {
			rechteckGeometrie(tastatur);
		}
		else if(auswahl == 2) {
			kreisGeometrie(tastatur);
		}
		else {
			System.out.println("Ungülitge Eingabe!");
		}
	}
	
	public static void rechteckGeometrie(BufferedReader tastatur) throws Exception {
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

	public static void kreisGeometrie(BufferedReader tastatur) throws Exception {
		//Variablen deklarieren
        double r, pi, flaeche, umfang;
        String text;
        
        //Variable für Pi initialisieren
        pi = 3.14159265;

        //Eingabe des Radius
        System.out.println("Bitte den Radius des Kreises eingeben:");
        System.out.print("r = ");
        text = tastatur.readLine();
        r = Double.parseDouble(text);


        //Berechnung Fläche und Umfang
        flaeche = r * r * pi;
        umfang  = 2 * r * pi;

        //Ausgabe der Ergebnisse
        System.out.println("Fläche und Umfang eines Kreises:");
        System.out.println("Radius: " +r);
        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);
	}
}