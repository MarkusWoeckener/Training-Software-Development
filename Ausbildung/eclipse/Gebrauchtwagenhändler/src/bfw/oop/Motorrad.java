package bfw.oop;

public class Motorrad extends Fahrzeuge{
	//Klassenattribute
	private int hubraum; //Hubraum in ccm
	
	//Konstruktor
	public Motorrad(double prs, String mdl, int bj, int km, int ccm) {
		super(prs, mdl, bj, km);
		setHubraum(ccm);
	}
	
	//Getter Methode
	public int getHubraum() {
		return hubraum;
	}
	
	//Setter Methode
	public void setHubraum(int wert) {
		this.hubraum = wert;
	}

}
