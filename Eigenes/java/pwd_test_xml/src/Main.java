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
        String[] options = {"New User", "Verify Password"};

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

        //If the user selects the first option, create a new user
        if (auswahl == 0) {
            //Show an input dialog to enter the user name and passord of the new user
            String userName = JOptionPane.showInputDialog(
                "Enter a new user name:");
            String password = JOptionPane.showInputDialog(
                "Enter a new password:");
            //If the password is not empty, hash it and save it
            if (password != null && !password.isEmpty()) {
                String hash = HashUtils.hashPassword(password);
                PasswordManager.saveUserData(userName, hash);
                JOptionPane.showMessageDialog(
                    null,
                    "Password set successfully!");
            }
        }
        //If the user selects the second option, verify the password
        else if (auswahl == 1) {
            //Show an input dialog to enter the user name
            String userName = JOptionPane.showInputDialog(
                "Enter your user name:");
            //Show an input dialog to enter the password
            String password = JOptionPane.showInputDialog("Enter your password:");
            //If the password is not empty, verify it
            if (password != null && !password.isEmpty()) {
                if (PasswordManager.verifyUser(userName, password)) {
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
        }
    }//End of main
}//End of class