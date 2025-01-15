package com.password;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PasswordManager {
    private static final String FILE_PATH = "password.txt";

    public static void savePasswordHash(String hash) throws IOException {
        Files.write(Paths.get(FILE_PATH), hash.getBytes());
    }

    public static String readPasswordHash() throws IOException {
        return new String(Files.readAllBytes(Paths.get(FILE_PATH)));
    }

    public static boolean verifyPassword(String password) throws IOException {
        String storedHash = readPasswordHash();
        String inputHash = HashUtils.hashPassword(password);
        return storedHash.equals(inputHash);
    }
}
