public class Teacher extends Person {

    //instance variables
    private String subject; //the subject the Teacher is teaching
    private double salary; //salary

    //constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // use the super class's constructor
        super(name, age, gender);
        //initialize what's new to Teacher
        this.subject = subject;
        this.salary = salary;
    }

    //getter methods
    public String getSubject() {return subject;}
    public Double getSalary() {return salary;}

    //setter methods
    public void setSubject(String subject) {this.subject = subject;}
    public void setSalary(double salary) {this.salary = salary;}

    // overrides the toString method in the parent class
    public String toString() {return (super.toString() + ", subject: " + subject + ", salary: " + salary);}
}