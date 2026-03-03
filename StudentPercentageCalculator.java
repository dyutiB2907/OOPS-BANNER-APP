// Program Name: StudentPercentageCalculator
// This program calculates total and percentage of 5 subjects

import java.util.Scanner;

public class StudentPercentageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter marks of Subject 1: ");
        double subject1 = input.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double subject2 = input.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double subject3 = input.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double subject4 = input.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double subject5 = input.nextDouble();

        // Calculations
        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = totalMarks / 5;

        // Output
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");

        input.close();
    }
}