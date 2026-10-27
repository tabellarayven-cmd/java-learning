import java.util.Scanner;
public class activity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        int favnum;
        int food;
        int start;
        int end;
        int number = 13;
        int guess;


        System.out.println("Whats ur name?: ");
        name = input.nextLine();
        System.out.println("Whats ur age bro: ");
        age = input.nextInt();
        System.out.println("Whats ur fav num?: ");
        favnum = input.nextInt();



        System.out.println("Hello " + name);
        System.out.println("\nur are " + age + " years old");
        System.out.println("\nUr fav number is " + favnum);

        if (age >= 18) {
            System.out.println("\nu are an adult");
        } else {
            System.out.println("\nU are a minor");
        }

        if (favnum > 10) {
            System.out.println("\nUr number is greater than 10");
        } else if (favnum < 10) {
            System.out.println("\nUr fav num is less than 10");
        }
        else{
            System.out.println("Ur fav number is 10");
        }
        System.out.println("Choose yuor course");
        System.out.println("======MENU=======");
        System.out.println("1. BSIT");
        System.out.println("2. BSCS");
        System.out.println("3. BLIS");
        System.out.println("4. BSEMC");
        food = input.nextInt();

        switch (food){
            case 1:
                System.out.println("U course is BSIT");
                break;

            case 2:
                System.out.println("U course is BSCS");
                break;

            case 3:
                System.out.println("Ur course is BLIS");
                break;

            case 4:;
                System.out.println("Ur course is BSEMC");
        }

        System.out.println("ENTER UR STARTING NUMBER: ");
        start = input.nextInt();

        System.out.println("Enter ur ending number: ");
        end = input.nextInt();

        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }


        System.out.println("Guess the number");
        guess = input.nextInt();

        while(guess != 13){

            System.out.println("Try again: ");
            guess = input.nextInt();
            if (guess > 11){
                System.out.println("Guess to high");
            }
            else{
                System.out.println("Guess to low");
            }

        }
        System.out.println("Very good");


    }
}