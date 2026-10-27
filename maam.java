import java.util.Scanner;
public class maam {
    public void main (String[] args){
        Scanner input = new Scanner(System.in);
        int code_input;
        System.out.println("Enter number 1-3: ");
        code_input = input.nextInt();
        switch(code_input) {
            case 1:
            add(20, 10);
            break;
            case 2:
            add(26.8, 60.9);
            break;
            case 3:
                sayhello("Rayven", 17);
                break;
        }

    }
    public int add(int a, int b){
       int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public double add(double a, double b){
        double sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public void sayhello(String name, int age){
        System.out.println("I am " +  name + age + "years old");
    }
        }