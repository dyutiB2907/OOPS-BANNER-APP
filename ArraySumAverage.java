import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int arraySize;
        int sum = 0;
        double average;

        // Input array size
        System.out.print("Enter the number of elements: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Array size must be an integer.");
            System.exit(1);
        }

        arraySize = scanner.nextInt();

        // Validate size
        if (arraySize <= 0) {
            System.err.println("Error: Array size must be greater than 0.");
            System.exit(1);
        }

        // Create array
        int[] numbers = new int[arraySize];

        // Input array elements
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.err.println("Error: Element must be an integer.");
                System.exit(1);
            }
            numbers[index] = scanner.nextInt();
        }

        // Calculate sum
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }

        // Calculate average
        average = (double) sum / numbers.length;

        // Display results
        System.out.println("\nArray Elements:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}