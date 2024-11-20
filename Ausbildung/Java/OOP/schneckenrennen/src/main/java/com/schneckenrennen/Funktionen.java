package schneckenrennen;

import java.io.*;
/**
 * Hilfsmethoden
 * @author WoeckenerM
 */
public class Funktionen {
	
	//Eingabemethoden
	
	/**
	 * Gibt einen {@code String} zurück
	 * @return Eingabe als {@code String}
	 * @throws Exception
	 */
	public String readString() throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		return kb.readLine();
	}
	
	/**
	 * Gibt eine Zahl als {@code Double} zurück<br>
	 * Nutzt {@link #readString()} um die Eingabe einzulesen
	 * @return Eingabe als {@code Double}
	 * @throws Exception
	 */
	public double readDouble() throws Exception{
		return Double.parseDouble(readString());
	}
	
	/**
	 * Gibt eine Zahl ({@code Integer}) zurück<br>
	 * Nutzt {@link #readString()} um die Eingabe einzulesen
	 * @return Eingabe als {@code Integer}
	 * @throws Exception
	 */
	public int readInt() throws Exception{
		return Integer.parseInt(readString());
	}
	
	/**
	 * Ruft {@link #readString()} und nutzt das erste Zeichen der Eingabe 
	 * als {@code Character} und wandelt diesen in lower case um.
	 * @return ein {@code Character} in {@code LowerCase}
	 * @throws Exception
	 */
	public char readChar() throws Exception{
		return Character.toLowerCase(readString().charAt(0));
	}
}