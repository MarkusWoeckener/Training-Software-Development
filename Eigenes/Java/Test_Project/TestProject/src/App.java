public class App {
    public static void main(String[] args) {
        String name = getName();
        System.out.println("Hello, World! Hello " + name);
    }

    //ask user for their name
    public static String getName() {
        String name;
        System.out.print("Enter your Name: ");
        name = System.console().readLine();
        return name;
    }
}
