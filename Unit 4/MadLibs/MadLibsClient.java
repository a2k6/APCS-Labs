//Code by Adrian Panezic
import java.util.Scanner;
public class MadLibsClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Time to play a game of MadLibs! If you wish to close the program, just enter 'no' after a game of madLibs. Press enter to continue.");
        String ans = in.nextLine().trim().toLowerCase();
        while (!ans.equals("no")) {
            MadLibs story = new MadLibs();
            System.out.println(story.createStory());
            System.out.println("Would you like to continue playing?");
            ans = in.nextLine().trim().toLowerCase();
        }
    }
}
