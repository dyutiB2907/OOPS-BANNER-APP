// Program Name: SimpleCalculator
// This program performs basic arithmetic operations using switch

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;

        // Using switch statement
        switch (operator) {

            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    input.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid Operator!");
                input.close();
                return;
        }

        System.out.println("Result = " + result);

        input.close();
    }
}