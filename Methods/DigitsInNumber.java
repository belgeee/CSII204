/* File: DigitsInNumber.java
 * 
 * This program counts the number of digits in an integer
 */

package Methods;

import acm.program.*;

public class DigitsInNumber extends ConsoleProgram{
	
	public void run() {
		int a = readInt("Enter number: ");
		println(a + " has " + countDigits(a) + " digits.");
	}
	
	private int countDigits(int n) {
/* assume entry is positive number */
		int numOfDigits = 1;
		while(true) {
			if((n / 10) == 0) break;
			numOfDigits++;
			n /= 10;
		}
		return numOfDigits;
	}
	
}
