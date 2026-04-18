public class SumCalculator {

    public static int calculateSum(int number1, int number2) {
        int sumResult = number1 + number2;
        return sumResult;
    }

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        int result = calculateSum(firstNumber, secondNumber);

        System.out.println("Sum: " + result);
    }
}