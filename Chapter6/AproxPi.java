/* File: AproxPi.java
 * ------------------
 * Program simulates throwing darts.
 * Uses Monte CArlo technique to approximate
 * value of Pi number.
 */

package Chapter6;

import acm.program.*;
import acm.util.RandomGenerator;

public class AproxPi extends ConsoleProgram {
	
	public void run() {
		double x;
		double y;
		int dartsInCircle = 0;
		int numberOfTries = 0;
		while (true) { 
			for (int i = 0; i < 10000; i++) {
				x = rgen.nextDouble(-1.0, 1.0);
				y = rgen.nextDouble(-1.0, 1.0);
				if ( (Math.pow(x, 2) + Math.pow(y, 2)) < 1) {
					dartsInCircle += 1;
				}	
			}
			println("Approximate value of Pi: " + (dartsInCircle * 4 * 0.0001) );
			
			/* keep track of number of tests in a loop to get closes approximation 
			 * to 4 places after the decimal point */
			if ( (dartsInCircle * 4 * 0.0001) < 3.1418 && (dartsInCircle * 4 * 0.0001) > 3.1414) break;
			dartsInCircle = 0;
			numberOfTries += 1;
			println("Number of tries: " + numberOfTries);
			
		}
	}

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
