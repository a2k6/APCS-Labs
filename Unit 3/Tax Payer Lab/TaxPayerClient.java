import java.util.Scanner;
public class TaxPayerClient {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.println("Please enter your marital status:");
        String person1Status = in.nextLine();
        System.out.println("Please enter your income:");
        int person1Income = in.nextInt();
        //Create person1, an object of the TaxPayer class, with a status of single and an income of 100000.
        TaxPayer person1 = new TaxPayer(person1Status, person1Income);
        //Fill in the print statement with the appropriate method calls to print out the information stated.
        System.out.println("Marital Status: " + person1.getMaritalStatus() + "\nIncome: " + person1.getIncome() + "\nTaxes: " + person1.calcTax() + "\n");

        //Create person2, an object of the TaxPayer class, with a status of married and an income of 200000.
        System.out.println("Please enter your marital status:");
        String person2Status = in1.nextLine();
        System.out.println("Please enter your income:");
        int person2Income = in1.nextInt();
        TaxPayer person2 = new TaxPayer(person2Status, person2Income);
        //Fill in the print statement with the appropriate method calls to print out the information stated.
        System.out.println("Marital Status: " +
                person2.getMaritalStatus() + "\nIncome: " + person2.getIncome() + "\nTaxes: " + person2.calcTax());
    }
}