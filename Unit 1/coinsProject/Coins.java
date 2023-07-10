public class Coins {
    public static String getChange(){
        int cents = 94;
        int quarters = cents / 25;
        int leftOverQuarters = cents - quarters * 25;
        int dimes = leftOverQuarters / 10;
        int leftOverDimes  = leftOverQuarters - dimes * 10;
        int nickels = leftOverDimes / 5;
        int leftOverNickels = leftOverDimes - nickels * 5;
        int pennies = leftOverNickels;
        return(cents + " cents: Quarter(s) " + quarters + ", Dime(s) " + dimes +", Nickel(s) " + nickels +", Penny(s) " + pennies);
    }
    public static void main(String[] args)
    {
        System.out.println(Coins.getChange());
    }
}