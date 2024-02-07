public class Student extends Person {

    //instance variables
    private String idNum;    // Student ID Number
    private double gpa;      // grade point average
    private double totalStudyHours;     //total study hours

    // constructor
    public Student(String name, int age, String gender, String idNum, double gpa, double totalStudyHours) {
        // use the super class's constructor
        super(name, age, gender);

        //initialize what's new to Student
        this.idNum = idNum;
        this.gpa = gpa;
        this.totalStudyHours = totalStudyHours;
    }
    //getter methods
    public String getIdNum() {
        return idNum;
    }
    public double getGPA() {
        return gpa;
    }
    public double getTotalStudyHours(){return totalStudyHours;}

    //setter methods
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    //Postcondition: totalStudyHours is updated to include hours.
    public void study(double hours)
    {
        this.totalStudyHours += hours;
    }

    // Overrides the toString method in the parent class to include a Student's idNum and gpa.
    public String toString() {
        return super.toString() + ", student ID: " + idNum + ", GPA: " + gpa +", total study hours: " + totalStudyHours;
    }
}
