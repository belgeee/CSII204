/* File: CapitalizeFirstLetter.java
 * --------------------------------
 * This program makes first letter in a word
 * a capital letter, remaining letters are lower-case letters.
 * All other characters stay unchanged.
 */

package Chapter8;

import acm.program.*;

public class CapitalizeFirstLetter extends ConsoleProgram {
	
	public void run() {
		String s = readLine("Write single word:");
		println("\nCapitalized version is: " + capitalize(s));
	}

	private String capitalize(String str) {
		String result = " ";
		result += Character.toUpperCase(str.charAt(0));
		
		for(int i = 1; i < str.length(); i++) {
			result += Character.toLowerCase(str.charAt(i));
		}
		return result;
	}
	
}
