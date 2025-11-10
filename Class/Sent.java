import java.util.Scanner;

public class SentinelControlLoop {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize counters for positive and negative numbers
        int positiveCount = 0;
        int negativeCount = 0;

        // Define the sentinel value
        final int SENTINEL = -1;

        // Prompt the user for the first number
        System.out.println("Enter a number (or enter -1 to quit):");
        
        // Read the first number
        int number = scanner.nextInt();

        // Start the sentinel-controlled loop
        // The loop continues as long as the input number is NOT the sentinel
        while (number != SENTINEL) {
            
            // Check if the number is positive (greater than 0)
            if (number > 0) {
                positiveCount++;
            } 
            // Check if the number is negative (less than 0)
            // Note: Zero (0) is neither positive nor negative, so it's ignored in both counts.
            else if (number < 0) {
                negativeCount++;
            }

            // Prompt and read the next number
            System.out.println("Enter the next number (or enter -1 to quit):");
            number = scanner.nextInt();
        }

        // --- Display the results ---
        System.out.println("\n--- Results ---");
        System.out.println("Sentinel value (-1) entered. Program terminated.");
        System.out.println("Total count of positive numbers: " + positiveCount);
        System.out.println("Total count of negative numbers: " + negativeCount);

        // Close the scanner object
        scanner.close();
    }
}

