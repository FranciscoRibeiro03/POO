import java.util.Random;
import java.util.Scanner;

// Create a number guessing game that uses a random number generator to generate a number between 1 and 100.
// The user should be able to guess the number and the program should tell them whether they guessed too high, too low, or correct.

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        while (guess != randomNumber) {
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            System.out.println("Guess again: ");
            guess = input.nextInt();
        }
        System.out.println("You got it! The number was " + randomNumber);
        input.close();
    }
}