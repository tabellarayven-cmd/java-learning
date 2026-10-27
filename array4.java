import java.util.Scanner;
public class array4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int totalstudents = input.nextInt();
        int [] grade = new int [totalstudents];
        int sum = 0;
        int average;




        for(int count = 0; count < grade.length; count++) {
            System.out.println("Enter grade: " + (count + 1));
            grade[count] = input.nextInt();

            sum = sum + grade[count];
            }

        int highest = grade[0];
        int lowest = grade[0];

        int passed = 0;
        int failed = 0;

        boolean found = false;

        for (int count = 0; count < grade.length; count++) {
            if (grade[count] > highest) {
                highest = grade[count];
            }
            if (grade[count] < lowest) {
                lowest = grade[count];
            }
        }

        for(int count = 0; count < grade.length; count++){
            if (grade[count] > 75){
                passed++;
            }
            if(grade[count] < 75){
                failed++;
            }
            if (grade[count] == 99){
                found = true;
            }
        }



        average = sum / grade.length;
        for(int count = 0; count < grade.length; count++){
            System.out.println("All Students Grade: " + grade[count]);
        }


        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        if(found){
            System.out.println("Grade 99 Found");
        }
        else{
            System.out.println("Grade 99 not Found");
        }


    }
}
