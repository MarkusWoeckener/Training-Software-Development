/*
    Name: Markus Woeckener
    Kontakt: WoeckenerM@bfwmail.de
    Datum: 27.08.2024
    Dateiname: GeometrieKreis2.java
*/

import java.io.*;

public class GeometrieKreis2 {
    public static void main(String[] args) throws Exception{
        //Buffered Reader Instanz erstellen
        BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

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
