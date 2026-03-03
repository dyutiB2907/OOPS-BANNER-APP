// Program Name: MultiplicationTableGenerator
// This program generates multiplication table using for loop

import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number to generate its table: ");
        int number = input.nextInt();

        // Using for loop
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        input.close();
    }
}