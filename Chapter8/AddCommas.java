/* File: AddCommas.java
 * --------------------
 * Program inserts commas into numbers
 * with many digits to calrify their value
 * for human readers.
 */

package Chapter8;

import acm.program.*;

public class AddCommas extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String str = readLine("Enter a number: ");
			println(addCommas(str));
		}
	}
	
	private String addCommas(String digits) {
		String withCommas = "";
		/* keep track of characters */
		int a = 0;
        /* start for loop from last character */
		for (int i = digits.length() - 1; i >= 0; i--) {
			/* push character in front of other characters */
			withCommas = digits.charAt(i) + withCommas;
			a += 1;
			/* add commas after every 3 character
			 * don't add if comma is first character in new string */
			if (a == 3 && i != 0) { 
				withCommas = ',' + withCommas;
				a = 0;
			}
			
			}
		return withCommas;
		}
	
}


