/* File: Acronym.java
 * ------------------
 * Program concots a new word from
 * first letters of a string of text.
 */

package Chapter8;

import java.util.StringTokenizer;

import acm.program.*;


public class Acronym extends ConsoleProgram {
	
	public void run() {
		String s = readLine("Enter a line to make acronym of: ");
		println("acronym is \"" + acronym(s) + "\"");
	}
	
	private String acronym(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS, true);
		String acronym = "";
		String word = "";
		while (tokenizer.hasMoreTokens()) {
			word = tokenizer.nextToken();
			if (isWord(word))   acronym += word.charAt(0);			
		}
		return acronym;
	}
	
	private boolean isWord(String s) {
		char ch;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
			} else {
				return false;
			}
		}
		return true;
	}
	

	private static final String DELIMITERS = "-., ";
	
}
