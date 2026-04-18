public class FibonacciCalculator {

    public static int calculateFibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
    }

    public static void main(String[] args) {
        int inputValue = 6;

        int result = calculateFibonacci(inputValue);

        System.out.println("Fibonacci: " + result);
    }
}