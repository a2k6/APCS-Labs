//Adrian Panezic
public class RegularPolygon
{
    //instance variables
    private int s;
    private int n;

    //constructor
    public RegularPolygon(int s, int n)
    {
        this.s = s;
        this.n = n;
    }
    //getter methods
    public int getNumSides()
    {
        return n;
    }

    public int getSideLength()
    {
        return s;
    }
    //mutator methods
    public double interiorAngle()
    {
        return ((double)n-2)*180/n;
    }

    public double exteriorAngle()
    {
        return 360.0/n;
    }

    public double area()
    {
        return (Math.pow(s,2)*n)/(4.0*Math.tan(Math.PI/n));
    }
    //NOTE: Do not change this code!!
    public String toString()
    {
        return "A regular polygon with " + getNumSides() + " sides of length " +
                getSideLength() + " has an interior angle measurement of " + interiorAngle() + " degrees, " +
                "an exterior angle measurement of " + exteriorAngle() + " degrees, and an area of " + area() + ".";
    }
}
