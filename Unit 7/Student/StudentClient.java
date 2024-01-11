import java.util.ArrayList;

public class StudentClient {
    public static void main(String[] args){
        //Use this code to help you test what you have written.
        Student kid = new Student();
        System.out.println(kid);
        char[] grades = {'A', 'B', 'C', 'A'};
        Student kid2 = new Student("Student", "Example", 20213456, grades, 2021);
        Student kid3 = new Student("Student", "Example", 20213456, grades, 2021);
        System.out.println("It is " + kid2.equals(kid3) + " that the equals method works");
        System.out.println(kid2.getGPA());
    }
}
