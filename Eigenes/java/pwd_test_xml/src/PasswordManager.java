package com.password;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Utility class for managing the password.<br>
 * The password hash is saved in an XML file.<br>
 * The password hash is read from the XML file and compared with the hash of the entered password.<br>
 */
public class PasswordManager {
    // Set the path of the file to save the password hash
    private static final String FILE_PATH = "password.xml";

    /**
     * Saves the user data in an XML file.<br>
     * If the file does not exist, it will be created.<br>
     * If the file exists, the new user data will be added to the existing file.<br>
     * @param userName {@code String} the user name
     * @param hash {@code String} the hashed password
     */
    public static void saveUserData(String userName, String hash) {
        try {
            File xmlFile = new File(FILE_PATH);
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document;

            // Überprüfen, ob die Datei existiert
            if (xmlFile.exists()) {
                // Vorhandene Datei einlesen
                document = documentBuilder.parse(xmlFile);
                document.getDocumentElement().normalize();
            } else {
                // Neues Dokument erstellen, wenn die Datei nicht existiert
                document = documentBuilder.newDocument();
                Element root = document.createElement("users");
                document.appendChild(root);
            }

            // Root-Element abrufen
            Element root = document.getDocumentElement();

            // Neues Benutzer-Element erstellen
            Element user = document.createElement("user");

            Element userNameElement = document.createElement("userName");
            userNameElement.appendChild(document.createTextNode(userName));
            user.appendChild(userNameElement);

            Element password = document.createElement("password");
            user.appendChild(password);

            Element hashElement = document.createElement("hash");
            hashElement.appendChild(document.createTextNode(hash));
            password.appendChild(hashElement);

            // Neues Benutzer-Element zum Root-Element hinzufügen
            root.appendChild(user);

            // XML-Datei speichern
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(FILE_PATH));
            transformer.transform(domSource, streamResult);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Verifies the user<br>
     * by comparing theentered user name and the  hash of the entered password<br>
     * with the saved hash.<br>
     * @param userName {@code String} the user name
     * @param password {@code String} the password
     * @return {@code boolean} true if the password is correct, false otherwise
     */
    public static boolean verifyUser(String userName, String password) {
        try {
            File xmlFile = new File(FILE_PATH);
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            NodeList userList = document.getElementsByTagName("user");

            for (int i = 0; i < userList.getLength(); i++) {
                Element user = (Element) userList.item(i);
                String savedUserName = user.getElementsByTagName("userName").item(0).getTextContent();
                String savedHash = user.getElementsByTagName("hash").item(0).getTextContent();

                if (savedUserName.equals(userName)) {
                    String hash = HashUtils.hashPassword(password);
                    return hash.equals(savedHash);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}