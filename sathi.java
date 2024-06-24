import java.util.Scanner;
import java.util.Random;

public class sathi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100); // Generates a random number between 0 and 99
        int guess;
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Try to guess the number between 0 and 99.");

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                hasGuessed = true;
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
        scanner.close();
    }
}
