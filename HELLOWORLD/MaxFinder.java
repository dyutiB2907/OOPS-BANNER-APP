public class MaxFinder {

    public static int findMaximum(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        int value1 = 45;
        int value2 = 78;

        int maxValue = findMaximum(value1, value2);

        System.out.println("Maximum: " + maxValue);
    }
}