/* File: Plural.java
 * -----------------
 * Program returns a plural of a word.
 */

package Chapter8;

import acm.program.*;

public class Plural extends ConsoleProgram {
	
	public void run() {
		while (true) {
		String str = readLine("Write a single word to convert to plural form:");
		println("Plural of this word is: " + createRegularPlural(str) );
		}
	}

	private String createRegularPlural (String str) {
		char last = str.charAt(str.length() - 1);
		char nextToLast = str.charAt(str.length() - 2);
		switch (last) {
		case 's': case 'x': case 'z':
			return str + "es";
		}
		
		if (last == 'h' && nextToLast == 'c' || nextToLast == 's') {
			return str + "es";
		} else if (last == 'y' && Consonant.isEnglishConsonant(nextToLast)) {
			String newString = "";
			for (int i = 0; i < str.length() - 1; i++) newString += str.charAt(i);
			return newString + "ies";
		} else {
			return str + "s";
		}
	}	
}
