/* File: SixesOrSevens.java
 * 
 * Writes integers that are divisible by 6 or by 7
 * but not both.
 */

package Chapter4;

import acm.program.*;

public class SixesOrSevens extends ConsoleProgram {
	public void run() {
		for (int i = 0; i < 100; i++) {
			if ( (i % 6 == 0) && (i % 7 != 0) ) println( i + ", "); // i divisible by 6 and is not divisible by 7
			if ( (i % 7 == 0) && (i % 6 != 0) ) println( i + ", "); // i divisible by 7 and is not divisible by 6
		}
	}
}
