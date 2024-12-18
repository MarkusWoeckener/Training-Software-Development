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
	
	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}
	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}
	/**
	 * @return the strasse
	 */
	public String getStrasse() {
		return strasse;
	}
	/**
	 * @return the hausNr
	 */
	public int getHausNr() {
		return hausNr;
	}
	/**
	 * @return the plz
	 */
	public int getPlz() {
		return plz;
	}
	/**
	 * @return the stadt
	 */
	public String getStadt() {
		return stadt;
	}
	/**
	 * @param nachname the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	/**
	 * @param vorname the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	/**
	 * @param strasse the strasse to set
	 */
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	/**
	 * @param hausNr the hausNr to set
	 */
	public void setHausNr(int hausNr) {
		this.hausNr = hausNr;
	}
	/**
	 * @param plz the plz to set
	 */
	public void setPlz(int plz) {
		this.plz = plz;
	}
	/**
	 * @param stadt the stadt to set
	 */
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
}
