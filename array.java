
public class array {
    public static void main(String[] args) {
        int[] grade = new int[5];
        int sum = 0;
        double average;
        int highest = 0;
        boolean found = false;


        grade[0] = 89;
        grade[1] = 90;
        grade[2] = 75;
        grade[3] = 97;
        grade[4] = 94;
        int lowest = grade[0];

        for(int count = 0; count < grade.length; count++){
            if (grade[count] == 97){
                found = true;
            }
            System.out.println("All Students Grade: " + grade[count]);
            sum = sum + grade[count];
            if(grade[count] > highest){
                highest = grade[count];
            }
            if(grade[count] < lowest){
                lowest = grade[count];
            }
        }


        average = sum / grade.length;
        System.out.println("Average: " + average);
        System.out.println("HIGHEST: " + highest);
        System.out.println("LOWEST: " + lowest);

        if (found){
            System.out.println("Grade found");
        }
        else{
            System.out.println("Grade not Found");
        }

        }
    }



