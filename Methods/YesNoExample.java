/* File: YesNoExample.java
 * ---------------------------
 * This program is an example of a predicate method - method
 * that returns boolean type. Predicate method gets a string type 
 * as an argument, prints it for the user on screen, and returns 
 * true or false depending on user input.
 */

package Methods;

import acm.program.*;

public class YesNoExample extends ConsoleProgram {
	
	public void run() {
		boolean question = askYesNoQuestion("Would you like instructions? ");
		if(question == true) println("Your answer is good, but i don't have any.");
		if(question == false) println("Your answer is also good, because i don't have any.");
	}

	private boolean askYesNoQuestion(String prompt) {
			String answer;
		while(true) {
			answer = readLine(prompt);
			if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) break;
			println("Please answer yes or no.");
		}
		if (answer.equalsIgnoreCase("yes")) {
			return true;
			}
			return false;
	} 
}
	
