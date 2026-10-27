import java.util.Scanner;
public class dj{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       /* double L;
        double W;
        double H;

        System.out.println("Enter the Length: ");
        L = input.nextInt();

        System.out.println("Enter the Width: ");
        W = input.nextInt();

        H = Math.sqrt(Math.pow(L, 2) + Math.pow(W, 2));


        /*System.out.println("The hypotenuse of L and W is: " + H);
        */
       double radius;
       double circumference;
       double area;
       double volume;

        System.out.println("Enter the radius: ");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: "+ circumference + " cm");

        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is: "  + area + " cm");
    }
}