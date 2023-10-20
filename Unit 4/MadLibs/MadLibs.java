//Code by Adrian Panezic
import java.util.Scanner;
public class MadLibs {
    //instance variables
    private String noun;
    private String adjective;
    private String verbEndingInING;
    private String verb;
    private String bodyPart;
    private String bodyPartPlural;
    private String color;
    private String animalPlural;
    private String beverage;
    Scanner in = new Scanner(System.in);
    //constructor
    public MadLibs()
    {
        /*Please prompt the user for the instance variables above and assign the user's responses to the
         * instance variables.*/
        System.out.print("Please enter a noun: ");
        noun = in.nextLine();
        System.out.print("Please enter an adjective: ");
        adjective = in.nextLine();
        System.out.print("Please enter a verb ending in -ing: ");
        verbEndingInING = in.nextLine();
        System.out.print("Please enter a verb: ");
        verb = in.nextLine();
        System.out.print("Please enter a body part: ");
        bodyPart = in.nextLine();
        System.out.print("Please enter a plural body part: ");
        bodyPartPlural = in.nextLine();
        System.out.print("Please enter a color: ");
        color = in.nextLine();
        System.out.print("Please enter a plural animal: ");
        animalPlural = in.nextLine();
        System.out.print("Please enter a beverage: ");
        beverage = in.nextLine();
    }

    public MadLibs(String noun, String adjective, String verbEndingInING, String verb, String bodyPart, String bodyPartPlural, String color, String animalPlural, String beverage) {
        this.noun = noun;
        this.adjective = adjective;
        this.verbEndingInING = verbEndingInING;
        this.verb = verb;
        this.bodyPart = bodyPart;
        this.bodyPartPlural = bodyPartPlural;
        this.color = color;
        this.animalPlural = animalPlural;
        this.beverage = beverage;
    }

    //mutator methods
    public String createStory()
    {
        String story = "Did you know there's going to be a noun at the adjective School for Zombies?";
        story += "\nThere will be a DJ verbEndingInING adjective songs to verb to. Popular zombie dances include ";
        story += "The bodyPart verb and The verb. \nThe school gym is decorated with adjective pluralBodyPart and color pluralAnimal heads.";
        story += "\nIn between songs, there are treats like color beverage and adjective pluralBodyPart.";
        //Find the index of "noun" in story
        int nounIndex = story.indexOf("noun");
        //Replace "noun" with the instance variable noun
        story = story.substring(0, nounIndex) + noun + story.substring(nounIndex + 4);
        //Find the index of the first time "adjective" appears in story
        int adjectiveIndex = story.indexOf("adjective");
        //Create a loop that will run until there "adjective" no longer appears in story
        while(adjectiveIndex != -1)
        {
            //Replace "adjective" with the instance variable adjective
            story = story.substring(0, adjectiveIndex) + adjective + story.substring(adjectiveIndex + 9);
            //Find the next time "adjective" appears in story
            adjectiveIndex = story.indexOf("adjective");
        }
        //Find the index of "verbEndingInING" in story
        int verbEndingInINGIndex = story.indexOf("verbEndingInING");
        //Replace "verbEndingInING" with the instance variable verbEndingInING
        story = story.substring(0, verbEndingInINGIndex) + verbEndingInING + story.substring(verbEndingInINGIndex+15);
        //Find the index of the first time "verb" appears in story
        int verbIndex = story.indexOf("verb");
        //Create a loop that will run until there "verb" no longer appears in story
        while(verbIndex != -1)
        {
            //Replace "verb" with the instance variable verb
            story = story.substring(0, verbIndex) + verb + story.substring(verbIndex + 4);
            //Find the next time "verb" appears in story
            verbIndex = story.indexOf("verb");
        }
        //Find the index of "bodyPart" in story
        int bodyPartIndex = story.indexOf("bodyPart");
        //Replace "bodyPart" with the instance variable bodyPart
        story = story.substring(0, bodyPartIndex) + bodyPart + story.substring(bodyPartIndex+8);
        //Find the index of the first time "pluralBodyPart" appears in story
        int bodyPartPluralIndex = story.indexOf("pluralBodyPart");
        //Create a loop that will run until there "pluralBodyPart" no longer appears in story
        while(bodyPartPluralIndex != -1)
        {
            //Replace "pluralBodyPart" with the instance variable bodyPartPlural
            story = story.substring(0, bodyPartPluralIndex) + bodyPartPlural + story.substring(bodyPartPluralIndex + 14);
            //Find the next time "pluralBodyPart" appears in story
            bodyPartPluralIndex = story.indexOf("pluralBodyPart");
        }
        //Find the index of the first time "color" appears in story
        int colorIndex = story.indexOf("color");
        //Create a loop that will run until there "color" no longer appears in story
        while(colorIndex != -1)
        {
            //Replace "color" with the instance variable color
            story = story.substring(0, colorIndex) + color + story.substring(colorIndex + 5);
            //Find the next time ""color" appears in story
            colorIndex = story.indexOf("color");
        }
        //Find the index of "pluralAnimal" in story
        int animalPluralIndex = story.indexOf("pluralAnimal");
        //Replace "pluralAnimal" with the instance variable animalPlural
        story = story.substring(0, animalPluralIndex) + animalPlural + story.substring(animalPluralIndex+12);
        //Find the index of "beverage" in story
        int beverageIndex = story.indexOf("beverage");
        //Replace "beverage" with the instance variable beverage
        story = story.substring(0, beverageIndex) + beverage + story.substring(beverageIndex+8);
        //return story
        return story;
    }
}