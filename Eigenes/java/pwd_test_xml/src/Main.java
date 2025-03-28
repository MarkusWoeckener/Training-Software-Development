package com.password;

import javax.swing.*;
import java.io.IOException;

/**
 * Main class of the Password Manager.<br>
 * The user can choose between setting a new password and verifying the existing password.<br>
 * The password is hashed and saved in a file.<br>
 * The password is verified by comparing the hash of the entered password with the saved hash.<br>
 * @author WoeckenerM
 */
public class Main {
    public static void main(String[] args) {
        //Define the options for the user
        String[] options = {"Set Password", "Verify Password"};

        //Show a dialog with the options to set or verify the password
        int auswahl = JOptionPane.showOptionDialog(
            null,
            "Choose an Option",
            "Password Manager",
            JOptionPane.DEFAULT_OPTION,
            0,
            null,
            options,
            options[0]);

        //If the user selects the first option, set a new password
        if (auswahl == 0) {
            //Show an input dialog to enter the new password
            String password = JOptionPane.showInputDialog(
                "Enter a new password:");
            //If the password is not empty, hash it and save it
            if (password != null && !password.isEmpty()) {
                String hash = HashUtils.hashPassword(password);
                try {
                    PasswordManager.savePasswordHash(hash);
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
        //If the user selects the second option, verify the password
        else if (auswahl == 1) {
            //Show an input dialog to enter the password
            String password = JOptionPane.showInputDialog("Enter your password:");
            //If the password is not empty, verify it
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