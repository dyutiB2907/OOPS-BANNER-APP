// Program Name: DistanceConverter
// This program converts kilometers to meters and centimeters

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        double meters = kilometers * 1000;
        double centimeters = meters * 100;

        System.out.println("Distance in Meters = " + meters);
        System.out.println("Distance in Centimeters = " + centimeters);

        input.close();
    }
}