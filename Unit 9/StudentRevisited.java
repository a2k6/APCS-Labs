import java.util.*;

public class StudentRevisited {
  public static void main(String[] args)
  {
      //Creates a new Teacher, mrJava.
      Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
      //Create 2 new students, ima and phD.
      CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 0,1, "English");
      PhDStudent phD = new PhDStudent("Ima PhD Student", 27, "M", "UCB567", 4.0, 100,6, "Education", "Inclusion and Diversity Throughout the Curriculum", true, "Philosophy of Education");
      ArrayList<Student> uCBStudents = new ArrayList();
      //Add ima and PhD to the list, uCBStudents.
      uCBStudents.add(ima);
      uCBStudents.add(phD);
      //Make phD write his thesis for 3 hours.
      phD.writesThesis(3);
      //Print out mrJava.
      System.out.println(mrJava.toString());
      //Print out the students in the list, uCBStudents using a loop.
      for(Student s: uCBStudents)
          System.out.println(s.toString());
  }

}