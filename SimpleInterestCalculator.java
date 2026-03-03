// Program Name: SimpleInterestCalculator
// This program calculates simple interest

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        input.close();
    }
}