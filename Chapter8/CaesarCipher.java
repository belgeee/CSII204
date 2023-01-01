/* File: CaesarCipher.java
 * -----------------------
 * Program creates a Caesar Cipher from a given
 * string of text. Program is explained in a video from lesson.
 */

package Chapter8;

import acm.program.*;
import java.util.*;

public class CaesarCipher extends ConsoleProgram {
	
	public void run() {
		while (true) {
		String str = readLine("write: ");
		println("->" + encodeCaesarCipher(str, -1));
		}
	}
	
	private String encodeCaesarCipher(String str, int shift) {
		String result = "";
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS, true);
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (isWord(token)) {
				token = encodeWord(token, shift);
			}
			result += token;
		}
		return result;
	}
	
	private boolean isWord(String word) {
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isLetter(ch)) return false;
		}
		return true;
	}
	
	private String encodeWord(String word, int shift) {
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isUpperCase(ch)) {
				 ch = (char) ((ch + shift - 'A') % 26 + 'A');  // treat all as character
				 result += ch;
			} else {
				ch = (char) ((ch + shift - 'a') % 26 + 'a');  // study this importandt rule think about it
				result += ch;
			}
		}
		return result;
	}

/* Defines the characters that delimit a token */
	private static final String DELIMITERS = "!\"£$%^&*()_+-=[]{};'#:@~,./<>?\\|`¬¦ "; // important to include empty space too
}
