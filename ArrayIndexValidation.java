import java.util.Scanner;

public class ArrayIndexValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and initialize array
        int[] values = {10, 20, 30, 40, 50};

        // Variable declaration
        int index;

        // Input index from user
        System.out.print("Enter index to access array element: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Index must be an integer.");
            System.exit(1);
        }

        index = scanner.nextInt();

        // Validate index
        if (index < 0 || index >= values.length) {
            System.err.println("Error: Invalid index. Valid index range is 0 to " + (values.length - 1));
            System.exit(1);
        }

        // Access array element
        System.out.println("Element at index " + index + " = " + values[index]);

        scanner.close();
    }
}