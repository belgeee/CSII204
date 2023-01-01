/* File: Obenglobish.java
 * ----------------------
 * Program turns english into obenglobish'
 */

package Chapter8;

import acm.program.*;

public class Obenglobish extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String word = readLine("Enter a word: ");
			if (word.equals("")) break;
			println(word + " -> " + obenglobish(word));
		}
	}
	
	private String obenglobish(String word) {
		String result = "";
		char ch;
		char priorCh = 0;
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
		    if (isEnglishVowel(ch) && i == word.length() - 1 ||  // last letter in a word is vowel 
			    isEnglishVowel(ch) && isEnglishVowel(priorCh) ) { // prior letter is a vowel
				result += ch;
			} else if (isEnglishVowel(ch)) {
				result += ( "ob" + ch);
			} else {
				result += ch;
			}
		    priorCh = ch;
		}
		return result;
	}
	
	private boolean isEnglishVowel(Character ch) {
		switch (ch) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
					return true;
				default:
					return false;
		}
	}

}
