/* File: ScrabblePoints.java
 * -------------------------
 * This porgram reads words and prints number of points
 * according to Scrabble points value.
 */

package Chapter8;

import acm.program.*;

public class ScrabblePoints extends ConsoleProgram {
	
	public void run() {
		String s = " ";
		s = readLine("Write single word in uppercase letters: ");
		println("\nThis word has " + countPoints(s) + " points.");
	}
	
	private int countPoints(String word) {
		int result = 0;
		for (int i = 0; i < word.length(); i++) {
			result += getLetterValue(word.charAt(i));
		}
		return result;
	}
	
	private int getLetterValue(char ch) {
		int value = 0;
		if (Character.isUpperCase(ch)) {
			switch (ch) {
				case 'A': case 'E': case 'I': case 'L': case 'N': 
				case 'O': case 'R': case 'S': case 'T': case 'U':
					value = 1; break;
				case 'D': case 'G':
					value = 2; break;
				case 'B': case 'C': case 'M': case 'P':
					value = 3; break;
				case 'F': case 'H': case 'V': case 'W': case 'Y':
					value = 4; break;
				case 'K':
					value = 5; break;
				case 'J': case 'X':
					value = 8; break;
				case 'Q': case 'Z':
					value = 10;
				default:
					value = 0; break;
			}
			
		}
		return value;
	}

}
