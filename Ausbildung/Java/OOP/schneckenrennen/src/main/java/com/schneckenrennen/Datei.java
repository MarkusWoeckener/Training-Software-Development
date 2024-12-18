package schneckenrennen;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Datei {

    public static void schneckeSpeichern(Rennschnecke neueSchnecke) {
        String name = neueSchnecke.getName();
        String rasse = neueSchnecke.getRasse();
        double vMax = neueSchnecke.getvMax();

        try(FileWriter writer = new FileWriter("schnecken.csv", true)) {
            //Daten der Schnecke in einer Zeile formatieren
            String row = String.format("%s,%s,%.2f\n", name, rasse, vMax);
            //Zeile zur csv-Datei hinzufügen
            writer.write(row);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void schneckenLaden() {
        String dateiname = "schnecken.csv";
        List<String[]> daten = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(dateiname))) {
            String zeile;
            while((zeile = br.readLine()) != null) { //Zeile für Zeile einlesen
                //Werte aus einer Zeile in ein Array schreiben
                String[] werte = zeile.split(",");
                //Array der Liste daten hinzufügen
                daten.add(werte);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}//End of Class
