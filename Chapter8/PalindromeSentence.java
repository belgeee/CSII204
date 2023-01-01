/* File: PalindromeSentence.java
 * -----------------------------
 * Program checks if particular sentence is a palindrome
 */

package Chapter8;

public class PalindromeSentence extends Palindrome {
	
	public void run() {
		println("This program checks for sentence palindromes.");
		String str = readLine("Enter a sentence:");
		if (isSentencePalindrome(str)) {
			println("\n" + str + " is a palindrome.");
		} else {
			println("\n" + str + " is not a palindrome.");
		}
	}
	
	private boolean isSentencePalindrome(String str) {
		
		/* gets letters from a string and changes them to lowercase */
		
		String onlyLetters = ""; // VERY IMPORTANT!!!!! White Space in a string is an empty character in a string " " != ""
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				ch = Character.toLowerCase(ch); // dont forget to assign lowercase to ch
				onlyLetters += ch;
			}
			
		/* call to Palindrome class method to check for palindrome */
		}
		if (isPalindrome(onlyLetters)) {
			return true;
		} else {
			return false;
		}
	}
	
}
