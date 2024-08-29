import java.io.*;

public class MasterMind {
    public static void main(String[] args) throws Exception{
        int[] code = new int[4];
        int[] guess = new int[4];

        //code erzeugen
        code = createCode();
        printArray(code);

        //Benutzereingabe holen
        guess = getGuess();
        printArray(guess);

        //Eingabe und code vergleichen


    }

    static int[] createCode() {
        int[] code = new int[4];

        for (int i = 0; i < 4; ++i) {
            code[i] = (int) Math.round(9 * Math.random());
        }
        return code;
    }

    static int[] getGuess() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] guess = new int[4];
        String input;

        System.out.print("Gib deinen vierstelligen Code ein: ");
        input = br.readLine();

        for (int i = 0; i < guess.length; ++i) {
            guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        return guess;
    }



    static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
