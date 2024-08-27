public class Rechnen {
    public static void main(String[] args) {
        //Variablen deklarieren
        double a, b, x, y, z;

        //Addition:
        x = 1 + 1;
        y = 2 + 10;
        a = x + 5;
        b = x + y;
        //Ergebnisse ausgeben:
        System.out.println("Ergebnisse Addition:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b +"\n");

        //Subtraktion:
        x = 10.5 - 3.2;
        y = 15.7 - 5.2;
        z = 23.1 + y;
        a = 12.3 - y;
        b = y - a;
        //Ergebnisse ausgeben:
        System.out.println("Ergebnisse Subtraktion:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
