//Code by Adrian Panezic
public class LoanTable {
   //instance variables (attributes)
   private String item;
   private double principal;
   private double lowRate;
   private double highRate;
   private double increment;
   private int years;

   //constructors
   public LoanTable() {
      System.out.print("You have not included enough information. Please rerun the program with more information.");
      System.exit(1);
   }

   public LoanTable(String myItem, double myPrincipal, double myLowRate, double myHighRate, double myIncrement, int myYears) {
      item = myItem;
      principal = myPrincipal;
      lowRate = myLowRate;
      highRate = myHighRate;
      increment = myIncrement;
      years = myYears;
   }

   public void printTable() {
      //Print out the title of the table with the name of the item the user is taking a loan on
      System.out.println("Monthly Payment Analysis for a(n) " + item);
      System.out.println("Annual Interest Rate          Monthly Payment");
      //Create a for-loop to make the table. For this assignment, you will not need a nested for loop.
      for(double i = lowRate; i <= highRate; i+= increment){
         //Makes the rate into its correct decimal value for calculations
         i /= 100;
         //Calculate the monthly payment using the given formula
         double mp = (principal * (i / 12) * Math.pow(( 1 + (i / 12)), (years * 12))) / ((Math.pow((1 + (i / 12)), (years * 12))) - 1);
         /* Do not delete the spaces!*/
        System.out.println((i*100) + "                          " + mp);
        //Sets the rate back so the loop will correctly increment
        i*=100;
      }
   }
}