// Program Name: NumberSignChecker
// This program checks whether a number is positive, negative or zero

import java.util.Scanner;

public class NumberSignChecker {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking number input from user
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Checking condition using if-else if-else
        if (number > 0) {
            System.out.println("The number is Positive.");
        } 
        else if (number < 0) {
            System.out.println("The number is Negative.");
        } 
        else {
            System.out.println("The number is Zero.");
        }

        // Closing scanner
        input.close();
    }
}