package bfw.oop;

import java.io.*;
/**
 * Hilfsmethoden
 * @author WoeckenerM
 */
public class Funktionen {
	
	//Eingabemethoden
	
	/**
	 * Gibt einen String zurück
	 * @return Eingabe als String
	 * @throws Exception
	 */
	public String readString() throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		return kb.readLine();
	}
	
	/**
	 * Gibt eine Zahl (Double) zurück
	 * @return Eingabe als Double
	 * @throws Exception
	 */
	public double readDouble() throws Exception{
		return Double.parseDouble(readString());
	}
	
	/**
	 * Gibt eine Zahl (Integer) zurück
	 * @return Eingabe als Integer
	 * @throws Exception
	 */
	public int readInt() throws Exception{
		return Integer.parseInt(readString());
	}
	
	/**
	 * Gibt einen Character zurück
	 * @return Erstes Zeichen der eingabe als Character
	 * @throws Exception
	 */
	public char readChar() throws Exception{
		return Character.toLowerCase(readString().charAt(0));
	}
}
