import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Guess the Number!\nYou have 10 attempts to guess the answer");
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            // Step 5: Limit the number of attempts
            int maxAttempts = 10;

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber +
                            " correctly in " + (attempts + 1) + " attempts.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " +
                        secretNumber + ".");
            }

            // Step 6: Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
