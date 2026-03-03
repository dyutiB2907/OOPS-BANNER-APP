// Program Name: EvenNumberPrinter
// This program prints even numbers from 1 to N using while loop

import java.util.Scanner;

public class EvenNumberPrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking limit input
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        int number = 1;

        // Using while loop
        while (number <= limit) {

            if (number % 2 != 0) {
                number++;
                continue; // Skip odd numbers
            }

            System.out.println(number);
            number++;
        }

        input.close();
    }
}