//Adrian Panezic
public class Quadratic {
    //instance variables
    private double a;
    private double b;
    private double c;

    //constructor
    public Quadratic(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //mutator method
    public String findRoots() {
        double insideSqrt = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        double root1 = (-b + insideSqrt)/(2*a);
        double root2 = (-b - insideSqrt)/(2*a);
        String message = "The roots for a quadratic with coefficients a = " + a + " b = " + b + " and c = " + c;
        message += " are " + root1 + " and " + root2 + ".";
        return message;
    }
}
