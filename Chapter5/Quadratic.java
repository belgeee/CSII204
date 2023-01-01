/* File: Quadratic.java
 * 
 * Program calculates quadratic equation and prints two possible results
 * 
 */

package Chapter5;

import acm.program.*;

public class Quadratic extends ConsoleProgram { 
	
	public void run() {
		println("Enter coefficients for quadratic equation: ");
		int a = 0;
/* value for 'a' must be nonzero */
		while(true) {
			a = readInt("a: ");
			if(a != 0) break;
			println(" a must not be zero - try again ");
		}
		int b = readInt("b: ");
		int c = readInt("c: ");
		
		if (rootResult(a, b, c) < 0) {
			println("no real solution");
		} else {
			println("The first solution is " + solutionPlus(a, b, c));
			println("The second solution is " + solutionMinus(a, b, c));
		}
	}
	
	private double solutionPlus(int a, int b, int c) {
		return (-b + rootResult(a, b, c)) / (2 * a);
	}

	private double solutionMinus(int a, int b, int c) {
		return (-b - rootResult(a, b, c)) / (2 * a);
	}
	
	private double rootResult( int a, int b, int c) {
		return Math.sqrt((b * b) - (4 * a * c));
	}
	
}
