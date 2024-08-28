public class ArrayTool {
	public static void main(String[] args) {
		
		System.out.println("Bitte speichern Sie fuenf Werte und geben Sie diese aus: ");

		int zahl1 = 1;
		int zahl2 = 2;
		int zahl3 = 3;
		int zahl4 = 4;
		int zahl5 = 5;
		
		System.out.print(zahl1 + " ");
		System.out.print(zahl2 + " ");
		System.out.print(zahl3 + " ");
		System.out.print(zahl4 + " ");
		System.out.print(zahl5 + " ");
		System.out.println();


		System.out.print("Wenn Sie mehrere Werte des gleichen Typs speichern wollen, dann verwenden Sie dazu besser ein Array:\n");

		int[] zahlen = new int[5]; //explizite Instanziierung

		zahlen[0] = 11;
		zahlen[1] = 22;
		zahlen[2] = 33;
		zahlen[3] = 44;
		zahlen[4] = 55;
		
		System.out.print(zahlen[0] + " ");
		System.out.print(zahlen[1] + " ");
		System.out.print(zahlen[2] + " ");
		System.out.print(zahlen[3] + " ");
		System.out.print(zahlen[4] + " ");
		System.out.println();


		System.out.println("Einfacher geht's mit einer for-Schleife:");

		for(int i = 0; i < 5; i++) {
			System.out.print( zahlen[i] + " ");
		}
		System.out.println();


		System.out.println("Und sogar rueckwarts:");

		for(int i = 4; i >= 0; i--) {
			System.out.print( zahlen[i] + " ");
		}
		
		System.out.println();
	}
}