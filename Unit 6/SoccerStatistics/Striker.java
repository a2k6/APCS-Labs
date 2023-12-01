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
        System.out.println("Please enter the number of goals attempted per game. Enter a '-1' to exit");
        int temp = in.nextInt();
        int count = 0;
        while (temp != -1){
            goalsAttempted[count] = temp;
            count++;
            temp = in.nextInt();
        }
        System.out.println("Please enter the number of goals scored per game. Enter a '-1' to exit");
        temp = in.nextInt();
        count = 0;
        while (temp != -1){
            goalsMade[count] = temp;
            count++;
            temp = in.nextInt();
        }
        System.out.println("Please enter the number of big chance attempts made per game. Enter a '-1' to exit");
        temp = in.nextInt();
        count = 0;
        while (temp != -1){
            bigChanceAttempt[count] = temp;
            count++;
            temp = in.nextInt();
        }
        System.out.println("Please enter the number of big chances made per game. Enter a '-1' to exit");
        temp = in.nextInt();
        count = 0;
        while (temp != -1){
            bigChanceMade[count] = temp;
            count++;
            temp = in.nextInt();
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
            temp += goalsAttempted[i];
        }
        for(int i = 0; i < goalsMade.length; i++){
            tempG += goalsMade[i];
        }
        return ((double)temp * (double)tempG) * 100;
    }

    //Calculates the overall big chances percentage (big chances completed out of total attempts).
    public double bigChancePercentage(){
        int temp = 0, tempG = 0;
        for(int i = 0; i < bigChanceAttempt.length; i++){
            temp += bigChanceAttempt[i];
        }
        for(int i = 0; i < bigChanceMade.length; i++){
            tempG += bigChanceMade[i];
        }
        return ((double)temp * (double)tempG) * 100;
    }
}
