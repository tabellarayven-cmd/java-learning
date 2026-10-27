 import java.util.Scanner;
public class check{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height;
        double weight;
        double bmi;

        System.out.println("enter your height: ");
        height = input.nextDouble();

        System.out.println("Enter your weight: ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        if (bmi <= 18.5)
            System.out.println("BMI: You are underweight");
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI: You are Normal");
        }
        else{
            System.out.println("You are overweight or obese motherfucker");
        }
    }
}