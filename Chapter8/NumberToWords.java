/* File: NumberToWords.java
 * ------------------------
 * This program reads integers and
 * writes a string representation of the number.
 */

package Chapter8;

import acm.program.*;

public class NumberToWords extends ConsoleProgram {
	
	public void run() {
		while (true) {
		int number = readInt("Enter a number: ");
		println(numberToWords(number));
		}
	}
	
	private String numberToWords(int n) {
		if (n < 10) {
			return singleDigit(n); 
		} else if (n < 100) {
			return doubleDigits(n);
		} else if (n < 1000) {
			return singleDigit(n / 100) + " houndred " + doubleDigits(n % 100);
		} else {
			return "bugs";
		}
	}
	
	private String singleDigit(int n) {
		switch (n) {
			case 1: return "one";
			case 2: return "two";
			case 3: return "three";
			case 4: return "four";
			case 5: return "five";
			case 6: return "six";
			case 7: return "seven";
			case 8: return "eight";
			case 9: return "nine";
			default: return "single digit error!";
		}
	}
	
	private String doubleDigits(int n) {
		int tens = n / 10;
		int ones = n % 10;
		String result = "";
		
		if (tens == 1) {
			switch (ones) {
			case 0: return "ten";
			case 1: return "eleven"; 
			case 2: return "twelve"; 
			case 3: return "thirteen"; 
			case 4: return "fourteen"; 
			case 5: return "fifteen"; 
			case 6: return "sixteen"; 
			case 7: return "seventeen"; 
			case 8: return "eighteen"; 
			case 9: return "nineteen"; 
			}
		}
		
		switch (tens) {
		    case 0: break; 
			case 2: result += "twenty"; break;
			case 3: result += "thirty"; break;
			case 4: result += "forty"; break;
			case 5: result += "fifty"; break;
			case 6: result += "sixty"; break;
			case 7: result += "seventy"; break;
			case 8: result += "eighty"; break;
			case 9: result += "ninety"; break;
			default: result += "fault in tens with 0"; break;
		}
		
		if (ones == 0) {
			return result;
		} else {
			return result + " " + singleDigit(ones);
		}
	}
}
