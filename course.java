import java.util.Scanner;
public class course {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int number = 11;
    int guess;
    int attempt = 0;

        System.out.println("Enter your guess:");
        guess = input.nextInt();
        attempt++;

    while(guess != number && attempt < 3);{

            if (guess > number) {
                System.out.println("GUess too high");
            } else if (guess < number) {
                System.out.println("GUess to low");
            }

            System.out.println("Enter your guess again:");
            guess = input.nextInt();
            attempt++;
        }

    }
}