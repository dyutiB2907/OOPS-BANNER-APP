// Program Name: CircleAreaCalculator
// This program calculates area of a circle

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Area of Circle = " + area);

        input.close();
    }
}