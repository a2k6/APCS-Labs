//Code by Adrian Panezic
import java.util.Scanner;

public class CarRentalClient
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your car's make: ");
        String make = in.nextLine();
        System.out.print("Please enter your car's model: ");
        String model = in.nextLine();
        System.out.print("Please enter your car's year: ");
        String year = in.nextLine();
        System.out.print("Please enter your car's plate: ");
        String plate = in.nextLine();
        CarRental car = new CarRental(make, model, year, plate);
        System.out.println(car);
    }
}
