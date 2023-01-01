/* File:SlotMachine.java
 * ---------------------
 * Program simulates one-arm bandit slot machine
 * commonly found in casinos. Not like in casinos,
 * all results have equal chance.
 * A game costs 1$ to play.
 */

package Chapter6;

import acm.program.*;
import acm.util.RandomGenerator;

public class SlotMachine extends ConsoleProgram {
	
/* current wallet value */
	private static int wallet = 50;
	
	/* make user wallet +
	 * give instruction to the user
	 * play game (select 3 random slots) +
	 * update user wallet +
	 * give info to the user & ask to play again
	 */
	
	public void run() {
		println("Play SLOT MACHINE! Good Luck!");
		while (!gameOver()) {
			String prompt = readLine("You have $" + getWallet() + ". Would you like to play? ");
			if (prompt.equals("no")) break;
			playGame();
		}
	}
	
/* plays random game, returns results of game and updates wallet */	
	private void playGame() {
		/* take 1$ from the wallet to play game */
		setWallet(-1);
		
		/* generate 3 random slots */
		String slot1 = getSlot();
		String slot2 = getSlot();
		String slot3 = getSlot();
		
		/* print slots on the screen and compute result*/
		println(slot1 + "\t" + slot2 + "\t" + slot3 + "\t-- " +
				                 gameOutcome(slot1, slot2, slot3));
	}
	
/* get random slot result */
	private String getSlot() {
		int slotPick = rgen.nextInt(1, 7);
			switch (slotPick) {
			case 1: return CHERRY;
			case 2: return LEMON;
			case 3: return ORANGE;
			case 4: return PLUM;
			case 5: return BELL;
			case 6: return BAR;
			case 7: return EMPTY_SLOT;
			default: return "bug in getSlot";
		}
	}
	
/* determine result and update wallet*/	
	private String gameOutcome (String slot1, String slot2, String slot3) {
		if (slot1.equals(BAR) && slot2.equals(BAR) && slot3.equals(BAR)) {
			setWallet(250);
			return "You Win 250$";
		} else if (slot1.equals(BELL) && slot2.equals(BELL) && (slot3.equals(BELL) || slot3.equals(BAR))) { // dont forget about having || in parentheses !!!!!!!!!!
			setWallet(20);
			return "You win 20$";
		} else if (slot1.equals(PLUM) && slot2.equals(PLUM) && (slot3.equals(PLUM) || slot3.equals(BAR))) {
			setWallet(14);
			return "You Win 14$";
		} else if (slot1.equals(ORANGE) && slot2.equals(ORANGE) && (slot3.equals(ORANGE) || slot3.equals(BAR))) {
			setWallet(10);
			return "You Win 10$";
		} else if (slot1.equals(CHERRY) && slot2.equals(CHERRY) && slot3.equals(CHERRY)) {
			setWallet(7);
			return "You Win 7$";
		} else if (slot1.equals(CHERRY) && slot2.equals(CHERRY) && slot3.equals(EMPTY_SLOT)) {
			setWallet(5);
			return "You Win 5$";
		} else if (slot1.equals(CHERRY) && slot2.equals(EMPTY_SLOT) && slot3.equals(EMPTY_SLOT)) {
			setWallet(2);
			return "You Win 2$";
		} else {
			return "You lose";
		}
	}
	
/* update user wallet */
	private void setWallet(int dollars) {
		wallet += dollars;
	}
	
/* retrive wallet current value */
	private int getWallet() {
		return wallet;
	}

	private boolean gameOver() {
		if (wallet <= 0) {
			return true;
		}
		return false;
	}
/*  slots symbols */
	private static final String CHERRY = "CHERRY";
	private static final String LEMON = "LEMON";
	private static final String ORANGE = "ORANGE";
	private static final String PLUM = "PLUM";
	private static final String BELL = "BELL";
	private static final String BAR = "BAR";
	private static final String EMPTY_SLOT = "-";
	
/* random generator */
	RandomGenerator rgen = RandomGenerator.getInstance();
}

