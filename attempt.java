

import java.util.Scanner;
public class attempt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int secret = 20;
        int guess;
        int attempts = 0;

        System.out.println("Enter your guess: ");
        guess = input.nextInt();
        attempts++;

        while(guess != secret){


          if(guess > secret){
              System.out.println("Taas kupal: ");
          }
          else if(guess < secret){
              System.out.println("Baba kupal");
          }
            System.out.println("Enter your guess again: ");
          guess = input.nextInt();
            attempts++;
        }
        System.out.println("Ang galing mo na hayop ka");
        System.out.println("kailangan mo pa tlga ng " + attempts + " na try? mahina");
        }
    }

