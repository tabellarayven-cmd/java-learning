import java.util.Scanner;
public class array5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int matches = 0;
        boolean found = false;

        System.out.println("Enter the number of students: ");
        int totalstudents = input.nextInt();
        int [] grade = new int [totalstudents];

        for(int count = 0; count < grade.length; count++){
            System.out.println("Enter the students grades: ");
            grade[count] = input.nextInt();

        }
        for(int count = 0; count < grade.length; count++) {
            if (grade[count] == 90) {
                found = true;
                matches++;
                System.out.println("Students grade " + matches + "matched");
            } else {
                System.out.println("grade not found");
            }
        }







    }
}
