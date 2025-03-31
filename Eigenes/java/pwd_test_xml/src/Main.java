package com.password;

import javax.swing.*;

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
        String[] options = {"New User", "Login", "List Users"};

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
            createNewUser();
        }
        //If the user selects the second option, verify the password
        else if (auswahl == 1) {
            verifyUserData();
        }
        //If the user selects the third option, list all users
        else if (auswahl == 2) {
            listUsers();
        }
    }//End of main

    private static void listUsers() {
        //Show a dialog with the list of users
        StringBuilder userList = new StringBuilder();
        //Get the list of users from the PasswordManager class
        for (String user : PasswordManager.getUserList()) {
            userList.append(user).append("\n");
        }
        JOptionPane.showMessageDialog(
            null,
            "Users:\n" + userList);
    }

    private static void verifyUserData() {
        //Show an input dialog to enter the user name
        String userName = JOptionPane.showInputDialog("Enter your user name:");
        //Show an input dialog to enter the password
        String password = JOptionPane.showInputDialog("Enter your password:");
        //If the user data is not empty, verify it
        if (userName != null && !userName.isEmpty() &&
                password != null && !password.isEmpty()) {
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

    private static void createNewUser() {
        //Show an input dialog to enter the user name and password of the new user
        String userName = JOptionPane.showInputDialog(
            "Enter a new user name:");
        String password = JOptionPane.showInputDialog(
            "Enter a new password:");
        //If the user data is not empty, hash the password and save
        if (!userName.isEmpty() && password != null && !password.isEmpty()) {
            String hash = HashUtils.hashPassword(password);
            PasswordManager.saveUserData(userName, hash);
            JOptionPane.showMessageDialog(
                null,
                "Password set successfully!");
        }
    }
}//End of class