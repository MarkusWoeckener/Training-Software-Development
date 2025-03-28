package com.password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility class for hashing passwords.<br>
 * The passwords are hashed using the SHA-256 algorithm.<br>
 * @author WoeckenerM
 */
public class HashUtils {
    /**
     * Hashes the given password using the SHA-256 algorithm.<br>
     * @param password {@code String} the password to hash
     * @return the hashed password as a {@code String}
     */
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
