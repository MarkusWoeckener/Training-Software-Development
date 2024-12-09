package schneckenrennen;

import java.io.FileWriter;

public class Datei {

    public static void schneckeSpeichern(Rennschnecke neueSchnecke) {
        String name = neueSchnecke.getName();
        String rasse = neueSchnecke.getRasse();
        double vMax = neueSchnecke.getvMax();

        try(FileWriter writer = new FileWriter("schnecken.csv", true)) {
            String row = String.format("%s,%s,%.2f\n", name, rasse, vMax);
            writer.write(row);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
