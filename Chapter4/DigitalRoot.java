/* File: DigitalRoot.java
 * ---------------------------
 * Program calculates digital root of an integer
 * 
 * What is digital root?
 *  eg: 1729
 *      1+7+2+9=19
 *      1+9=10
 *      1+0=1
 */

package Chapter4;

import acm.program.*;

public class DigitalRoot extends ConsoleProgram { 
	
	public void run() {
		println("This program calculates digital root of an integer.");
		int n = readInt("Enter a positive integer: ");
		int root = 0;
		while (n > 0) {
			root += n % 10;    
			n /= 10;
			/* when finished adding digits and total is
			 * more then one digit (is not digital root)
			 * assign current root to n to continue looping
			 * and set root back to 0 */
			if (n == 0 && root >= 10) {
				n = root;
				root = 0;	
			}
		}
		println("Total is: " + root + ".");
	}
}