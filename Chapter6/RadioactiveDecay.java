/* File: RadioactiveDecay.java
 * ---------------------------
 * Program simulates radioactive decay of an atom
 * over time.
 */

package Chapter6;

import acm.program.*;
import acm.util.RandomGenerator;

public class RadioactiveDecay extends ConsoleProgram {
	
	public void run() {
		int atoms = 10000;
		int year = 0;
		println("There are " + atoms + " initially");
		while (atoms > 0) {
			year += 1;
			int yearEndAtoms = 0;
			for (int j = 0; j < atoms; j ++) {
				if (rgen.nextBoolean()) yearEndAtoms += 1;
			}
			atoms = yearEndAtoms;
			println("There are " + atoms + " at the end of year " + year);
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();

}
