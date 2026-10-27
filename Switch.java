

import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int food;
      //=========MENU===========
        System.out.println("Please select ur order");
        System.out.println("1. BURGER");
        System.out.println("2. PASTA");
        System.out.println("3. Chicken inasal");
        food = input.nextInt();

        switch (food) {
            case 1:
                System.out.println("U have ordered a BURGER");
                break;
            case 2:
                System.out.println("U have ordered a PASTA");
                break;
            case 3:
                System.out.println("U have ordered CHICKEN INASAL");
                break;


        }

    }
}
