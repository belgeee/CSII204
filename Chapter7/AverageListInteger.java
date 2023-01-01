
/* File: AverageListInteger.java
 * -------------------------
 * Program calculates average from a list of integers 
 * given by a user. Sentinel to mark end of input is empty space.

 */

package Chapter7;

import acm.program.*;

public class AverageListInteger extends ConsoleProgram {
	public void run() {
		println("This program adds a list of integers.");
		println("Enter values, one per line, using blank line ");
		println("to signal the end of the list.");
		
		int total = 0;
		/* divide by total number of user inputs to calculate an average */
		int numOfInputs = 0;
		String userInput = "";
		Integer value = new Integer(0);
		
		while (true) {
			userInput = readLine(" ? ");
			if (userInput.equals(" ")) break;
			value = Integer.parseInt(userInput);
			total += value;
			numOfInputs += 1;
		}
		/* use type cast to get average as a real number - two integer division gives only integer */
		double avgScore = (double) total / numOfInputs;
		println("The average of all the scores is " + avgScore + ".");
	}
	
}
