public class LotteryRevisitedClient {
   public static void main(String[] args) {
      //Create the customer's lotto ticket. These numbers should be chosen by the customer and hard coded in.
      LotteryRevisited ticket = new LotteryRevisited(10, 30, 34, 56, 24, 33);
      //Create the random winning pick!
      LotteryRevisited winningCombo = new LotteryRevisited();
      //Print out the customer's ticket and the winning pick, clearly stating which is which.
      System.out.println("Your Ticket: " + ticket.getLottoNumbers() + "\nWinning Pick: " + winningCombo.getLottoNumbers());
      //Check if the customer won!
      ticket.checkTicket(winningCombo);
   }
}