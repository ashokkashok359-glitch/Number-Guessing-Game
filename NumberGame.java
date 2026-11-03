
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            boolean won = false;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have only 7 attempts!");

            while (attempts < 7) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid! Enter 1 to 100.");
                    continue;
                }

                attempts++;

                if (guess > number) {
                    System.out.println("Too High!");
                } 
                else if (guess < number) {
                    System.out.println("Too Low!");
                } 
                else {
                    System.out.println("Congratulations! You Won!");
                    won = true;
                    score += 10;
                    break;
                }
            }

            if (!won) {
                System.out.println("Game Over!");
                System.out.println("Correct Number: " + number);
            }

            System.out.println("Your Score: " + score);

            System.out.print("Play Again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for Playing!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
