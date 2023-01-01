/* File: OrdinalNumbering.java
 * ---------------------------
 * Program returns proper position for numbers
 * in a sequence.
 */

package Chapter8;

import acm.program.*;

public class OrdinalNumbering extends ConsoleProgram {
	
	public void run() {
		println("Program creates ordinal form (position in a sequence) from given number");
		while(true) {
		int num = readInt("\nWrite integer number: ");
		println("Position: " + createOrdinalForm(num));
		}
	}
	
	private String createOrdinalForm (int n) {
		
		int m = n;
		while (m > 100) {  // get two digit number from 1 - 99
			m -= 100;
		}
		
		switch (m) {
		    case 11: case 12: case 13:  // special case if number ends on 11, 12 or 13
			return n + "th";
		}
		
		/* take remainder from two digit number (applies even to 1 digit number, eg; 5 % 10 is 0 reminder 5 */
		m %= 10;
		switch (m) {
			case 1: return n + "st";
			case 2: return n + "nd";
			case 3: return n + "rd";
			default: return n + "th";
		}
	}
}
