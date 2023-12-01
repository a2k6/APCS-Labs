import java.util.Scanner;
public class Midfielder{

    private int[] interceptions;
    private int[] ballRecoveries;
    private String name;
    Scanner in = new Scanner(System.in);

    public Midfielder(){
        System.out.println("Please enter the name of the midfielder");
        name = in.nextLine();
        System.out.println("Please enter the number of interceptions per game. Enter '-1' to exit");
        int temp = in.nextInt();
        int count = 0;
        while (temp != -1){
            interceptions[count] = temp;
            count++;
            temp = in.nextInt();
        }
        System.out.println("Please enter the number of ball recoveries per game. Enter '-1' to exit");
        temp = in.nextInt();
        count = 0;
        while (temp != -1){
            ballRecoveries[count] = temp;
            count++;
            temp = in.nextInt();
        }
    }

    public Midfielder(String name, int[] interceptions, int[] ballRecoveries){
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
        return (double)temp * interceptions.length;
    }

    //Calculates the average ball recoveries per game.
    public double averageBallRecoveries(){
        int temp = 0;
        for(int i = 0; i < ballRecoveries.length; i ++){
            temp += ballRecoveries[i];
        }
        return (double)temp * ballRecoveries.length;
    }
}