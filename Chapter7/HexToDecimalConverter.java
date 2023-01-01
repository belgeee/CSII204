/* File: HexToDecimalConverter.java
 * --------------------------------
 * Program converts hexadecimal numbers to decimal numbers.
 * 
 * Program uses static methods from wrapper class Integer:
 * 	Integer.parseInt()
 * 	Integer.toString()
 */

package Chapter7;

import acm.program.*;

public class HexToDecimalConverter extends ConsoleProgram {
	
	public void run() {
		String s = "";
		Integer n = new Integer(0);
		while (! s.equals("0")) {
			s = readLine("Enter a hexadecimal number:");
			n = Integer.parseInt(s, 16);
			println(s + " hex = " + Integer.toString(n, 10) + " decimal");
		}
	}
}
