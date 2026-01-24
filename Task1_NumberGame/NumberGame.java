import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int totalScore = 0;
        char choice;

        do {
            int secretNumber = generator.nextInt(50) + 1;
            int chances = 5;
            boolean isCorrect = false;

            System.out.println("\nA number between 1 and 50 has been generated.");
            System.out.println("You have " + chances + " chances to guess it.");

            while (chances > 0) {
                System.out.print("Now enter your guess: ");
                int guessValue = input.nextInt();
                chances--;

                if (guessValue == secretNumber) {
                    System.out.println("Yayy! good job! You guessed it right:)");
                    totalScore++;
                    isCorrect = true;
                    break;
                }
                else if (guessValue > secretNumber) {
                    System.out.println("Ohh no! Too high.");
                }
                else {
                    System.out.println("Oops! Too low.");
                }

                System.out.println("Your remaining chances: " + chances);
            }

            if (!isCorrect) {
                System.out.println("sorry you got no more chances .");
                System.out.println("Too bad:(,The number was: " + secretNumber);
            }

            System.out.println("Your total score: " + totalScore);
            System.out.print("Do you want to play another round? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Game over. Thanks for playing!");
        input.close();
    }
}
