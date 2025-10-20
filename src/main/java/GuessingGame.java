import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        // TODO: Use a do...while loop to read guesses until correct
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess < num) {
                System.out.println("Too low!");
            }
            if (guess > num) {
                System.out.println("Too high!");
            }
        } while (guess != num );
        if (guess == num) {
            System.out.println("You got it!");
        }
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
