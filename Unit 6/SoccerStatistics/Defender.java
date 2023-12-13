//Code by Adrian Panezic
import java.util.Scanner;
public class Defender {

    private int[] interceptions;
    private int[] ballRecoveries;
    private String name;
    Scanner in = new Scanner(System.in);

    public Defender(){
        System.out.println("Please enter the name of the defender");
        name = in.nextLine();
        System.out.println("Please enter the number of games the defender has played in.");
        int numGames = in.nextInt();
        interceptions = new int[numGames];
        ballRecoveries = new int[numGames];
        int temp;
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of interceptions per game.");
            temp = in.nextInt();
            interceptions[i] = temp;
        }
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of ball recoveries per game.");
            temp = in.nextInt();
            ballRecoveries[i] = temp;
        }
    }

    public Defender(String name, int[] interceptions, int[] ballRecoveries)
    {
        this.name = name;
        this.interceptions = interceptions;
        this.ballRecoveries = ballRecoveries;
    }

    //Write the getName() method
    public String getName(){
        return name;
    }
    //Calculates the average interceptions per game.
    public double averageInterceptions(){
        int temp = 0;
        for(int i = 0; i < interceptions.length; i ++){
            temp += interceptions[i];
        }
        return (double)temp / interceptions.length;
    }

    //Calculates the average ball recoveries per game.
    public double averageBallRecoveries() {
        int temp = 0;
        for(int i = 0; i < ballRecoveries.length; i ++){
            temp += ballRecoveries[i];
        }
        return (double)temp / ballRecoveries.length;
    }
}