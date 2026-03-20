import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int rows;
        int columns;

        // Input matrix dimensions
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

        // Create matrix
        int[][] matrix = new int[rows][columns];

        // Input matrix elements
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

        // Calculate row sums
        System.out.println("\nRow Sums:");
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                rowSum += matrix[row][column];
            }
            System.out.println("Sum of row " + (row + 1) + " = " + rowSum);
        }

        scanner.close();
    }
}