/* File: PigLatinCapital.java
 * --------------------------
 * Copy of book program with small change that includes
 * capital letters.
 */

package Chapter8;

import java.util.StringTokenizer;

import acm.program.*;

public class PigLatinCapital extends ConsoleProgram {
	
	public void run() {
		println("This program translates a line into Pig Latin (character by character).");
		String line = readLine("Enter a line: ");
		println(translateLine(line));
	}
	
	private String translateLine(String line) {
		String result = "";
		StringTokenizer tokenizer =
				new StringTokenizer(line, DELIMITERS, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (isWord(token)) {
				token = translateWord(token);
			}
			result += token;
		}
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
			head = head.toLowerCase();
			tail = firstLetterUppercase(tail);
			return tail + head + "ay";
		}
	}
	
	private String firstLetterUppercase(String word) {
		char ch = word.charAt(0);
		ch = Character.toUpperCase(ch);
		return ch + word.substring(1);
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
	
	private boolean isWord(String token) {
		for (int i = 0; i < token.length(); i++) {
			char ch = token.charAt(i);
			if (!Character.isLetter(ch)) return false;
		}
		return true;
	}
	
	private static final String DELIMITERS = ",. ";
	
}


