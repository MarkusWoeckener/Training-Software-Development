
package bfw.oop;

import javax.swing.JOptionPane;

public class Fenster {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Name:");
		JOptionPane.showMessageDialog(
				null, 
				"Hallo " + name);
	}
}
