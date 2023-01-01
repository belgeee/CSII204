/* File: FahrenheiToCelsius.java
 * 
 * Convert temperature in Fahrenheit to Celsius
 */

package Chapter3;

import acm.program.*;

public class FahrenheiToCelsius extends ConsoleProgram {
	public void run() {
		println("This program converts Fahrenheit to Celsius.");
		
		int fahrenheit = readInt("Enter temperature in Fahrenheit: ");
		
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		println("Celsius equivalent = " + celsius);
		
	}

}
