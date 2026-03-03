// Program Name: PrimeNumberChecker
// This program checks whether a number is prime

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } 
        else {

            // Checking divisibility using for loop
            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop if divisor found
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is Prime.");
        } 
        else {
            System.out.println("The number is Not Prime.");
        }

        input.close();
    }
}