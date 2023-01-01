/* File: PigLatinChar.java
 * -----------------------
 * Program uses modified version of the example program
 * from the book that reads characters, one by one,
 * instead of using StringTokenizer to read words.
 * Program basicly changes gramatical structure of words. 
 */

package Chapter8;

import acm.program.*;

public class PigLatinChar extends ConsoleProgram {
	
	public void run() {
		println("This program translates a line into Pig Latin (character by character).");
		String line = readLine("Enter a line: ");
		println(translateLine(line));
	}
	
	private String translateLine(String line) {
		String result = "";
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ' ' || line.charAt(i) == ',' || line.charAt(i) == '.') {
				result += line.charAt(i);
			} else if (line.length() - 1 == i ||
					line.charAt(i + 1) == ' ' || line.charAt(i + 1) == ',' || line.charAt(i + 1) == '.') {
				/* exstarct the word as substring */
				String word = line.substring(result.length(), i + 1);
				 /* translate the word to pig latin */
				word = translateWord(word);
				 /* append the translated word to the result variable*/
				result += word;
			}
		}
	// return the value of the result variable to the caller
		return result;
	}
	
/* Translates a word to Pig Latin and returns the translated word */
	private String translateWord(String word) {
		int vp = findFirstVowel(word);
		if (vp == -1) {
			return word;
		} else if (vp == 0) {
			return word + "way";
		} else {
			String head = word.substring(0, vp);
			String tail = word.substring(vp);
			return tail + head + "ay";
		}
	}
	
/* Returns the index of first vovel in the word (-1 if none) */
	private int findFirstVowel(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (isEnglishVowel(word.charAt(i))) return i;
		}
		return -1;
	}
	
/* Returns true if the character is a vovel */
	private boolean isEnglishVowel(char ch) {
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
					return true;
				default:
					return false;
		}
	}
	
}
