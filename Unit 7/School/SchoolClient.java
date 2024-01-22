import java.util.*;
public class SchoolClient {
    public static void main(String[] args)
    {
        //Use this code to help you test what you have written.
            School school = new School();
            System.out.println("School Roster: ");
            System.out.println("Freshmen: ");
            ArrayList<Student> frosh = school.getYear1();
            for(Student kid: frosh)
                System.out.println(kid);
            System.out.println("Sophomores: ");
            ArrayList<Student> soph = school.getYear2();
            for(Student kid: soph)
                System.out.println(kid);
            System.out.println("Juniors: ");
            ArrayList<Student> junior = school.getYear3();
            for(Student kid: junior)
                System.out.println(kid);
            System.out.println("Seniors: ");
            ArrayList<Student> senior = school.getYear4();
            for(Student kid: senior)
                System.out.println(kid);
            System.out.println("The average GPA of the school is " + school.calcSchoolAverageGpa());
            System.out.println("Dean's List:");
            ArrayList<Student> deans = school.deansList();
            for(Student kid: deans)
                System.out.println(kid.getLastName() + ", " + kid.getFirstName());
            school.removeDoubles();
            System.out.println("School Roster with Doubles removed: ");
            System.out.println("Freshmen: ");
            for(Student kid: frosh)
                System.out.println(kid);
            System.out.println("Sophomores: ");
            for(Student kid: soph)
                System.out.println(kid);
            System.out.println("Juniors: ");
            for(Student kid: junior)
                System.out.println(kid);
            System.out.println("Seniors: ");
            for(Student kid: senior)
                System.out.println(kid);
    }
}
