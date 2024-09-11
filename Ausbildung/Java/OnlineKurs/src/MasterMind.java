import java.io.*;

public class MasterMind {
    public static void main(String[] args) throws Exception{
        //Variablendeklaration
        //Grundlegende Variablen für die Schwierigkeit des Spiels
        int codeLaenge = 4; //Länge des generierten Codes
        int numberOfAttempts = 40; //Anzahl der zur Verfügung stehenden Versuche

        //Arrays instanziieren
        int[] code = new int[codeLaenge];
        int[] guess = new int[codeLaenge];

        char nochmal; //entscheidet ob nochmal gespielt wird

        //Spielmethoden aufrufen
        while (true) {
            //code erzeugen
            code = createCode(codeLaenge);
            //Ausgabe zu Testzwecken, bei Bedarf
            //printArray(code);

            //Kurze Anleitung ausgeben
            System.out.println("\nIch habe einen " + codeLaenge + "-stelligen Code aus Ziffern zwischen 0 und 9 erstellt.");
            System.out.println("Du hast " + numberOfAttempts + " Versuche den Code zu raten.");
            
            //Spielschleife
            for (int i = 0; i < numberOfAttempts; ++i) {
                //Benutzereingabe holen
                guess = getGuess(i + 1, codeLaenge);
                //Optionale Debugging Ausgaben der Arrays
                //printArray(code);
                //printArray(guess);

                //Eingabe und generierten Code vergleichen
                if (checkGuess(code, guess, i + 1)) {
                    break; //Wenn der Code geraten wurde Schleife beenden
                }
            }
            System.out.print("Nochmal spielen (J/N)? ");
            nochmal = getChar();
            if (nochmal == 'n') {
                break;
            }
        }
    }

    static int[] createCode(int codeLaenge) {
        //Array für den generierten Code instanziieren
        int[] code = new int[codeLaenge];

        //Jedes Element des Arrays mit einer Zufallszahl zwischen 0 und 9 füllen
        for (int i = 0; i < codeLaenge; ++i) {
            code[i] = (int) Math.round(9 * Math.random());
        }
        return code;
    }

    static int[] getGuess(int n, int codeLaenge) throws Exception{
        //Buffered Reader Instanz erstellen
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Variablen deklarieren
        int[] guess = new int[codeLaenge];
        String input;

        //Eingabe vom Behutzer holen und sicherstellen dass der Code vierstellig ist
        do {
            System.out.print(n + ". Versuch: ");
            input = br.readLine();
            if (input.length() != codeLaenge) {
                System.out.println("Der Code muss " + codeLaenge + "-stellig sein!");
            }
        }
        while (input.length() != codeLaenge);

        //String in Array umwandeln
        for (int i = 0; i < guess.length; ++i) {
            guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        //Benutzereingabe als Array zurückgeben
        return guess;
    }

    static Boolean checkGuess(int[] code, int[] guess, int n) throws Exception{
        //Zählvariablen für richtige Ziffer und richtige Ziffer an richtiger Position
        int correctNumber = 0;
        int correctPosition = 0;
        int[] numberCount = new int[10];

        Boolean geraten = false; //Code geraten J/N

        //Zählen und speichern welche Ziffer wie oft im generierten Code vorkommt
        for (int i = 0; i < code.length; ++i) {
            ++numberCount[code[i]];
        }
        //Debugging Ausgabe
        //printArray(numberCount);

        //Prüfen ob richtige Ziffer an richtiger Stelle geraten wurde
        for (int i = 0; i < code.length; ++i) {
            if (code[i] == guess[i]) { //Für jede Stelle des Codes prüfen ob die Eingabe an dieser Stelle übereinstimmt
                ++correctPosition; //Zähler inkrementieren
                --numberCount[code[i]]; //Anzahl dieser Ziffer im Zähl-Array um 1 verringern
            }
        }

        //Prüfen ob richtige Ziffer an falscher Stelle geraten wurde
        for (int i = 0; i < code.length; ++i) { //Für jede Stelle des Codes
            for (int j = 0; j< code.length; ++j) {  //Jede Stelle der Eingabe durchgehen
                if (code[i] == guess[j] && numberCount[code[i]] > 0) { //Wenn es eine Übereinstimmung gibt und die Anzahl dieser Ziffer im Zähl-Array größer als 0 ist
                    ++correctNumber; //Zähler inkrementieren
                    --numberCount[code[i]]; //Anzahl dieser Ziffer im Zähl-Array um 1 verringern
                }
            }
        }

        //Ausgabe der Ergebnisse der Prüfung
        System.out.println("Richtige Ziffern an falscher Position: " + correctNumber);
        System.out.println("Richtige Ziffern an der richtigen Position: " + correctPosition +"\n");
        
        //Prüfen ob alle Stellen richtig geraten wurden
        if (correctPosition == code.length) {
            System.out.println("Code in " + n + " Versuchen geraten, Herzlichen Glückwunsch!\n");
            geraten = true;
        }
        return geraten; //Zurückgeben, dass der Code geraten wurde
    }

    static void printArray(int[] array) {
        //Arrays für debugging ausgeben
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    static char getChar() throws Exception {
		//Gibt den ersten Character der Eingabe in lowercase zurück
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));

		return Character.toLowerCase(tastatur.readLine().charAt(0));
	}
}