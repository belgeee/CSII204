/* File: ConsecutiveHeads.java
 * ---------------------------
 * Program tosses coin to get 3 heads
 * in a row.
 */

package Chapter6;

import acm.program.*;
import acm.util.RandomGenerator;

public class ConsecutiveHeads extends ConsoleProgram {
	
	public void run() {
		
		int headsNum = 0;
		int flipsNum = 0;
		
		while (true) {
			pause(500);
			boolean heads = rgen.nextBoolean();
			if (heads) {
				println("Heads");
				headsNum += 1;
			} else {
				println("Tails");
				headsNum = 0;
			}
			
			flipsNum += 1;
			if (headsNum == 3) {
				println("It took " + flipsNum + " flips to get " + headsNum + " consecutive heads.");
				break;
			}
		}
		
	}

	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
