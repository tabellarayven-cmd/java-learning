public class array3 {
    public static void main(String[] args){
        int [] grade = new int [7];
        int sum = 0;
        int average;
        int highest = 0;
        int qualified = 0;
        int failed = 0;


        grade[0] = 89;
        grade[1] = 90;
        grade[2] = 75;
        grade[3] = 97;
        grade[4] = 94;
        grade[5] = 82;
        grade[6] = 68;
        int lowest = grade[0];

        for(int count = 0; count < grade.length; count++){
            System.out.println("All Students grade: " + grade[count]);
            sum = sum + grade[count];
            if(grade[count] > highest){
                highest = grade[count];
            }
            if(grade[count] < lowest){
                lowest = grade[count];
            }
        }
        for(int count = 0; count < grade.length; count++){
            if(grade[count] >= 75){
                qualified++;
            }
            else{
                failed++;
            }
        }


        average = sum / grade.length;

        System.out.println("Total Students: " + grade.length);
        System.out.println("Total Sum: " + sum);
        System.out.println("AVERAGE: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Students Passed: " + qualified);
        System.out.println("Students Failed: " + failed);


    }
}
