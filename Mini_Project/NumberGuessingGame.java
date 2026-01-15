import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char playAgain; // To store the user's choice

        do {
            // Re-initialize variables for every new round
            int targetNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("\n--- NEW ROUND ---");
            System.out.println("Guess the number (1-100). You have " + maxAttempts + " tries!");

            // Inner loop: The actual gameplay
            while (attempts < maxAttempts) {
                System.out.print("Attempt #" + (attempts + 1) + ": ");
                
                if (scanner.hasNextInt()) {
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == targetNumber) {
                        System.out.println("CORRECT! You're a genius.");
                        hasWon = true;
                        break;
                    } else if (userGuess < targetNumber) {
                        System.out.println("Too low.");
                    } else {
                        System.out.println("Too high.");
                    }
                } else {
                    System.out.println("Please enter a valid number.");
                    scanner.next(); 
                }
            }

            if (!hasWon) {
                System.out.println("Game Over! The number was: " + targetNumber);
            }

            // Ask the user if they want to play again
            System.out.print("\nDo you want to play another round? (y/n): ");
            playAgain = scanner.next().toLowerCase().charAt(0);

        } while (playAgain == 'y'); // Loop continues if user enters 'y' or 'Y'

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }
}
