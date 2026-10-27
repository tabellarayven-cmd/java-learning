import java.util.Scanner;
public class guessinggame {
    public static void main(String[] arg) {
Scanner input = new Scanner(System.in);
    String Name;
    int age;
    int fav;
    int course;
    int start;
    int end;
    int guess;
    int right = 11;

        System.out.println("Enter your name: ");
        Name = input.nextLine();

        System.out.println("\nEnter your age: ");
        age = input.nextInt();

        System.out.println("\nEnter your fav number: ");
        fav = input.nextInt();


        System.out.println("Hola " + Name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Ur fav number is " + fav);

        if(age >= 18){
            System.out.println("\nUr an adult");
        }
        else{
            System.out.println("\nUr a minor");
        }
        if(fav > 10){
            System.out.println("\nur fav number is higher than 10");
        }
        else if(fav < 10){
            System.out.println("\nUr fav number is lower tha 10");
        }
        else{
            System.out.println("\nUr fav number is 10");
        }

        System.out.println("Whats your course? ");
        System.out.println("=====CHOICES=====");
        System.out.println("1. BSIT");
        System.out.println("2. BLIS");
        System.out.println("3. BSCS");
        System.out.println("4. BSIS");
        course = input.nextInt();

        switch(course){

            case 1:
                System.out.println("Youre course is BSIT");
                break;

            case 2:
                System.out.println("Ur course is BLIS");
                break;

            case 3:
                System.out.println("Your course is BSCS");
                break;

            case 4:
                System.out.println("Your course is BSIS");
                break;
        }
        System.out.println("Enter your starting number: ");
        start = input.nextInt();

        System.out.println("Enter your Ending number: ");
        end = input.nextInt();

        for(int i = start; i <= end; i++){
            System.out.println(i);
        }

        System.out.println("Enter youre guesssing number to win escape: ");
        guess = input.nextInt();

        while(guess != right){
            System.out.println("U got the wrong number try again");
            guess = input.nextInt();
        }
        System.out.println("VEry good");



    }
}