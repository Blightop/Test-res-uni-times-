import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 7; // You can change this to any number you want
        int numberOfTries = 3;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You have " + numberOfTries + " tries to guess the correct number between 1 and 10.");

        for (int i = 0; i < numberOfTries; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                break;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the correct number.");
        } else {
            System.out.println("Sorry, you've used all your tries. The correct number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
