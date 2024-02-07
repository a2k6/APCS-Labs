public class CollegeStudent extends Student {

    //instance variables for major and year
    private int year; //the year the CollegeStudent is in college
    private String major; //major

    //constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, double totalStudyHours, int year, String major)
    {
        // use the super class's constructor
        super(name, age, gender, idNum, gpa, totalStudyHours);
        //initialize what's new to CollegeStudent
        this.year = year;
        this.major = major;
    }

    //getter methods
    public int getYear() {return year;}
    public String getMajor() {return major;}

    //setter methods
    public void setYear(int year) {this.year = year;}
    public void setMajor(String major) {this.major = major;}

    // overrides the toString method in the parent class to include a CollegeStudent's year and major
    public String toString() {return super.toString() + ", year: " + year + ", major: " + major;}

}
