/* File: BottlesSong.java
 * 
 *  Program generates lyrics based on number of bottles
 */

package Chapter4;

import acm.program.*;

public class BottlesSong extends ConsoleProgram {
	public void run() {
		for (int i = BOTTLES; i > 0; i--) {
			println(i + " bottles of beer on the wall,");
			println(i + " bottles of beer,");
			println("Tou take one down, pass it around.");
			println("");
			}
		println("Drink Responsibly.");
	}

	private static final int BOTTLES = 99;
	
}
