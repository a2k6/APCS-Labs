//Adrian Panezic
import javax.print.attribute.standard.RequestingUserName;
import java.util.Scanner;

public class RegularPolygonTester
{
    //main method
    public static void main(String[] args) {
        //create a decagon with side length 4
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = in.nextInt();
        System.out.print("Enter the side length: ");
        int s = in.nextInt();
        RegularPolygon x = new RegularPolygon(s, n);
        //call methods on decagon to find the specified measurements
        double iA = x.interiorAngle();
        double eA = x.exteriorAngle();
        double area = x.area();
        System.out.println("A regular polygon with " + x.getNumSides() + " sides of length " +
                x.getSideLength() + " has an interior angle measurement of " + iA + " degrees, " +
                "an exterior angle measurement of " + eA + " degrees, and an area of " + area + ".");
    }
}
