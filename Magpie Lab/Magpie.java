//Code by Adrian Panezic
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie {
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		// Refinement--make sure the goal isn't part of a word
		while (psn >= 0) {
			// Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			// Determine the values of psn, before, and after at this point
			// If before and after aren't letters, we've found the word
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) /*before is not a letter*/ && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
				return psn;
			}
			// The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),psn + 1);
		}
		return -1;
	}

	private String transformIWantToStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
			statement = statement.substring(0, statement.length() - 1);
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}

	/**  ADD CODE HERE!
	 * Take a statement with "I want <something>." and transform it into
	 * Would you really be happy if you had <something>?
	 * @param statement the user statement, assumed to contain "I want"
	 * @return the transformed statement
	 */
	private String transformIWantStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
			statement = statement.substring(0, statement.length() - 1);
		int psn = findKeyword (statement, "I want", 0);
		String restOfStatement = statement.substring(psn + 6).trim();
		return "Would you really be happy if you had " + restOfStatement + "?";
	}

	/**
	 * Take a statement with "you <something> me" and transform it into
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
			statement = statement.substring(0, statement.length() - 1);
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		String statementAfter = statement.substring(psnOfMe + 2).trim();
		return "What makes you think that you " + restOfStatement + " me " + statementAfter + "?";
	}

	/**
	 * Take a statement with "I <something> you" and transform it into
	 * "Why do you <something> me?"
	 * @param statement the user statement, assumed to contain "I" followed by something "you"
	 * @return the transformed statement
	 */
	private String transformIYouStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
			statement = statement.substring(0, statement.length() - 1);
		int psnOfI = findKeyword (statement, "I", 0);
		int psnOfYou = findKeyword (statement, "you", psnOfI + 3);
		String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
		String statementAfter = statement.substring(psnOfYou + 3).trim();
		return "Why do you " + restOfStatement + " I " + statementAfter + "?";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		}
		else if ((findKeyword(statement, "mother", 0) >= 0)
				|| (findKeyword(statement, "father", 0) >= 0)
				|| (findKeyword(statement, "sister",0) >= 0)
				|| (findKeyword(statement, "brother",0) >= 0)) {
			response = "Tell me more about your family.";
		}
		else if ((findKeyword(statement, "cat", 0) >= 0)
				|| (findKeyword(statement, "dog", 0) >= 0)) {
			response = "Tell me more about your pets.";
		}
		else if ((findKeyword(statement, "Mrs. Keate", 0) >= 0)) {
			response = "She sounds like a good teacher";
		}
		else if ((findKeyword(statement, "drive", 0) >= 0)) {
			response = "How far is that?";
		}
		else if ((findKeyword(statement, "row", 0) >= 0)) {
			response = "At what split?";
		}
		else if ((findKeyword(statement, "workout", 0) >= 0)) {
			response = "How hard did you find it?";
		}
		else if (statement.trim().length() == 0) {
			response = "Please enter a valid input";
		}
		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0) {
			response = transformIWantToStatement(statement);
		}
		else if (findKeyword(statement, "I want", 0) >= 0) {
			response = transformIWantStatement(statement);
		}
		else if (findKeyword(statement, "you", 0) >= 0 && findKeyword(statement, "me", 0) >= 0) {
			response = transformYouMeStatement(statement);
		}
		else if (findKeyword(statement, "I", 0) >= 0 && findKeyword(statement, "you", 0) >= 0) {
			response = transformIYouStatement(statement);
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1) {
			response = "Hmmm.";
		}
		else if (whichResponse == 2) {
			response = "Do you really think so?";
		}
		else if (whichResponse == 3) {
			response = "You don't say.";
		}
		else if (whichResponse == 3) {
			response = "How come?";
		}
		else if (whichResponse == 3) {
			response = "That's an option that bears thinking about.";
		}
		return response;
	}
}
