//Code by Adrian Panezic
import javax.swing.text.Highlighter;

public class CarRental {
    //instance variables
    private String make = "Toyota";
    private String model = "Highlander";
    private String year = "2019";
    private String licensePlate = "ABC123";

    //constructor
    public CarRental(String make, String model, String year, String licensePlate)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }
    //getter methods
    public String getMake() {return make;}
    public String getModel()
    {
        return model;
    }

    public String getYear() {return year;}

    public String getLicensePlate() {return licensePlate;}
    //mutator methods
    public String rentalCode()
    {
        String code = make.substring(0,3).toUpperCase() + model.substring(0, 3).toUpperCase() + year.substring(2) + "-" + (licensePlate.charAt(0) + licensePlate.charAt(1) + licensePlate.charAt(2) + Integer.valueOf(licensePlate.substring(3)));
        return code;
    }

    //NOTE: Do not change this code!!
    public String toString()
    {
        return "The rental code for the " + year + " " + make + " " + model +
                " with a license plate of " + licensePlate + " is " + rentalCode() + ".";
    }
}