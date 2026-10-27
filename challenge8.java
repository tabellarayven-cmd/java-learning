


import java.util.Scanner;
public class challenge8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int times;

        System.out.println("How many times should i say gago kaba?");
        times = input.nextInt();
        for(int i = 1; i <= times; i++){
            System.out.println("gago kaba");
        }
        System.out.println("Program fisihed");
    }
}
