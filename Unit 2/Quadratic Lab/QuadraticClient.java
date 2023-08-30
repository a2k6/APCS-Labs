//Adrian Panezic
import java.util.Scanner;
public class QuadraticClient
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value for a: ");
        double a = in.nextDouble();
        System.out.print("Please enter a value for b: ");
        double b = in.nextDouble();
        System.out.print("Please enter a value for c: ");
        double c = in.nextDouble();
        //create a Quadratic object
        Quadratic x = new Quadratic(a, b, c);
        //call the findRoots method in the print statement
        System.out.println(x.findRoots());
    }
}