import java.util.Scanner;

public class TwoDArraySize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int rows;
        int columns;
        int totalElements;

        // Input dimensions
        System.out.print("Enter number of rows: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Rows must be an integer.");
            System.exit(1);
        }
        rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Columns must be an integer.");
            System.exit(1);
        }
        columns = scanner.nextInt();

        // Validate dimensions
        if (rows <= 0 || columns <= 0) {
            System.err.println("Error: Rows and columns must be greater than 0.");
            System.exit(1);
        }

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Input matrix values
        System.out.println("Enter matrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (!scanner.hasNextInt()) {
                    System.err.println("Error: Matrix elements must be integers.");
                    System.exit(1);
                }
                matrix[row][column] = scanner.nextInt();
            }
        }

        // Find total number of elements
        totalElements = matrix.length * matrix[0].length;

        // Display matrix
        System.out.println("\nMatrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("Number of rows = " + matrix.length);
        System.out.println("Number of columns = " + matrix[0].length);
        System.out.println("Total number of elements = " + totalElements);

        scanner.close();
    }
}