/* File: RandomWord.java
 * -----------------------------
 * This program displays five random words.
 */

package Chapter8;

import acm.program.*;
import acm.util.RandomGenerator;

public class RandomWord extends ConsoleProgram {
	
	public void run() {
		for ( int i = 0; i < 5; i++) {
			println(randomWord());
		}
	}
	
	private String randomWord() {
		String str = " ";
		int wordLenght = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		
		for (int i = 0; i < wordLenght; i++) {
			 char ch = (char) rgen.nextInt('a', 'z');
			 str += ch;
		}
		return str;
	}

/* random number generator */
	RandomGenerator rgen = RandomGenerator.getInstance();
	
/* constant variables */
	private static final int MIN_LETTERS = 3;
	private static final int MAX_LETTERS = 10;
	
}
