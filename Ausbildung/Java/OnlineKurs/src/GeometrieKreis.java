/*
    Name: Markus Woeckener
    Kontakt: WoeckenerM@bfwmail.de
    Datum: 27.08.2024
    Dateiname: GeometrieKreis.java
*/

public class GeometrieKreis {
    public static void main(String[] args) {
        //Variablen deklarieren
        double r, pi, flaeche, umfang;

        //Variablen initialisieren
        r = 15;
        pi = 3.14159265;

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
