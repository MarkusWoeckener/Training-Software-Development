package bfw.oop;

public class Gebrauchtwagen {
	public static void main(String[] args) {
		Auto auto1 = new Auto(12343.54, "VW Friedolin", 1962, 158328, "beige");
		System.out.println("Modell: " + auto1.getModell());
		System.out.println("Baujahr: " + auto1.getBaujahr());
		System.out.println("Preis: " + auto1.getPreis());			
		auto1.setPreis(8786.34);
		System.out.println("Neuer Preis: " + auto1.getPreis());
	}
}
