package bfw.oop;

/**
 * Eine Person mit Daten
 */
public class Person {
    private String nachname;
    private String vorname;
    private String strasse;
    private int hausNr;
    private int plz;
    private String stadt;

    /**
     * Erstellt eine Person mit folgenden Daten
     * @param nachname {@code String} 
     * @param vorname {@code String}
     * @param strasse {@code String}
     * @param hausNr {@code integer}
     * @param plz {@code integer}
     * @param stadt {@code String}
     */
    public Person(String nachname, String vorname, String strasse, int hausNr, int plz, String stadt) {
	setNachname(nachname);
	setVorname(vorname);
	setStrasse(strasse);
	setHausNr(hausNr);
	setPlz(plz);
	setStadt(stadt);
    }

    //Getter und Setter Methoden
    
    /**
     * @return Nachname als {@code String}
     */
    public String getNachname() {
	return nachname;
    }
    /**
     * @return Vorname als {@code String}
     */
    public String getVorname() {
	return vorname;
    }
    /**
     * @return Strasse als {@code String}
     */
    public String getStrasse() {
	return strasse;
    }
    /**
     * @return Hausnummer als {@code String}
     */
    public int getHausNr() {
	return hausNr;
    }
    /**
     * @return PLZ als {@code String}
     */
    public int getPlz() {
	return plz;
    }
    /**
     * @return Name der Stadt als {@code String}
     */
    public String getStadt() {
	return stadt;
    }
    
    /**
     * Setzt den Nachnamen
     * @param nachname {@code String}
     */
    public void setNachname(String nachname) {
	this.nachname = nachname;
    }
    /**
     * Setzt den Vornamen
     * @param vorname {@code String}
     */
    public void setVorname(String vorname) {
	this.vorname = vorname;
    }
    /**
     * Setzt den Straßennamen
     * @param strasse {@code String}
     */
    public void setStrasse(String strasse) {
	this.strasse = strasse;
    }
    /**
     * Setzt die Hausnummer
     * @param hausNr {@code integer}
     */
    public void setHausNr(int hausNr) {
	this.hausNr = hausNr;
    }
    /**
     * Setzt die Postleitzahl
     * @param plz {@code integer}
     */
    public void setPlz(int plz) {
	this.plz = plz;
    }
    /**
     * Setzt den Stadtnamen
     * @param stadt {@code String}
     */
    public void setStadt(String stadt) {
	this.stadt = stadt;
    }
}
