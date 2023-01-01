/* File: LongestWord.java
 * ----------------------
 * Program finds longest word in a string of text.
 */

package Chapter8;

import java.util.StringTokenizer;
import acm.program.*;

public class LongestWord extends ConsoleProgram {
	
	public void run() {
		String s = readLine("Enter a line: ");
		println("The longest word is \"" + longestWord(s) + "\"");
	}
	
	private String longestWord(String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, DELIMITERS, true);
		String word = "";
		String longestWord = "";
		while (tokenizer.hasMoreTokens()) {
			word = tokenizer.nextToken();
			if (longestWord.length() < word.length())	longestWord = word;
		}
		return longestWord;
	}

	private static final String DELIMITERS = "., ";
	
}
