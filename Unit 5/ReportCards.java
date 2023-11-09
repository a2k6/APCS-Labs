//Code by Adrian Panezic
import java.util.Scanner;
public class ReportCards {
    private double gpa;
    private boolean hasF = false;
    private int numClasses;
    public ReportCards() {
        String currGrade;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a grade. Valid inputs are A, B, C, D, and F. Please enter N to exit the program.");
        currGrade = in.nextLine();
        numClasses = 0;
        while (currGrade.equalsIgnoreCase("A") || currGrade.equalsIgnoreCase("B") || currGrade.equalsIgnoreCase("C") || currGrade.equalsIgnoreCase("D") || currGrade.equalsIgnoreCase("F")) {
            if (currGrade.equalsIgnoreCase("A")) {
                gpa += 4.0;
            } else if (currGrade.equalsIgnoreCase("B")) {
                gpa += 3.0;
            } else if (currGrade.equalsIgnoreCase("C")) {
                gpa += 2.0;
            } else if (currGrade.equalsIgnoreCase("D")) {
                gpa += 1.0;
            } else {
                hasF = true;
            }
            numClasses++;
            System.out.println("Please input a grade. Valid inputs are A, B, C, D, and F. Please enter N to exit the program.");
            currGrade = in.nextLine();
        }
        gpa = gpa/numClasses;
    }

    //Calculate gpa, change hasF to true if an F is entered, and initialize numClasses to however many classes are entered.
    public ReportCards(char g1, char g2, char g3, char g4, char g5) {
        numClasses = 5;
        if (g1 == 'A')
            gpa += 4;
        if (g1 == 'B')
            gpa += 3;
        if (g1 == 'C')
            gpa += 2;
        if (g1 == 'D')
            gpa += 1;
        if (g1 == 'F')
            hasF = true;

        if (g2 == 'A')
            gpa += 4;
        if (g2 == 'B')
            gpa += 3;
        if (g2 == 'C')
            gpa += 2;
        if (g2 == 'D')
            gpa += 1;
        if (g2 == 'F')
            hasF = true;

        if (g3 == 'A')
            gpa += 4;
        if (g3 == 'B')
            gpa += 3;
        if (g3 == 'C')
            gpa += 2;
        if (g3 == 'D')
            gpa += 1;
        if (g3 == 'F')
            hasF = true;

        if (g4 == 'A')
            gpa += 4;
        if (g4 == 'B')
            gpa += 3;
        if (g4 == 'C')
            gpa += 2;
        if (g4 == 'D')
            gpa += 1;
        if (g4 == 'F')
            hasF = true;

        if (g5 == 'A')
            gpa += 4;
        if (g5 == 'B')
            gpa += 3;
        if (g5 == 'C')
            gpa += 2;
        if (g5 == 'D')
            gpa += 1;
        if (g5 == 'F')
            hasF = true;

        gpa = gpa/numClasses;
    }
    public int getNumClasses() {return numClasses;}
    public boolean doesHasF() {return hasF;}
    public double getGPA() {return gpa;}

    /*This method should return a String that follows the given table - any different formatting will cause the Check
     button to print Incorrect. Be aware that number of classes supersedes any of the other eligibility requirements.*/
    public String eligibility() {
        if (getNumClasses() < 4)
           return "GPA: " + getGPA() + ", Ineligible, taking less than 4 classes.";
        else if (getGPA() < 2.0 && doesHasF())
            return "GPA: " + getGPA() + ", Ineligible, GPA below 2.0 and has an F grade.";
        else if (getGPA() < 2.0)
            return "GPA: " + getGPA() + ", Ineligible, GPA below 2.0.";
        else if (doesHasF())
            return "GPA: " + getGPA() + ", Ineligible, GPA above 2.0 but has an F grade.";
        else
            return "GPA: " + getGPA() + ", Eligible.";
    }
}