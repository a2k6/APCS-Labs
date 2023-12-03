import java.util.Scanner;

public class SoccerStatisticsClient
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Create a player of the position of your group below to see if your code works as intended.

//        SoccerTeam team1 = new SoccerTeam();
//        System.out.print(team1);

        //DO NOT ALTER THE CODE BELOW!!! IT WILL BE USED TO TEST OUR PROGRAM!
        Defender[] defenders = new Defender[1];
        int[] interceptions = {4, 6};
        int[] ballRecoveries = {4, 9};
        defenders[0] = new Defender("Mike", interceptions, ballRecoveries);
        int[] saves = {4, 6};
        int[] goalsMade = {6, 4};
        GoalKeeper goalKeeper = new GoalKeeper("Liz", goalsMade, saves);
        Midfielder[] midfielders = new Midfielder[1];
        int[] interceptions1 = {3, 7};
        int[] ballRecoveries1 = {12, 4};
        midfielders[0] = new Midfielder("Jolie", interceptions1, ballRecoveries1);
        Striker[] strikers = new Striker[1];
        int[] bigChanceAttempt = {10, 10};
        int[] bigChanceMade = {5, 9};
        int[] goalsAttempted = {10, 10};
        int[] goalsScored = {5, 9};
        strikers[0] = new Striker("Izzy", bigChanceAttempt, bigChanceMade, goalsAttempted, goalsScored);
        int totalGames = 10;
        int gamesWon = 9;
        SoccerTeam team1 = new SoccerTeam("Unicorns", totalGames, gamesWon, goalKeeper, defenders, midfielders, strikers);
        System.out.print(team1);
    }
}