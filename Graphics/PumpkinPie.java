/* File: PumpkinPie.java
 * ---------------------
 * Program draws a pumpkin pie.
 * Allows to change the number of pieces.
 * Can change size of pie.
 * Using GArc.
 */

package Graphics;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class PumpkinPie extends GraphicsProgram {

	public void run() {
		
		int arch = 360 / N_PIECES;
		
		for (int i = 0; i < 360; i += arch) {
			GArc ark = new GArc(PIE_SIZE, PIE_SIZE, i, arch);
			ark.setColor(Color.BLACK);
			ark.setFillColor(Color.ORANGE);
			ark.setFilled(true);
			add(ark, getWidth() / 2 - PIE_SIZE / 2, getHeight() / 2 - PIE_SIZE / 2);
		}
	
	}
	
/*
 * Private variables
 */
	private static final int N_PIECES = 6;
	private static final int PIE_SIZE = 200; 
}
