import java.util.Scanner;

public class StudentMarksArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int numberOfStudents;

        // Get array size from user
        System.out.print("Enter the number of students: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: Number of students must be an integer.");
            System.exit(1);
        }

        numberOfStudents = scanner.nextInt();

        // Validate input
        if (numberOfStudents <= 0) {
            System.err.println("Error: Number of students must be greater than 0.");
            System.exit(1);
        }

        // Create array
        int[] studentMarks = new int[numberOfStudents];

        // Input values into array
        for (int index = 0; index < studentMarks.length; index++) {
            System.out.print("Enter marks for student " + (index + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.err.println("Error: Marks must be an integer.");
                System.exit(1);
            }

            studentMarks[index] = scanner.nextInt();

            // Validate marks
            if (studentMarks[index] < 0 || studentMarks[index] > 100) {
                System.err.println("Error: Marks must be between 0 and 100.");
                System.exit(1);
            }
        }

        // Access array elements using loop
        System.out.println("\nOriginal Marks:");
        for (int index = 0; index < studentMarks.length; index++) {
            System.out.println("Student " + (index + 1) + ": " + studentMarks[index]);
        }

        // Modify first element
        System.out.print("\nEnter new marks for student 1: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Error: New marks must be an integer.");
            System.exit(1);
        }

        int newMark = scanner.nextInt();

        if (newMark < 0 || newMark > 100) {
            System.err.println("Error: New marks must be between 0 and 100.");
            System.exit(1);
        }

        studentMarks[0] = newMark;

        // Display modified array
        System.out.println("\nUpdated Marks:");
        for (int index = 0; index < studentMarks.length; index++) {
            System.out.println("Student " + (index + 1) + ": " + studentMarks[index]);
        }

        scanner.close();
    }
}