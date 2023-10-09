//Code by Adrian Panezic
import java.util.Scanner;
public class LoanTableClient {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the item for which you are taking out a loan:");
        String item = in.nextLine();
        System.out.println("Please enter the price of the item:");
        int principal = Integer.parseInt(in.nextLine());
        System.out.println("Please enter the low interest rate:");
        double low = Double.parseDouble(in.nextLine());
        System.out.println("Please enter the high interest rate:");
        double high = Double.parseDouble(in.nextLine());
        System.out.println("Please enter the increment:");
        double increment = Double.parseDouble(in.nextLine());
        System.out.println("Please enter the total years to pay off the loan");
        int years = Integer.parseInt(in.nextLine());
        //Create a LoanTable object.
        LoanTable loanTable = new LoanTable(item, principal, low, high, increment, years);
        //Run the printTable method.
        loanTable.printTable();
    }
}
