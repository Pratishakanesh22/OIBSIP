import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; // generate a random number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int guess;
        int numGuesses = 0;
        boolean win = false;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                win = true;
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " tries.");
            } else if (guess < secretNumber) {
                System.out.println("Too low. Guess again.");
            } else {
                System.out.println("Too high. Guess again.");
            }
        }

        scanner.close();
    }

}

