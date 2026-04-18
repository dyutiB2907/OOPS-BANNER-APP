public class FactorialCalculator {

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        int inputNumber = 5;

        int result = calculateFactorial(inputNumber);

        System.out.println("Factorial: " + result);
    }
}