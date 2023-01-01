/* File: DNA.java
 * --------------
 * Program finds position for two strands
 * of DNA to match.
 * Rules for DNA matching:
 * - adenosine matches thymine A to t
 * - cytosine matches guanine C to G
 */

package Chapter8;

import acm.program.*;

public class DNA extends ConsoleProgram {
	
	public void run() {
		String longDNA = readLine("Enter Upper case letter string of DNA: ");
		String shortDNA = readLine("Enter second shorter string: ");
		println("First index position of two strand binding is :" 
				+ findFirstMatchingPosition(shortDNA, longDNA) );
	}
	
	private int findFirstMatchingPosition(String shortDNA, String longDNA) {
		
		int firstLinkLongDNA = 0; 
		/* number of consecutive letters that have a match between two strands */
		int shortStrandPosition = 0;
		
		for (int i = 0; i < longDNA.length(); i++) {
			char baseLong = longDNA.charAt(i);
			char baseShort = shortDNA.charAt(shortStrandPosition);
			
			if ( matchingStrands(baseShort, baseLong) ) {		
				if (shortStrandPosition == 0) firstLinkLongDNA = i;   // position of first matching letters
				shortStrandPosition += 1;							  // check next letter in a short strand
			} else {
				shortStrandPosition = 0;         // start counting shortDNA letters from beginning
				firstLinkLongDNA = -1;           // set match to false
			}
			
			if (shortDNA.length() == shortStrandPosition) return firstLinkLongDNA;
		}
		return firstLinkLongDNA;
	}
	
	private boolean matchingStrands(char baseShort, char baseLong) {
		
			   if (baseShort == 'A' && baseLong == 'T') {
				return true;
		} else if (baseShort == 'T' && baseLong == 'A') {
			return true;
		} else if (baseShort == 'C' && baseLong == 'G') {
			return true;
		} else if (baseShort == 'G' && baseLong == 'C') {
			return true;
		} else {
			return false;
		}
	}
}
