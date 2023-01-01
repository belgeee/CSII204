/* File: ReverseDigits.java
 * ---------------------------
 * Program reverses digits in a given integer
 */

package Chapter4;

import acm.program.*;

public class ReverseDigits extends ConsoleProgram { 
	
	public void run() {
		println("This program reverses digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		int reversedInt = 0;
		while (n > 0) {
			/* multiply by 10 on each subsequent run after first loop run */
			if (reversedInt != 0) reversedInt *= 10;
			/* take rightmost digit from an integer */
			reversedInt += n % 10;    
			n /= 10;
		}
		println("Reverse is: " + reversedInt + ".");
	}
}
