/* File: MiloCalculation.java
 * 
 * Calculate expression in Java order of precedence based on childrens book
 */

package Chapter3;

import acm.program.*;

public class MiloCalculation extends ConsoleProgram {
	public void run() {
		int miloMathRiddle = 4+9-2*16+1/3*6-67+8*2-3+26-1/34+3/7+2-5;
		println("Result is ... " + miloMathRiddle);
	}

}
