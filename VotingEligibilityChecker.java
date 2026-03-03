// Program Name: VotingEligibilityChecker
// This program checks voting eligibility based on age and citizenship

import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking age input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Taking citizenship status
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = input.nextBoolean();

        // Boolean expression with logical AND operator
        boolean isEligible = (age >= 18) && (isCitizen == true);

        if (isEligible) {
            System.out.println("You are eligible to vote.");
        } 
        else {
            System.out.println("You are not eligible to vote.");
        }

        input.close();
    }
}