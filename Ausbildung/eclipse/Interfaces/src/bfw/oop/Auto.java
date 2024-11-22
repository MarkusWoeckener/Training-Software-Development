package bfw.oop;

public class Auto implements Comparable<Auto>{
	private String hersteller;
	private int baujahr;
	
	public Auto(String hersteller, int baujahr) {
		this.hersteller = hersteller;
		this.baujahr = baujahr;
	}
	
	@Override
	public int compareTo(Auto other) {
		return Integer.compare(this.baujahr, other.baujahr);
	}
	
	@Override
	public String toString() {
		return hersteller + " - " + baujahr;
	}
	
}



