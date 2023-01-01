/* File: RandomCard.java
 * --------------------------
 * This program displays randomly chosen card.
 */

package Chapter6;

import acm.program.*;
import acm.util.RandomGenerator;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		while (true) {
			println("This program displays randomly chosen card.");
			println(rank() + " of " + suit());
			pause(1000);
			}
		}
	
	private String rank() {
		int randomCard = rgen.nextInt(0, 12);
		switch (randomCard) {
		case 0: return ("2"); 
		case 1: return ("3");
		case 2: return ("4");
		case 3: return ("5");
		case 4: return ("6");
		case 5: return ("7");
		case 6: return ("8");
		case 7: return ("9");
		case 8: return ("10");
		case 9: return ("Jack");
		case 10: return ("Queen");
		case 11: return ("King");
		case 12: return ("Ace");
		default: return ("Ooops");
		}
	}
	
	private String suit() {
		int randomCard = rgen.nextInt(0, 3);
		switch (randomCard) {
		case 0: return ("Clubs");
		case 1: return ("Diamonds");
		case 2: return ("Hearts");
		case 3: return ("Spades");
		default: return ("Ooops");
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
