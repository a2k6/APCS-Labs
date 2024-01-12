import java.io.FilterOutputStream;
import java.util.*;
public class Student 
{
    // Student instance variables
    Scanner in = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private int graduationYear;

    // Student constructors
    public Student() 
    {
        System.out.print("Please enter the student's first name: ");
        //Hint 1
            firstName = in.nextLine();
        System.out.print("Please enter the student's last name: ");
        //Hint 1
            lastName = in.nextLine();
        System.out.print("Please enter the student's expected graduation year: ");
        //Hint 1
            graduationYear = Integer.parseInt(in.nextLine());
        System.out.print("Please enter the students' grades with a space in between each one (no + or -): ");
        String grades = in.nextLine();
        grades.trim();
        int count = 0;
        for(int i = 0; i < grades.length() - 1; i++){
            if(grades.charAt(i) != ' ')
                count++;
        }
        char[] gradesList = new char[count];
        int x = 0;
        for(int i = 0; i < grades.length() - 1; i++){
            if(grades.charAt(i) != ' ') {
                gradesList[x] = grades.charAt(i);
                x++;
            }
        }
        gpa = calcGpa(gradesList);
        System.out.print("Please enter the students' ID number: ");
        //Hint 1
        idNum = Integer.parseInt(in.nextLine());
    }

    public Student(String fName, String lName, int idNumber, char[] grades, int gradYear) 
    {
        //Initialize the instance variables to the values in the parameters.
        firstName = fName;
        lastName = lName;
        idNum = idNumber;
        graduationYear = gradYear;
        gpa = calcGpa(grades);
    }
    //getter methods
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getID()
    {
        return idNum;
    }
    public int getGradYear()
    {
        return graduationYear;
    }
    public double getGpa()
    {
        return gpa;
    }
    /** Returns the value representing a student's gpa given an array of chars
     * reperesenting a student's grades, where A has a value of 4, B has a value of 3,
     * C has a value of 2, D has a value of 1, and F has a value of 0. Any other chars
     * are not valid. If any other chars are encountered, there should be a warning printed
     * and the program should exit immediately.
     * Precondition: The array grades contains only chars.
     * Postcondition: grades is unchanged.*/
    private double calcGpa(char[] grades) {
        double gpa = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i] == 'A')
                gpa += 4;
            else if(grades[i] == 'B')
                gpa += 3;
            else if(grades[i] == 'C')
                gpa += 2;
            else if(grades[i] == 'D')
                gpa += 1;
            else if(grades[i] == 'F')
                gpa += 0;
            else {
                System.out.println("A grade was entered incorrectly. Please restart the program and try again");
                System.exit(0);
            }
        }
        return gpa/grades.length;
    }

    //DO NOT CHANGE THIS
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\nStudent ID: " + idNum + "\nStudent GPA: " + gpa+ "\nStudent Email: " + assignEmailAddress();
    }

    /** Returns a String representing a student's email formatted as follows:
     * the first letter of the student's first name followed by the student's last name,
     * the student's expected graduation year, and @serrahs.com */
    public String assignEmailAddress() {
        String email = firstName.substring(0, 1) + lastName + graduationYear + "@serrahs.com";
        return email;
    }

    public boolean equals(Student x){
        return firstName.equals(x.firstName) && lastName.equals(x.lastName) && idNum == x.idNum;
    }
    /** equals method
     * Returns a boolean confirming wether or not two students are the same based on
     * their names and their ID numbers.
     * Precondition: The parameter, other, is of type Student and is not null.
     * Postcondition: Both students are unchanged.*/
    /*ToDo*/

}
