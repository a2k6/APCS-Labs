import java.util.Scanner;
public class MadLibsRevisitedClient {
    public static void main(String[] args) {
        /*Create a loop to continue asking the user if they would like to create a new story.
        * If the user types any version of the word "no" the loop should end so that a story will not be written.*/
        //Prompt the user to ask if they want to play
        //read in whether or not the user wants to play
        //trim the user's response
        //Create the loop
        Scanner in = new Scanner(System.in);
        System.out.println("Time to play a game of MadLibs! If you wish to close the program, just enter 'no' after a game of madLibs. Press enter to continue.");
        String ans = in.nextLine().trim().toLowerCase();
        while (!ans.equals("no")) {
            MadLibsRevisited story = new MadLibsRevisited();
            story.printLists();
            System.out.println(story.createStory());
            System.out.println("Would you like to continue playing?");
            ans = in.nextLine().trim().toLowerCase();
        }
            //Create a new MadLibs story object.
            //call the printLists method to make sure all of the words entered are in the correct list
            //call the createStory method to print out the story.
            //Prompt the user to ask if they want to continue playing
            //read in whether or not the user wants to play
            //trim the user's response

    }
}
