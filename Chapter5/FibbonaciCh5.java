/* File: FibonnaciCh5.java
 * 
 * Program writes given Fibbonaci number.
 */

package Chapter5;

import acm.program.*;

public class FibbonaciCh5 extends ConsoleProgram {

	public void run() {
		println("THis program writes nth Fibbonaci number.");
		int a = readInt("What number to calculate: ");
			println("F (" + a + ") = " + fibbonaci(a));
		}
		
		private int fibbonaci(int n) {
			int first = 0;
			int second = 1;
			int current = 0;
			for (int i = 1; i < n; i++) {
				current = first + second;
				first = second;
				second = current;	
			}
			if (n == 1) return second;
			return current;
		}
	}

