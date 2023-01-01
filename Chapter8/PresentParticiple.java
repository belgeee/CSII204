/* File: PresentParticiple.java
 * ----------------------------
 * Program creates present continuous from 
 * a English verb. 
 */

package Chapter8;

import acm.program.*;

public class PresentParticiple extends ConsoleProgram {
	
	public void run() {
		println("Program creates present continuous from English verb.");
		while (true) {
		String str = readLine("\nWrites english verb in present simple in lowercase letters:");
		println("Present Continuous of " + str + " is " + createPresentParticiple(str) + ".");
		}
	}

	private String createPresentParticiple(String word) {
		char last = word.charAt(word.length() - 1);
		char nextToLast = word.charAt(word.length() - 2);
		
		if (word.endsWith("e") && Consonant.isEnglishConsonant(nextToLast)) {
			return word.substring(0, (word.length() - 1)) + "ing";
		} else if (Consonant.isEnglishConsonant(last) && isEnglishVowel(nextToLast)) {
			return word + word.charAt(word.length() - 1) + "ing";
		} else return word + "ing";
	}
	
	private boolean isEnglishVowel (char c) {
		switch (c) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			return true;
		default:
			return false;
		}
	}
	
}
