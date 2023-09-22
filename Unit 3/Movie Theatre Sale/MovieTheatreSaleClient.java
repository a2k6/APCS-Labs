//Code by Adrian Panezic
public class MovieTheatreSaleClient {
    public static void main(String[] args)
    {
        /*Create a MovieTheatreSale object called sale here using the no-parameter constructor.*/
        MovieTheatreSale sale = new MovieTheatreSale();
        /*Check if the rating is R or r here. If so, you will need to check the customer's ID.*/

        if((sale.getRating()).equals("R")||(sale.getRating()).equals("r")) {
            if(!(sale.checkID())) {
                System.out.println("You are not of the correct age to buy tickets for this movie.");
                System.exit(1);
            }
        }
        //Do not change (it will help you check your code).
        System.out.print(sale);
    }
}
