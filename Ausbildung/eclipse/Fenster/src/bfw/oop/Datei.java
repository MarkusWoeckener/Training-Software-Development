package bfw.oop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Handeld die Dateizugriffe
 */
public class Datei {

    /**
     * Speichert eine Person in einer Datei<br>
     * Fügt die Daten der Attribute des Person-Objekts<br>
     * einer json-Datei hinzu.
     * @param person {@code Person} die aktuelle Person
     */
    public static void schreiben(Person person) {
	String dateiname = "personen.json";

	ObjectMapper mapper = new ObjectMapper();
	File datei = new File(dateiname);

	try(FileWriter writer = new FileWriter(dateiname, true)) {
	    //Wenn die Datei nicht leer ist, Zeilenumbruch hinzufügen
	    if(datei.length() > 0) {
		writer.write("\n");
	    }
	    //Die Daten im Person-Objekt in einen String im json-Synatax schreiben
	    //und der Datei anfügen.
	    String jsonString = mapper.writeValueAsString(person);
	    writer.write(jsonString);
	}
	catch(IOException e) {
	    System.out.println("Fehler beim Bearbeiten der Datei:\n" + e.getMessage());
	    System.out.println(e.getCause());
	}
    }//EOM

    public static List<Person> datenLesen() {
	String dateiname = "personen.jsaon";
	ObjectMapper mapper = new ObjectMapper();
	File datei = new File(dateiname);
	List<Person> personen = new ArrayList<Person>();
	//Daten aus der JSON Datei in einer Array Liste speichern
	try {
	    personen = mapper.readValue(
		    datei, 
		    new TypeReference<List<Person>>() {});
	}
	catch(JsonProcessingException e) {
	    System.out.println("Fehler beim Verarbeiten der Datei:\n" + e.getMessage());
	}
	catch(IOException e) {
	    System.out.println("Fehler beim Lesen der Datei:\n" + e.getMessage());
	}
	return personen;
    }//EOM

}//End of class
