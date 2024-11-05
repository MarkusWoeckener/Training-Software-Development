package bfw.oop;

/**
 * @author WoeckenerM 
 */
public class Main {
	public static void main(String[] args) {
		Rennschnecke schnecke = new Rennschnecke("Frieda", "Weinberg", 3.14);
		Rennschnecke schnecke2 = new Rennschnecke("Ernie", "Nackt", 4.2);
		Rennschnecke schnecke3 = new Rennschnecke("Bert", "Orange", 3.6);
		Rennschnecke[] schnecken = {schnecke, schnecke2, schnecke3};
		schnecke.krieche();
		System.out.println(schnecken[0]);
		Rennschnecke temp = schnecken[0];
		schnecken[0] = schnecken[2];
		schnecken[2] = temp;
		System.out.println(schnecken[0]);
	}
}
