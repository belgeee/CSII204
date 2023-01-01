/* File: Palindrome.java
 * ---------------------
 * Program checks if a string is palindrome.
 */

package Chapter8;

import acm.program.*;

public class Palindrome extends ConsoleProgram {
	
	public void run() {
		String str = readLine("Write single word to check if it is a palindrome: ");
		if (isPalindrome(str)) {
			println("\n" + str + " is a palindrome.");
		} else {
			println("\n" + str + " is not a palindrome.");
		}
	}
	
	public boolean isPalindrome(String s) {
		int a = s.length();
		for (int i = 0; i < (s.length() / 2); i++) {
			if (s.charAt(i) != s.charAt(a - 1)) {  // (a-1) IMPORTANT last character in a string is on a position str.lenght() - 1
				return false;
			}
			a -= 1;
		}
		return true;
	}

}
