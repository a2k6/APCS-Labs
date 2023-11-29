import java.util.Scanner;
public class MadLibsRevisited {
   //instance variables
   private String[] nouns;
   private String[] numbers;
   private String[] verbs;
   private String[] verbsEndingInING;
   private String[] food;
   private String[] places;
   Scanner in = new Scanner(System.in);
   //constructor
   public MadLibsRevisited()
   {
      //Initialize the arrays nouns, verbs, adjectives, adverbs, and interjections and fill them with user input.
      nouns = new String[1];
      for(int i = 0; i < nouns.length; i++) {
         System.out.print("Please enter a noun: ");
         nouns[i] = in.next();
      }
      numbers = new String[2];
      for(int i = 0; i < numbers.length; i++)
      {
         System.out.print("Please enter a number: ");
         numbers[i] = in.next();
      }
      verbs = new String[3];
      for(int i = 0; i < verbs.length; i++)
      {
         System.out.print("Please enter a verb: ");
         verbs[i] = in.next();
      }
      verbsEndingInING = new String[1];
      for(int i = 0; i < verbsEndingInING.length; i++)
      {
         System.out.print("Please enter a verb ending in -ing: ");
         verbsEndingInING[i] = in.next();
      }
      food = new String[2];
      for(int i = 0; i < food.length; i++)
      {
         System.out.print("Please enter a food: ");
         food[i] = in.next();
      }
      places = new String[2];
      for(int i = 0; i < places.length; i++)
      {
         System.out.print("Please enter a place: ");
         places[i] = in.next();
      }
//      adverbs = new String[8];
//      for(int i = 0; i < adverbs.length; i++)
//      {
//         System.out.print("Please enter an adverb: ");
//         adverbs[i] = in.next();
//      }
//      interjections = new String[2];
//      for(int i = 0; i < interjections.length; i++)
//      {
//         System.out.print("Please enter an interjection: ");
//         interjections[i] = in.next();
//      }
//      places = new String[1];
//      for(int i = 0; i < places.length; i++)
//      {
//         System.out.print("Please enter a place: ");
//         places[i] = in.next();
//      }
//      bodyParts = new String[5];
//      for(int i = 0; i < bodyParts.length; i++)
//      {
//         System.out.print("Please enter a body part: ");
//         bodyParts[i] = in.next();
//      }
   }

   //getter methods
   private void printNouns()
   {
      //Print the list of nouns in one line.
      System.out.print("\nNouns: ");
      for(int i = 0; i < nouns.length; i++){
         System.out.print(nouns[i] + " ");
      }
   }

   private void printNumbers()
   {
      //Print the list of nouns in one line.
      System.out.print("\nNumbers: ");
      for(int i = 0; i < numbers.length; i++){
         System.out.print(numbers[i] + " ");
      }
   }

   private void printVerbs()
   {
      //Print the list of verbs in one line.
      System.out.print("\nVerbs: ");
      for(int i = 0; i < verbs.length; i++){
         System.out.print(verbs[i] + " ");
      }
   }

   private void printVerbsEndingInING()
   {
      //Print the list of verbs in one line.
      System.out.print("\nVerbs ending in -ing: ");
      for(int i = 0; i < verbsEndingInING.length; i++){
         System.out.print(verbsEndingInING[i] + " ");
      }
   }

   private void printFood()
   {
      //Print the list of adjectives in one line.
      System.out.print("\nFoods: ");
      for(int i = 0; i < food.length; i++){
         System.out.print(food[i] + " ");
      }
   }

//   private void printAdverbs()
//   {
//      //Print the list of adverbs in one line.
//      System.out.print("\nAdverbs: ");
//      for(int i = 0; i < adverbs.length; i++){
//         System.out.print(adverbs[i] + " ");
//      }
//   }
//
//   private void printInterjections()
//   {
//      //Print the list of interjections in one line.
//      System.out.print("\nInterjections: ");
//      for(int i = 0; i < interjections.length; i++){
//         System.out.print(interjections[i] + " ");
//      }
//   }
//
//   private void printPlaces()
//   {
//      //Print the list of interjections in one line.
//      System.out.print("\nPlaces: ");
//      for(int i = 0; i < places.length; i++){
//         System.out.print(places[i] + " ");
//      }
//   }
//
//   private void printBodyParts()
//   {
//      //Print the list of verbs in one line.
//      System.out.print("\nBody Parts: ");
//      for(int i = 0; i < bodyParts.length; i++){
//         System.out.print(bodyParts[i] + " ");
//      }
//   }

   public void printLists()
   {
        //Print all of the lists out in separate lines.
        printNouns();
        printNumbers();
        printVerbs();
        printVerbsEndingInING();
        printFood();
   }

   //mutator methods
   public String createStory()
   {
      String story = "\nWhere I live, June number is the longest day of the year. This means that the noun verb for number hours! It also means that kids have more time to verb place and go verbing at the place. Maybe the food truck will be in our neighborhood even later, too! This is the best day to verb my favorite summer treat: food.";
       int nounIndex = story.indexOf("noun");
       int i = 0;
       while(nounIndex != -1 && i < nouns.length) {
           story = story.substring(0, nounIndex) + nouns[i] + story.substring(nounIndex + 4);
           nounIndex = story.indexOf("noun", nounIndex+4);
           i++;
       }
       int numberIndex = story.indexOf("number");
       i = 0;
       while(numberIndex != -1 && i < numbers.length) {
           story = story.substring(0, numberIndex) + numbers[i] + story.substring(numberIndex + 6);
           numberIndex = story.indexOf("number", numberIndex+6);
           i++;
       }
       int verbIndex = story.indexOf("verb");
       i = 0;
       while(verbIndex != -1 && i < verbs.length) {
           story = story.substring(0, verbIndex) + verbs[i] + story.substring(verbIndex + 4);
           verbIndex = story.indexOf("verb", verbIndex+4);
           i++;
       }
       int placeIndex = story.indexOf("place");
       i = 0;
       while(placeIndex != -1 && i < places.length)
       {
           story = story.substring(0, placeIndex) + places[i] + story.substring(placeIndex + 5);
           placeIndex = story.indexOf("place", placeIndex+5);
           i++;
       }
       int foodIndex = story.indexOf("food");
       i = 0;
       while(foodIndex != -1 && i < food.length)
       {
           story = story.substring(0, foodIndex) + food[i] + story.substring(foodIndex + 4);
           foodIndex = story.indexOf("food", foodIndex+4);
           i++;
       }
      return story;
   }
}