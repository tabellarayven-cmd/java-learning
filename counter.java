import java.util.Scanner;
public class counter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 11;
        int guess;
        int attempt = 0;

        System.out.println("Enter your guess: ");
        guess = input.nextInt();
        attempt++;

        while(guess != number && attempt < 3){
            if(guess > number){
                System.out.println("Taas taas ng pangarap");
            }
            else if (guess < number){
                System.out.println("Baba baba ng kabobohan mo");
            }
            System.out.println("Enter your guess again: ");
            guess = input.nextInt();
            attempt++;
        }
        System.out.println("Very nc kiko");
        System.out.println("U needed " + attempt + " mahina kapa");

    }
}
