import java.util.Scanner;
public class challenge7 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int number;
    String bobo = "y";

    while(bobo.equals("y")){
        System.out.println("Enter a number: ");
        number = input.nextInt();
        if(number >= 0){
            System.out.println("Positive boss");
        }
        else{
            System.out.println("Nega");
        }
        System.out.println("Do u still want to continue (y/n)");
        bobo = input.next();
    }
        System.out.println("Program RENE has ended");
    }
}
