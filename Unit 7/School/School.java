//Code by Adrian Panezic
import java.util.*;
public class School {

    private ArrayList<Student> year1 = new ArrayList<>();
    private ArrayList<Student> year2 = new ArrayList<>();
    private ArrayList<Student> year3 = new ArrayList<>();
    private ArrayList<Student> year4 = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    //School constructors
    public School() {
        Student s = new Student();
        System.out.println(s);
        System.out.println("Please enter the year of the first student as an integer between 1 & 4 (1 = freshman, 2 = sophomore, 3 = junior, 4 = senior) or any other number to quit: ");
        int year = in.nextInt();
        //Hint 1
        while(year == 1 || year == 2 || year == 3 || year ==4) {
            if(year == 1) {
                year1.add(s);
            }
            if(year == 2) {
                year2.add(s);
            }
            if(year == 3) {
                year3.add(s);
            }
            if(year == 4) {
                year4.add(s);
            }
            s = new Student();
            System.out.println(s);
            System.out.println("Please enter the year of the first student as an integer between 1 & 4 (1 = freshman, 2 = sophomore, 3 = junior, 4 = senior) or any other number to quit: ");
            year = in.nextInt();
        }
        alphabetizeList(year1);
        alphabetizeList(year2);
        alphabetizeList(year3);
        alphabetizeList(year4);
    }

    public School(ArrayList<Student> y1, ArrayList<Student> y2, ArrayList<Student> y3, ArrayList<Student> y4) {
        //Initialize the instance variables to the values in the parameters.
        year1 = y1;
        year2 = y2;
        year3 = y3;
        year4 = y4;
        alphabetizeList(year1);
        alphabetizeList(year2);
        alphabetizeList(year3);
        alphabetizeList(year4);
    }

    /** getter methods - first, alphabetize the lists according to last name, then first name; then, return them.
     * Each one returns the instance variable lists after alphabetizing them.
     * Postcondition: The students in year1, year2, year3, and year4 are sorted in alphabetical
     * order by last name and then first name at return.*/
    public ArrayList<Student> getYear1() {
        alphabetizeList(year1);
        return year1;
    }
    public ArrayList<Student> getYear2() {
        alphabetizeList(year2);
        return year2;
    }
    public ArrayList<Student> getYear3() {
        alphabetizeList(year3);
        return year3;
    }
    public ArrayList<Student> getYear4() {
        alphabetizeList(year4);
        return year4;
    }

    /** Returns an alphabetized ArrayList of students representing those on the Dean's List -
     * all students with GPAs at or above 3.75.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.
     * A return, the list representing the Dean's List is full of students with GPAs at or above 3.75,
     * alphabetized by last name, then first name.*/
    public ArrayList<Student> deansList() {
        ArrayList<Student> deans = new ArrayList<>();
        for(int i = 0; i < year1.size(); i++){
            if(year1.get(i).getGpa() >= 3.75)
                deans.add(year1.get(i));
        }
        for(int i = 0; i < year2.size(); i++){
            if(year2.get(i).getGpa() >= 3.75)
                deans.add(year2.get(i));
        }
        for(int i = 0; i < year3.size(); i++){
            if(year3.get(i).getGpa() >= 3.75)
                deans.add(year3.get(i));
        }
        for(int i = 0; i < year4.size(); i++){
            if(year4.get(i).getGpa() >= 3.75)
                deans.add(year4.get(i));
        }
        alphabetizeList(deans);
        return deans;
    }

    /** calcSchoolAverageGpa()
     * Returns the value representing the average GPA of all students at a school.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.*/
    public double calcSchoolAverageGpa() {
        double avg = 0;
        int count = 0;
        for(int i = 0; i < year1.size(); i++) {
            avg += year1.get(i).getGpa();
            count++;
        }
        for(int i = 0; i < year2.size(); i++) {
            avg += year2.get(i).getGpa();
            count++;
        }
        for(int i = 0; i < year3.size(); i++) {
            avg += year3.get(i).getGpa();
            count++;
        }
        for(int i = 0; i < year4.size(); i++) {
            avg += year4.get(i).getGpa();
            count++;
        }
        return avg/count;
    }

    private void alphabetizeList(ArrayList<Student> list) {
        int min;
        Student temp;
        for(int outer=0; outer<list.size()-1; outer++) {
            min = outer;
            for(int inner=outer+1; inner<list.size(); inner++) {
                //Compare the two last names of the Students at the indices inner and min. If the last name at index inner comes before the last name at index min alphabetically, {min becomes inner}.
                if(list.get(inner).getLastName().compareTo(list.get(min).getLastName()) < 0)
                min = inner;
                //If two last names of the Students at the indices inner and min are the same, then compare the two first names at indices inner and min. If the first name at index inner comes before the first name at index min alphabetically, {min becomes inner}.
                else if(list.get(inner).getLastName().compareTo(list.get(min).getLastName()) == 0 && list.get(inner).getFirstName().compareTo(list.get(min).getFirstName()) < 0)
                min = inner;
            }

            //swap
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
    }

    /** Returns the Student object with the ID number, id. If id does not match anyone
     * in the school, return null.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.*/
    public Student findStudent(int id) {
        boolean f = false;
        for(int i = 0; i < year1.size(); i++){
            if(year1.get(i).getID() == id) {
                f = true;
                return year1.get(i);
            }
        }
        for(int i = 0; i < year2.size(); i++){
            if(year2.get(i).getID() == id) {
                f = true;
                return year2.get(i);
            }
        }
        for(int i = 0; i < year3.size(); i++){
            if(year3.get(i).getID() == id) {
                f = true;
                return year3.get(i);
            }
        }
        for(int i = 0; i < year4.size(); i++){
            if(year4.get(i).getID() == id) {
                f = true;
                return year4.get(i);
            }
        }
        return null;
    }

    /** Removes the Student objects in schools that are equal, according to the
     * equals method in the Student class so that only one remains.
     * Returns a count of the number of objects that have been removed.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects and no Student objects
     * across lists are equal. For example, there are no Student objects in year1 that are equal to
     * Student objects in year2, year3, or year4 and there are no Student objects in year2 that are equal to
     * Student objects in year1, year3, or year4, and so on.
     * Postcondition: Any Student objects in year1, year2, year3, and year4 that are doubles are removed
     * from their respective lists so that only one remains.
     * At return, a count of the number of objects that have been removed.*/
    public int removeDoubles() {
        int count = 0;
        for(int i = 0; i < year1.size(); i++){
            for(int x = i; x < year1.size(); x++){
                if(year1.get(i).getID() == year1.get(x).getID() && i != x){
                    year1.remove(x);
                    x--;
                    count++;
                }
            }
        }
        for(int i = 0; i < year2.size()-1; i++){
            for(int x = i; x < year2.size(); x++){
                if(year2.get(i).getID() == year2.get(x).getID() && i != x){
                    year2.remove(x);
                    x--;
                    count++;
                }
            }
        }
        for(int i = 0; i < year3.size()-1; i++){
            for(int x = i; x < year3.size(); x++){
                if(year3.get(i).getID() == year3.get(x).getID() && i != x){
                    year3.remove(x);
                    x--;
                    count++;
                }
            }
        }
        for(int i = 0; i < year4.size() - 1; i++){
            for(int x = i; x < year4.size(); x++){
                if(year4.get(i).getID() == year4.get(x).getID() && i != x){
                    year4.remove(x);
                    x--;
                    count++;
                }
            }
        }
        return count;
    }
}