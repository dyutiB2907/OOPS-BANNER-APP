import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int arraySize;
        int searchElement;
        boolean isFound = false;

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

        // Input elements
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter element " + (index + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.err.println("Error: Element must be an integer.");
                System.exit(1);
            }
            numbers[index] = scanner.nextInt();
        }

        // Input search element
        System.out.print("Enter element to search: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Search value must be an integer.");
            System.exit(1);
        }

        searchElement = scanner.nextInt();

        // Search logic
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == searchElement) {
                System.out.println("Element found at position: " + (index + 1));
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}