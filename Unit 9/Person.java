public class Person{
    private String myName ;   //name of the person
    private int myAge;        //person's age
    private String myGender;  //person’s gender

    // constructor
    public Person(String name, int age, String gender){
        myName = name;
        myAge = age;
        myGender = gender;
    }

    //getter methods
    public int getAge(){
        return myAge;
    }
    public String getGender(){
        return myGender;
    }
    public String getName(){
        return myName;
    }

    //setter methods
    public void setName(String name){
        myName = name;
    }
    public void setAge(int age){
        myAge = age;
    }
    public void setGender(String gender){
        myGender = gender;
    }

    public String toString(){
        return myName + ", age: " + myAge + ", gender: " +
                myGender;
    }
}
