import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand_no = random.nextInt(100) + 1;
        int guess = 0;
        int numbeTries = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You  have to select a number between 1 and 100.");
        System.out.println("Try to guess the number!!");

        while (numbeTries < 3) {
            System.out.print("Enter your number: ");
            guess = scanner.nextInt();
            numbeTries++;

            if (guess < rand_no) {
                System.out.println("Too low! Try again.");
            } else if (guess > rand_no) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You Won!!");
            }
        }

        System.out.println("Sorry \n You Lost");
    }
}
