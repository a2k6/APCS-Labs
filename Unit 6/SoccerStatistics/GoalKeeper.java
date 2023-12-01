import java.util.Scanner;
public class GoalKeeper {

    private int[] goalsAgainst;
    private int[] saves;
    private String name;
    Scanner in = new Scanner(System.in);

    public GoalKeeper(){
        System.out.println("Please enter the name of the goalkeeper");
        name = in.nextLine();
        System.out.println("Please enter the number of goals made on the goalkeeper per game. Enter '-1' to exit");
        int temp = in.nextInt();
        int count = 0;
        while (temp != -1){
            goalsAgainst[count] = temp;
            count++;
            temp = in.nextInt();
        }
        System.out.println("Please enter the number of saves per game. Enter '-1' to exit");
        temp = in.nextInt();
        count = 0;
        while (temp != -1){
            saves[count] = temp;
            count++;
            temp = in.nextInt();
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
        return (double)saves.length / (double) total;
    }
}