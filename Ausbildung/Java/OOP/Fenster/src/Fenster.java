import javax.swing.JOptionPane;;

public class Fenster {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(
            null, 
            "Wie ist dein Name?");
        JOptionPane.showMessageDialog(
            null, 
            String.format("Hallo %s", name));
    } //end of main
}
