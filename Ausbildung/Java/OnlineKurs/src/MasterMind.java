import java.io.*;

public class MasterMind {
    public static void main(String[] args) throws Exception{
        //Arrays instanziieren
        int[] code = new int[4];
        int[] guess = new int[4];

        //Anzahl der zur Verfügung stehenden Versuche
        int numberOfAttempts = 20;

        //code erzeugen
        code = createCode();
        //Ausgabe zu Testzwecken, bei Bedarf
        printArray(code);

        System.out.println("Ich habe einen vierstelligen Code aus Ziffern zwischen 0 und 9 erstellt.");
        System.out.println("Du hast " + numberOfAttempts + " Versuche den Code zu raten.");
        
        //Spielschleife
        for (int i = 0; i < numberOfAttempts; ++i) {
            //Benutzereingabe holen
            guess = getGuess(i + 1);
            //Optionale Debugging Ausgaben der Arrays
            //printArray(code);
            //printArray(guess);

            //Eingabe und generierten Code vergleichen
            if (checkGuess(code, guess, i + 1)) {
                break;
            }
        }
    }

    static int[] createCode() {
        int[] code = new int[4];

        //Jedes Element des Arrays mit einer Zufallszahl zwischen 0 und 9 füllen
        for (int i = 0; i < 4; ++i) {
            code[i] = (int) Math.round(9 * Math.random());
        }
        return code;
    }

    static int[] getGuess(int n) throws Exception{
        //Buffered Reader Instanz erstellen
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Variablen deklarieren
        int[] guess = new int[4];
        String input;

        //Eingabe vom Behutzer holen und sicherstellen dass der Code vierstellig ist
        do {
            System.out.print(n + ". Versuch: ");
            input = br.readLine();
            if (input.length() != 4) {
                System.out.println("Der Code muss vierstellig sein!");
            }
        }
        while (input.length() != 4);

        //String in Array umwandeln
        for (int i = 0; i < guess.length; ++i) {
            guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        //Eingabe als Array zurückgeben
        return guess;
    }

    static Boolean checkGuess(int[] code, int[] guess, int n) throws Exception{
        //Zählvariablen für richtige Ziffer und richtige Ziffer an richtiger Position
        int correctNumber = 0;
        int correctPosition = 0;

        Boolean geraten = false; //Code geraten J/N


        //Für jede Stelle des generierten Codes prüfen ob eine Stelle der Eingabe gleich ist.
        for (int i = 0; i < code.length; ++i) {
            for (int j = 0; j< code.length; ++j) {
                if (code[i] == guess[j]) {
                    //Wenn Ziffer und Stelle übereinstimmen, entsprechenden Zähler inkrementieren
                    if (i == j) {
                        ++correctPosition;
                        continue;
                    }
                    //Wenn nur die Ziffer vorhanden ist, den anderen Zähler inkrementieren
                    else {
                        ++correctNumber;
                    }
                }
            }
        }
        System.out.println("Richtige Ziffern an falscher Position: " + correctNumber);
        System.out.println("Richtige Ziffern an der richtigen Position: " + correctPosition +"\n");
        
        //Prüfen ob alle Stellen richtig geraten wurden
        if (correctPosition == code.length) {
            System.out.println("Code in " + n + " Versuchengeraten, Herzlichen Glückwunsch!");
            geraten = true;
        }
        return geraten;
    }

    static void printArray(int[] array) {
        //Arrays für debugging ausgeben
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
