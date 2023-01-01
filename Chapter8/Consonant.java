/* File:Consonant.java
 * ---------------------
 * Program checks for consonants and prints 
 * result on the screen.
 */

package Chapter8;

import acm.program.*;

public class Consonant extends ConsoleProgram {
	
	public void run() {
		
		println("Program displays all English uppercase consonants:");

		for (int i = 'A'; i <= 'Z'; i++) { // dont forget about "of by 1" bug
			if (isEnglishConsonant( (char)i )) {
				print ( (char)i + ", ");
			}
		}
	}
	
/* return true if a letter is consonant (uppercase or lowercase) */
	public static boolean isEnglishConsonant(char ch) {
		
			switch (Character.toLowerCase(ch)) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					return false;
				default:
					return true;
			}	
		}
	}

