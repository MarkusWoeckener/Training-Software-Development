/*
Ask user for an integer. If the integer is within a range of +-10 around 100
and 200 print "True".
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a new scanner to read user input
        Scanner scanner = new Scanner(System.in);
        //Ask user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        //Close the scanner
        scanner.close();

        //Check if the integer is in the given range
        if (number >= 90 && number <= 110 || number >= 190 && number <= 210) {
            System.out.println("Your number is within +-10 around 100 or 200");
        }
        else {
            System.out.println("Your number is not within +-10 around 100 or 200");
        }
    }
}
