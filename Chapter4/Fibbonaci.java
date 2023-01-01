/* File: Fibonnaci.java
 * 
 * Program writes sequence of Fibonaci numbers.
 */

package Chapter4;

import acm.program.*;

public class Fibbonaci extends ConsoleProgram {

	public void run() {
		int first = 0;
		int second = 1;
		println("THis program writes Fibbonaci numbers.");
		println("F (0) = 0");
		println("F (1) = 1");
		for (int i = 2; i < 100; i++) {
			int current = first + second;
			if (current > 10000) break;
			println("F (" + i + ") = " + current);
			first = second;
			second = current;	
		}
	}
	
}
