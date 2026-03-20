import java.util.Scanner;

public class ThreeDArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int layers;
        int rows;
        int columns;

        // Input dimensions
        System.out.print("Enter number of layers: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Layers must be an integer.");
            System.exit(1);
        }
        layers = scanner.nextInt();

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

        // Validate input
        if (layers <= 0 || rows <= 0 || columns <= 0) {
            System.err.println("Error: All dimensions must be greater than 0.");
            System.exit(1);
        }

        // Create 3D array
        int[][][] numbers = new int[layers][rows][columns];

        // Input elements
        System.out.println("Enter 3D array elements:");
        for (int layer = 0; layer < numbers.length; layer++) {
            for (int row = 0; row < numbers[layer].length; row++) {
                for (int column = 0; column < numbers[layer][row].length; column++) {
                    System.out.print("Element [" + layer + "][" + row + "][" + column + "]: ");
                    if (!scanner.hasNextInt()) {
                        System.err.println("Error: Elements must be integers.");
                        System.exit(1);
                    }
                    numbers[layer][row][column] = scanner.nextInt();
                }
            }
        }

        // Display elements
        System.out.println("\n3D Array Elements:");
        for (int layer = 0; layer < numbers.length; layer++) {
            System.out.println("Layer " + (layer + 1) + ":");
            for (int row = 0; row < numbers[layer].length; row++) {
                for (int column = 0; column < numbers[layer][row].length; column++) {
                    System.out.print(numbers[layer][row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Display size details
        System.out.println("Number of layers = " + numbers.length);
        System.out.println("Number of rows = " + numbers[0].length);
        System.out.println("Number of columns = " + numbers[0][0].length);

        scanner.close();
    }
}