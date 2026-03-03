// Program Name: GSTBillCalculator
// This program calculates total bill including GST

import java.util.Scanner;

public class GSTBillCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Item Price: ");
        double itemPrice = input.nextDouble();

        System.out.print("Enter GST Percentage: ");
        double gstPercentage = input.nextDouble();

        double gstAmount = (itemPrice * gstPercentage) / 100;
        double finalAmount = itemPrice + gstAmount;

        System.out.println("GST Amount = " + gstAmount);
        System.out.println("Final Bill Amount = " + finalAmount);

        input.close();
    }
}