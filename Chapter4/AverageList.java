/* File: AverageList.java
 * -------------------------
 * Program calculates average from a list of integers 
 * given by a user. Sentinel to mark end of input is -1. 
 */

package Chapter4;

import acm.program.*;

public class AverageList extends ConsoleProgram {
	public void run() {
		println("This program adds a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println(" to signal the end of the list.");
		int total = 0;
		/* divide by total number of user inputs to calculate an average */
		int numOfInputs = 0;
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL) break;
			total += value;
			numOfInputs += 1;
		}
		/* use type cast to get average as a real number - two integer division gives only integer */
		double avgScore = (double) total / numOfInputs;
		println("The average of all the scores is " + avgScore + ".");
	}
	
/* Specifies the value of the sentinel */
	private static final int SENTINEL = -1;
	
}
