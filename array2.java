public class array2 {
    public static void main(String [] args){
        int passed = 0;
        int [] grade  = new int [7];
        int sum = 0;
        int average;
        int highest = 0;
        int counter = 0;
        boolean found = false;

        grade[0] = 89;
        grade[1] = 90;
        grade[2] = 75;
        grade[3] = 97;
        grade[4] = 94;
        grade[5] = 82;
        grade[6] = 68;

        int lowest = grade[0];

        for(int count = 0; count < grade.length; count++){
            if(grade[count] >= 75){
                passed++;
            }
            sum = sum + grade[count];
            if (grade[count] > highest){
                highest = grade[count];
            }
            if(grade[count] < lowest){
                lowest = grade[count];
            }

        }

        for(int count = 0; count < grade.length; count++){
            if(grade[count] <= 75){
                counter++;
            }
            if(grade[count] == 82){
                found = true;
            }

        }


        average = sum / grade.length;
        System.out.println("Total students: " + grade.length);
        System.out.println("SUM: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Students passed: " + passed);
        System.out.println(highest);
        System.out.println(lowest);
        System.out.println("Students failed: " + counter);
        if(found){
            System.out.println("Grade Found");
        }
        else{
            System.out.println("Grade not Found");
        }


    }
}
