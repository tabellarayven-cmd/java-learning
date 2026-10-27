import java.util.Scanner;
public class Sm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);





        int totalStudents;
        int sum = 0;




        System.out.println("Enter number of Students: ");
        totalStudents = input.nextInt();
        int [] grade = new int [totalStudents];



        for(int count = 0;count < grade.length; count++){
            System.out.println("Enter grade for students " +  +1 + " :");
            grade[count] = input.nextInt();



            sum = sum + grade[count];

            System.out.println("Sum of total grades is : " + (double)sum);

        }
        System.out.println("Sum of total grades is : " + (double)sum);
        int highest = grade[0];
        int lowest =grade [0];


        double average = (double)sum / grade.length;
        System.out.println("Average grades is : " + (double)average);

            for(int count = 0; count < grade.length; count++){

            if(grade[count] > highest) {
                highest = grade[count];
            }

            if(grade[count] < lowest){
                lowest = grade[count];
            }
        }


        System.out.println("Lowest: " + lowest);
        System.out.println("Highest " + highest);


    }
}
