/* File: FindLargest.java
 * ---------------------------
 * Program finds largest integer from a list gives by user
 */

package Chapter4;

import acm.program.*;

public class FindLargest extends ConsoleProgram {
	
	public void run() {
		println("This program finds the largest integer in a list.");
		println("Enter values, one per line, using a 0 to signal");
		println("the end of the list.");
		
		int largest = 0; 
		int secondLargest = 0;
		int userNumber = -1;
		
		while (userNumber != SENTINEL) {
			userNumber = readInt("? ");
			if (largest < userNumber) largest = userNumber;
		    if ((userNumber < largest) && (userNumber > secondLargest)) secondLargest = userNumber;
		}
		println("The largest value is " + largest);
		println("The second largest value is " + secondLargest);
	}

	private static final int SENTINEL = 0;
	
}
