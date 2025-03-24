import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        
        System.out.println("Think of a number between 1 and 100.");
        while (true) {
            guess = low + random.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            String feedback = scanner.next();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it!");
                break;
            } else if (feedback.equals("higher")) {
                low = guess + 1;
            } else if (feedback.equals("lower")) {
                high = guess - 1;
            }
        }
        scanner.close();
    }
}