package bfw.oop;

public class Gebrauchtwagen {
	public static void main(String[] args) {
		Auto auto1 = new Auto(12343.54, "VW Friedolin", 1962, 158328, "beige");
		Motorrad krad1 = new Motorrad(2500.00, "Ducati 750ss", 1998, 23654, 750);
		System.out.println("Modell: " + auto1.getModell());
		System.out.println("Baujahr: " + auto1.getBaujahr());
		System.out.println("Preis: " + auto1.getPreis());			
		auto1.setPreis(8786.34);
		System.out.println("Neuer Preis: " + auto1.getPreis());
		System.out.println();
		System.out.println("Modell: " + krad1.getModell());
		System.out.println("Baujahr: " + krad1.getBaujahr());
		System.out.println("Kilometerstand: " + krad1.getKilometerstand());
		System.out.println("Hubraum: " + krad1.getHubraum());
		System.out.println("Preis: " + krad1.getPreis());
	}
}
