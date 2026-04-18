public class ArraySumCalculator {

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int value : numbers) {
            sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numberArray = {10, 20, 30, 40};

        int result = calculateSum(numberArray);

        System.out.println("Array Sum: " + result);
    }
}