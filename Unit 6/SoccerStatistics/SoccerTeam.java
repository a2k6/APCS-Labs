//Code by Adrian Panezic, Jack Pink, Alex Sogas, Michael BG
import java.util.Scanner;
public class SoccerTeam{

    public final int NUM_GOALKEEPERS = 1;
    public final int NUM_DEFENDERS = 2;
    public final int NUM_MIDFIELDERS = 4;
    public final int NUM_STRIKERS = 3;
    private GoalKeeper goalie;
    private Defender[] defenders = new Defender[NUM_DEFENDERS];
    private Midfielder[] midfielders = new Midfielder[NUM_MIDFIELDERS];
    private Striker[] strikers = new Striker[NUM_STRIKERS];
    private String name;
    private int gamesWon;
    private int totalGames;
    Scanner in = new Scanner(System.in);


    public SoccerTeam(){
        System.out.println("Please enter the name of soccer team:");
        String teamName = in.nextLine();
        System.out.println("Please enter the number of games the team has played in:");
        int totalGames = in.nextInt();
        System.out.println("Please enter the number of games the team has won:");
        int gamesWon = in.nextInt();

        //Goalie
        goalie = new GoalKeeper();


        //Defenders
        for(int i = 0; i < NUM_DEFENDERS; i++){
            defenders[i] = new Defender();
        }

        //Midfielders
        for(int i = 0; i < NUM_MIDFIELDERS; i++){
            midfielders[i] = new Midfielder();
        }
        for(int i = 0; i < NUM_STRIKERS; i++){
            strikers[i] = new Striker();
        }
    }

    public SoccerTeam(String name, int totalGames, int gamesWon, GoalKeeper goalie, Defender[] defenders, Midfielder[] midfielders, Striker[] strikers){
        this.name = name;
        this.totalGames = totalGames;
        this.gamesWon = gamesWon;
        this.goalie = goalie;
        this.defenders = defenders;
        this.midfielders = midfielders;
        this.strikers = strikers;
    }

    //DO NOT ALTER THIS CODE!
    public String toString(){
        String teamInfo = name + "\n";
        teamInfo += "Games Played: " + totalGames + "\n";
        teamInfo += "Games Won: " + gamesWon + "\n";
        teamInfo += "Win Percentage: + " + ((double)gamesWon/totalGames) + "\n";
        teamInfo += "Goal Keeper: " + goalie.getName() + ", Save Percentage: " + goalie.savePercentage() + "\n";
        for(int i = 0; i < defenders.length-1; i++)
            teamInfo += "Defender: " + defenders[i].getName()+ ", Average Interceptions per Game: " + defenders[i].averageInterceptions()+ ", Average Ball Recoveries per Game: " + defenders[i].averageBallRecoveries() + "\n";
        for(int i = 0; i < midfielders.length-1; i++)
            teamInfo += "Midfielder: " + midfielders[i].getName() + ", Average Interceptions per Game: " + midfielders[i].averageInterceptions()+ ", Average Ball Recoveries per Game: " + midfielders[i].averageBallRecoveries() + "\n";
        for(int i = 0; i < strikers.length-1; i++)
            teamInfo += "Striker: " + strikers[i].getName() + ", Goal Percentage: " + strikers[i].goalPercentage()+ ", Big Chance Percentage: " + strikers[i].bigChancePercentage() + "\n";
        return teamInfo;
    }
}
