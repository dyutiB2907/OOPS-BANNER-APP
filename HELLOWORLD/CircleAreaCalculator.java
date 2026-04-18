public class CircleAreaCalculator {

    public static double calculateArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {
        double radiusValue = 5.0;

        double result = calculateArea(radiusValue);

        System.out.println("Area: " + result);
    }
}