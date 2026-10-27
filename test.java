public class test{
    public void main(String[] args){

        courseProgram("BSIT", 1, 'B');

        courseProgram("ComProg1", "CC201");


        courseProgram("WVSU");


    }


    static void courseProgram(String course, int yrlvl, char section){
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yrlvl);
        System.out.println("Section: " + section);
    }


    static void courseProgram(String subject, String SubjectCode){
        System.out.println("Subject: " + subject);
        System.out.println("Subject Code: " + SubjectCode);

    }

    static void courseProgram(String university) {
        System.out.println("University: " + university);


    }



    }