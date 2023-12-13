//Code by Adrian Panezic
import java.util.Scanner;
public class GoalKeeper {

    private int[] goalsAgainst;
    private int[] saves;
    private String name;
    Scanner in = new Scanner(System.in);

    public GoalKeeper(){
        System.out.println("Please enter the name of the goalkeeper");
        name = in.nextLine();
        System.out.println("Please enter the number of games the goalkeeper has played in.");
        int numGames = in.nextInt();
        goalsAgainst = new int[numGames];
        saves = new int[numGames];
        int temp;
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of goals made on the goalkeeper per game.");
            temp = in.nextInt();
            goalsAgainst[i] = temp;
        }
        for(int i = 0; i < numGames; i++){
            System.out.println("Please enter the number of goals made on the goalkeeper per game.");
            temp = in.nextInt();
            saves[i] = temp;
        }
    }

    public GoalKeeper(String name, int[] goalsAgainst, int[] saves)
    {
        this.name = name;
        this.goalsAgainst = goalsAgainst;
        this.saves = saves;
    }

    //Write the getName() method
    public String getName(){
        return name;
    }
    //Calculates the goal keeper's overall save percentage.
    public double savePercentage() {
        int total = goalsAgainst.length + saves.length;
        return saves.length / (double)total;
    }
}