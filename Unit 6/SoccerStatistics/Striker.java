import java.util.Scanner;
public class Striker{
    private int[] bigChanceAttempt;
    private int[] bigChanceMade;
    private int[] goalsAttempted;
    private int[] goalsMade;
    private String name;
    Scanner in = new Scanner(System.in);

    public Striker(){
        System.out.println("Please enter the name of the striker");
        name = in.nextLine();
        System.out.println("Please enter the number of games the striker has played in.");
        int numGames = in.nextInt();
        goalsMade = new int[numGames];
        goalsAttempted = new int[numGames];
        bigChanceMade = new int[numGames];
        bigChanceAttempt = new int[numGames];
        int temp;
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of goals scored per game.");
            temp = in.nextInt();
            goalsMade[i] = temp;
        }
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of goals attempted per game.");
            temp = in.nextInt();
            goalsAttempted[i] = temp;
        }
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of big chance attempts made per game.");
            temp = in.nextInt();
            bigChanceAttempt[i] = temp;
        }
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of big chances made per game.");
            temp = in.nextInt();
            bigChanceAttempt[i] = temp;
        }
    }

    public Striker(String name, int[] bigChanceAttempt, int[] bigChanceMade, int[]goalsAttempted, int[]goalsMade){
        this.name = name;
        this.bigChanceAttempt = bigChanceAttempt;
        this.bigChanceMade = bigChanceMade;
        this.goalsAttempted = goalsAttempted;
        this.goalsMade = goalsMade;
    }

    public String getName(){
        return name;
    }

    //Calculates the overall goal percentage (goals made out of total goals).
    public double goalPercentage(){
        int temp = 0, tempG = 0;
        for(int i = 0; i < goalsAttempted.length; i++){
            tempG += goalsAttempted[i];
        }
        for(int i = 0; i < goalsMade.length; i++){
            temp += goalsMade[i];
        }
        return ((double)temp / (double)tempG);
    }

    //Calculates the overall big chances percentage (big chances completed out of total attempts).
    public double bigChancePercentage(){
        int temp = 0, tempG = 0;
        for(int i = 0; i < bigChanceAttempt.length; i++){
            tempG += bigChanceAttempt[i];
        }
        for(int i = 0; i < bigChanceMade.length; i++){
            temp += bigChanceMade[i];
        }
        return ((double)temp / (double)tempG);
    }
}
