/* File: StringTokenizer.java
 * --------------------------
 * reimplementing class string tokenizer
 * in order to learn great deal on strings.
 */

package Chapter8;


public class StringTokenizer {
	
/**
 * Creates a new StringTokenizer object that reads
 * whitespace separated tokens from str.
 * @param string of text
 */
	public StringTokenizer(String str) {
		tokenString = str;
	}
	
/** 
 * Creates a StringTokenizer that uses characters in delims as token separators.
 * @param str
 * @param delims
 */
	public StringTokenizer(String str, String delims) {
		tokenString = str;
		delimiters = delims;
	}
	
/**
 * Creates a StringTokenizer that returns delimiters as tokens
 * if the third argument is true.
 * @param str
 * @param delims
 * @param returnDelims
 */
	public StringTokenizer(String str, String delims, boolean returnDelims) {
		tokenString = str;
		delimiters = delims;
		isDelimiterToken = returnDelims;
	}

/**
 * Returns true if there are more tokens to read
 * from this StringTokenizer.
 * @return true if there a more tokens
 * @return false if there is no more tokens to read
 */
	public boolean hasMoreTokens() {
		if (position == tokenString.length()) return false;
			return true;
	}
	
	public String nextToken() {
		if ( hasMoreTokens() )   {
			return readToken();
		} else {
		 return "null-1";
		}
	}
	
	/* returns string literals as tokens and empty space as tokens */
	private String readToken() {
		String result = "";
		while ( hasMoreTokens() ) {
			char ch = tokenString.charAt(position);
			position ++;
			if (Character.isLetter(ch)) {	
				result += ch;
			} else {
					return result;
				}
			}
		return result;  // return null if for loop is not executed - end of tokenString
	}
	
	private boolean isDelimiter(char ch) {
		for (int i = 0; i < delimiters.length(); i++) {
			if (ch == delimiters.charAt(i)) return true;
		}
		return false;
	}
	
/* private instance variables */
	
	private String tokenString;
	private String delimiters;
	private boolean isDelimiterToken;
	private int position = 0;
	
}
