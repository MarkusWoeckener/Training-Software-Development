package com.password;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Utility class for managing the password.<br>
 * The password hash is saved in a file.<br>
 * The password hash is read from the file and compared with the hash of the entered password.<br>
 * @author WoeckenerM
 */
public class PasswordManager {
    //Set the path of the file to save the password hash
    private static final String FILE_PATH = "password.txt";

    /**
     * Saves the password hash in a file.<br>
     * @param hash {@code String} the password hash to save
     * @throws IOException
     */
    public static void savePasswordHash(String hash) throws IOException {
        Files.write(Paths.get(FILE_PATH), hash.getBytes());
    }

    /**
     * Reads the password hash from a file.<br>
     * @return the password hash as a {@code String}
     * @throws IOException
     */
    public static String readPasswordHash() throws IOException {
        return new String(Files.readAllBytes(Paths.get(FILE_PATH)));
    }

    /**
     * Verifies the entered password by comparing the hash with the saved hash.<br>
     * @param password {@code String} the password to verify
     * @return {@code true} if the password is correct, {@code false} otherwise
     * @throws IOException
     */
    public static boolean verifyPassword(String password) throws IOException {
        String storedHash = readPasswordHash();
        String inputHash = HashUtils.hashPassword(password);
        return storedHash.equals(inputHash);
    }
}//End of class
