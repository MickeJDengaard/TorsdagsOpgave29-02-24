import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        Scanner scanner = new Scanner(System.in);

        // Read user input
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            // Compare user's guess with the random number
            if (input == rnd_number) {
                System.out.println("Congratulations! You guessed the number.");
            } else {
                System.out.println("Sorry, that's incorrect.");
                System.out.println(input < rnd_number ? "Try a higher number." : "Try a lower number.");
                makeAGuess(); // Recursive call
            }
        } else {
            // Error message for non-numeric input
            System.out.println("Error: Input must be a number.");
            scanner.nextLine(); // Consume invalid input
            makeAGuess(); // Recursive call
        }

        scanner.close(); // Close the scanner
    }
}
