/* File: OddIntegers.java
 * 
 *  Reads integer from the user and calculates the sum of odd integers.
 *  How many odd integers go into a sum? Same as value of user integer.
 *  Eg. 4 calculates sum of 1 + 3 + 5 + 7
 *  
 */

package Chapter4;

import acm.program.*;

public class OddIntegers extends ConsoleProgram {
	public void run() {
		int userNum = readInt("Enter positive integer: ");
		int total = 0;
		int nextOdd = 1; // first odd integer is 1
		for (int i = 0; i < userNum; i++) {
			total += nextOdd;  // add odd integer to total sum of odd integers
			nextOdd += 2;  // next odd integer 1+2=3 3+2=5 5+2=7
		}
		println("Sum of odd integers = " + total );
	}
}
