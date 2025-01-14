package com.password;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Set Password", "Verify Password"};
        int auswahl = JOptionPane.showOptionDialog(
            null, 
            "Choose an Option", 
            "Password Manager", 
            JOptionPane.DEFAULT_OPTION, 
            0, 
            null, 
            options, 
            options[0]);

        if (auswahl == 0) {
            String password = JOptionPane.showInputDialog("Enter a new password:");
            if (password != null && !password.isEmpty()) {
                try {
                    PasswordManager.savePasswordHash(password);
                    JOptionPane.showMessageDialog(
                        null, 
                        "Password set successfully!");
                }
                catch (IOException e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "An error occurred while setting the password!");
                    e.printStackTrace();
                }
            }
        }
        else if (auswahl == 1) {
            String password = JOptionPane.showInputDialog("Enter your password:");
            if (password != null && !password.isEmpty()) {
                try {
                    if (PasswordManager.verifyPassword(password)) {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Password is correct!");
                    }
                    else {
                        JOptionPane.showMessageDialog(
                            null, 
                            "Password is incorrect!");
                    }
                }
                catch (IOException e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "An error occurred while verifying the password!");
                    e.printStackTrace();
                }
            }
        }
    }//End of main
}//End of class