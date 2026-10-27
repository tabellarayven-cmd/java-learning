import java.util.Scanner;
public class loop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int guess;
        int number = 11;

        do{
            System.out.println("GO guess a number: ");
            guess = input.nextInt();

            if(guess > number){
                System.out.println("Guess to high");
            }
            else{
                System.out.println( "Gues too low");
            }

        }while(guess != number);
        System.out.println("Very good");
        guess = input.nextInt();
        if(guess > number){
            System.out.println("Guess to high");
        }
        else{
            System.out.println( "Gues too low");
        }
    }

}

