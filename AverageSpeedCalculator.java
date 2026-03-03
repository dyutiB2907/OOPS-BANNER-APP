// Program Name: AverageSpeedCalculator
// This program calculates average speed

import java.util.Scanner;

public class AverageSpeedCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Total Distance (in km): ");
        double totalDistance = input.nextDouble();

        System.out.print("Enter Total Time (in hours): ");
        double totalTime = input.nextDouble();

        double averageSpeed = totalDistance / totalTime;

        System.out.println("Average Speed = " + averageSpeed + " km/h");

        input.close();
    }
}