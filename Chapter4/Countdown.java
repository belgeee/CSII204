/* File: Countdown.java
 * 
 * Program counts down from some value to zero.
 */

package Chapter4;

import acm.program.*;

public class Countdown extends ConsoleProgram {
	
	public void run() {
		int t = START;
		while (t >= 0) {
			println(t);
			t--;
		}
		println("Wystartowal!");
	}

	private static final int START = 10;
	
}
