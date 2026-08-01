import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Stone Paper Scissor Game");
        System.out.print("Enter rock, paper, or scissors: ");
        String userChoice = scanner.nextLine().trim().toLowerCase();

        if (!Arrays.asList(options).contains(userChoice)) {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        String computerChoice = options[random.nextInt(options.length)];
        System.out.println("Computer chose " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("Draw");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                || (userChoice.equals("paper") && computerChoice.equals("rock"))
                || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}