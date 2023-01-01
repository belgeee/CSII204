/* File: Power.java
 * 
 *  This program raises given number to specified power
 */

package Chapter5;


import acm.program.*;

public class Power extends ConsoleProgram {
	
	public void run() {
		int num = 2;  // number
		for (int i = 0; i <= 10; i++) {
			println(num + " to the power of " + i + " is " + raiseIntToPower(num, i));
		}
	}

	private int raiseIntToPower(int n, int k) {
		int result = n;
		for (int i = 1; i < k; i++) {
			result *= n;
		}
		if (k == 0) return 1; // anything to the power of 0 is 1
		return result;
	}
	
}
