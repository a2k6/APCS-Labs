public class PhDStudent extends CollegeStudent {

    //instance variables
    private String thesisTitle; //thesis title
    private boolean isTeaching; //whether or not a PhDStudent is teaching
    private String classTeaching; //the class the PhDStudent is teaching

    //constructor
    public PhDStudent(String name, int age, String gender, String idNum, double gpa, double totalStudyHours, int year, String major, String thesisTitle, boolean isTeaching, String classTeaching)
    {
        // use the super class's constructor
        super(name, age, gender, idNum, gpa, totalStudyHours, year, major);
        //initialize what's new to PhDStudent
        this.thesisTitle = thesisTitle;
        this.isTeaching = isTeaching;
        this.classTeaching = classTeaching;
    }

    //getter methods
    public String getThesisTitle() {return thesisTitle;}
    public Boolean getIsTeaching() {return isTeaching;}
    public String getClassTeaching() {return classTeaching;}


    //setter methods
    public void setThesisTitle(String thesisTitle) {this.thesisTitle = thesisTitle;}
    public void setIsTeaching(boolean isTeaching) {this.isTeaching = isTeaching;}
    public void setClassTeaching(String classTeaching) {this.classTeaching = classTeaching;}

    //Postcondition: totalStudyHours is updated to include the number of hours a PhDStudent spends writing a thesis.
    public void writesThesis(int hours) {study(hours);}

    /* overrides the toString method in the parent class to include a PhDStudent's thesisTitle, whether or not the
       PhDStudent is teaching, and the class the PhDStudent is teaching.
     */
    public String toString() {return (super.toString() + ", thesis title: " + thesisTitle + ", It is " + isTeaching + " that I am teaching. class teaching: " + classTeaching);}

}
