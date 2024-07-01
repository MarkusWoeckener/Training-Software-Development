/*
script that asks for input of two integers that are divided by comma.
returns the sum if the integers are different.
If they are the same, it returns the sum * 3.
Input format is a, b
Output format is a single number
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Start scanner to read the input
        Scanner scanner = new Scanner(System.in);
        //Ask for input
        System.out.println("Enter two integers separated by a comma:");
        String input = scanner.nextLine();
        //Close the scanner
        scanner.close();

        //Split the input in a list with two elements
        String[] numbers = input.split(",");
        //Assign the input to seperate variables and parse as integer
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        //Check for the given logic and print the result
        if (a == b) {
            System.out.println((a + b) * 3);
        } else {
            System.out.println(a + b);
        }
    }
}