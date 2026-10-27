import java.util.Scanner;
public class lvl2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        int course;
        int grade;
        double attendance;

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your course: ");
        System.out.println("1. BSIT");
        System.out.println("2. BSCS");
        System.out.println("3. BSIS");
        course = input.nextInt();
        System.out.println("Enter your grade: ");
        grade = input.nextInt();
        System.out.println("Enter ur attendance grade: ");
        attendance = input.nextDouble();

        if(name.isEmpty()){
            System.out.println("Please enter your name: ");
        }
        else{
            System.out.println("HELLO!" + name);
        }
        if(age >= 18){
            System.out.println("U may enter u are an adult!");
        }
        else{
            System.out.println("U are still a minor!");
        }


        switch (course) {
            case 1:
                System.out.println("Youre course is BSIT");
                break;
            case 2:
                System.out.println("Youre course is BSCS");
                break;
            case 3:
                System.out.println("Youre couese is BSIS");
                break;
            default:
                System.out.println("Invalid Choice");



        }
        if(grade >= 95){
            System.out.println("Ur GRADES are excellent");
        }
        else if(grade >= 90){
            System.out.println("Ur GRADES are great");
        }
        else if(grade >= 85){
            System.out.println("Ur GRADES Very Good");
        }
        else if(grade >= 80){
            System.out.println("Ur GRADES are good Just keep GOing!");
        }
        else if(grade >= 75){
            System.out.println("Ur grades is ok but U can do better!");
        }
        else{
            System.out.println("U have failed");
        }

        if(attendance >= 75.00){
            System.out.println("U attendance is Great");
        }
        else{
            System.out.println("U have failed ur attendance");
        }

        if(grade >= 95 && attendance > 90.00){
            System.out.println("U are eligible for a scholarship");
        }
        else{
            System.out.println("Ur grades arent eligible for a scholarship");
        }

    }
}
