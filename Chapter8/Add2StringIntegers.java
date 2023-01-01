/* File: Add2StringIntegers.java
 * -----------------------------
 * Program takes 2 strings from the user
 * and translates them into integers.
 * Adds them together.
 */

package Chapter8;

import acm.program.*;

public class Add2StringIntegers extends ConsoleProgram {
	
	public void run() {
		
		println("This program adds two integers.");
		
		String s1 = readLine("Enter n1: ");
		while (!testInput(s1)) {
			println("Illegal integer format");
			s1 = readLine("Enter n1: ");
		}
		int a = myReadInt(s1);
		
		String s2 = readLine("Enter n2: ");
		while (!testInput(s2)) {
			println("Illegal integer format");
			s2 = readLine("Enter n2: ");
		}
		int b = myReadInt(s2);
		
		println("The total is " + (a + b));
	}
	
/* convert string to integer */
	private int myReadInt(String prompt) {
		char ch;	
		int result = 0;
		int multiplier = 1;
		if (prompt.charAt(0) == '-') {
			for (int i = prompt.length() - 1; i > 0; i--) {
				ch = prompt.charAt(i);
				result += Character.getNumericValue(ch) * multiplier;
				multiplier *= 10;
			}
			result = -result;
		} else {
			for (int i = prompt.length() - 1; i >= 0; i--) {
				ch = prompt.charAt(i);
				result += Character.getNumericValue(ch) * multiplier;
				multiplier *= 10;
				} 
			}
		return result;
	}
	
/* check for proper input format */
	private boolean testInput(String str) {
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if ( !(ch >= '0' && ch <= '9') ) {
				if (i == 0 && ch == '-') { }       // do nothing if first character is minus
					else {
			return false;    // false if not a digit character found
				}
			}
		}
		return true;
	}
}
