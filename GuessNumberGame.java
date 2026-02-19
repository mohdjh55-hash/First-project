import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Random number between 1-100
        
        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        int guess = 0;
        int attempts = 0;
        boolean isCorrect = false;
        
        // Game title
        System.out.println("🎮 Welcome to Guess the Number Game! 🎮");
        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess it?\n");
        
        // Game loop - keeps running until correct guess
        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            // Check if guess is correct
            if (guess == secretNumber) {
                isCorrect = true;
                System.out.println("\n🎉 Congratulations! You guessed it right!");
                System.out.println("The number was: " + secretNumber);
                System.out.println("You took " + attempts + " attempts!");
            }
            // Check if guess is too high
            else if (guess > secretNumber) {
                System.out.println("📈 Too high! Try again...\n");
            }
            // Check if guess is too low
            else if (guess < secretNumber) {
                System.out.println("📉 Too low! Try again...\n");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
