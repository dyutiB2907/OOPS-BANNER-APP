public class PowerCalculator {

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double baseValue = 2;
        double exponentValue = 3;

        double result = calculatePower(baseValue, exponentValue);

        System.out.println("Power: " + result);
    }
}