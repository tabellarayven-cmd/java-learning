/*import java.util.Scanner;
public class pass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int secretnumber = 7;
       int guess;
        System.out.println("Input your number: ");
        guess = input.nextInt();
       while(guess != secretnumber){
           if(guess > secretnumber){
               System.out.println("Guess to high!");
               guess = input.nextInt();
           }
           else if (guess < secretnumber){
               System.out.println("Guess to low");
               guess = input.nextInt();
           }
           else{
               System.out.println("Nc ");
           }

       }
        System.out.println("Bang Clark");
    }
}/*
 */
import java.util.Scanner;
public class pass{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int secret = 11;
        int guess;

        System.out.println("Enter your guess: ");
        guess = input.nextInt();

        while(guess != secret){
            if(guess > secret){
                System.out.println("Guess tp high try again");
                guess = input.nextInt();
            }
            else if (guess < secret){
                System.out.println("Guess to low");
               guess = input.nextInt();
            }
            else{
                System.out.println("Nc guess perpek");
            }

        }
        System.out.println("pwerpek si gago");
    }
}