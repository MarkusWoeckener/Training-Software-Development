package com.password;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Utility class for managing the password.<br>
 * The password hash is saved in an XML file.<br>
 * The password hash is read from the XML file and compared with the hash of the entered password.<br>
 */
public class PasswordManager {
    // Set the path of the file to save the password hash
    private static final String FILE_PATH = "password.xml";

    /**
     * Saves the password hash in an XML file.<br>
     * @param hash {@code String} the password hash to save
     * @throws IOException
     */
    public static void savePasswordHash(String hash) throws IOException {
        try {
            // create the document
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            // create a document builder
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            // create an empty document
            Document document = documentBuilder.newDocument();

            // root element
            Element root = document.createElement("passwords");
            document.appendChild(root);

            // password element
            Element password = document.createElement("password");
            root.appendChild(password);

            // hash element
            Element hashElement = document.createElement("hash");
            hashElement.appendChild(document.createTextNode(hash));
            password.appendChild(hashElement);

            // create the xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            // create a transformer
            Transformer transformer = transformerFactory.newTransformer();
            // set the output properties
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            // create a DOM source
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(FILE_PATH));

            transformer.transform(domSource, streamResult);

        } catch (ParserConfigurationException | TransformerException e) {
            throw new IOException("An error occurred while saving the password hash", e);
        }
    }

    /**
     * Reads the password hash from an XML file.<br>
     * @return the password hash as a {@code String}
     * @throws IOException
     */
    public static String readPasswordHash() throws IOException {
        try {
            File xmlFile = new File(FILE_PATH);
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);

            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("hash");
            if (nodeList.getLength() > 0) {
                return nodeList.item(0).getTextContent();
            } else {
                throw new IOException("No password hash found in the XML file");
            }

        } catch (Exception e) {
            throw new IOException("An error occurred while reading the password hash", e);
        }
    }

    /**
     * Verifies the entered password.<br>
     * It compares the hash with the saved hash.<br>
     * The saved hash is read by using {@code readPasswordHash()}
     * @param password {@code String} the password to verify
     * @return {@code true} if the password is correct, {@code false} otherwise
     * @throws IOException
     */
    public static boolean verifyPassword(String password) throws IOException {
        String storedHash = readPasswordHash();
        String inputHash = HashUtils.hashPassword(password);
        return storedHash.equals(inputHash);
    }
}