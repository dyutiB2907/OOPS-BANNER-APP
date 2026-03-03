// Program Name: GradeCalculator
// This program calculates grade based on marks

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking marks input
        System.out.print("Enter your marks: ");
        double marks = input.nextDouble();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}