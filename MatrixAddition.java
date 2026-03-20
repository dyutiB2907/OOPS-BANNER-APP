import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int rows;
        int columns;

        // Input matrix size
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

        // Create matrices
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int column = 0; column < firstMatrix[row].length; column++) {
                if (!scanner.hasNextInt()) {
                    System.err.println("Error: Matrix elements must be integers.");
                    System.exit(1);
                }
                firstMatrix[row][column] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int row = 0; row < secondMatrix.length; row++) {
            for (int column = 0; column < secondMatrix[row].length; column++) {
                if (!scanner.hasNextInt()) {
                    System.err.println("Error: Matrix elements must be integers.");
                    System.exit(1);
                }
                secondMatrix[row][column] = scanner.nextInt();
            }
        }

        // Add matrices
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                sumMatrix[row][column] = firstMatrix[row][column] + secondMatrix[row][column];
            }
        }

        // Display result
        System.out.println("\nSum Matrix:");
        for (int row = 0; row < sumMatrix.length; row++) {
            for (int column = 0; column < sumMatrix[row].length; column++) {
                System.out.print(sumMatrix[row][column] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}