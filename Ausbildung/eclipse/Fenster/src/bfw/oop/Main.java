
package bfw.oop;

public class Main {
	public static void main(String[] args) {
		Person person = Gui.datenEingabe();
		Datei.schreiben(person);
		System.out.println(person);
	}//End of main
	
}//End of Class