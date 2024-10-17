package bfw.oop;

public class Motorrad extends Fahrzeuge{
	private int hubraum;
	
	//Konstruktor
	public Motorrad(double prs, String mdl, int bj, int km, int ccm) {
		super(prs, mdl, bj, km);
		this.hubraum = ccm;
	}
	
	//Getter Methode
	public int getHubraum() {
		return hubraum;
	}

}
