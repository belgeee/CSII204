/* File: Checkboard.java
 * 
 *  Draws Checkboard that is centred horizontally 
 *  and has checkers in their starting positions.
 *  The dimensions of the checkboard are specified
 *   by constanst and checkboard fills avalible 
 *   vertical space.
 *  
 */

package Chapter4;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class Checkboard extends GraphicsProgram {
	
	public void run() {
		double sqSize = (double) getHeight() / N_ROWS;
		double centred = (getWidth() / 2) - (N_ROWS / 2 * sqSize);   // distance from a left wall needed to centre checkboard
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				double x = j * sqSize + centred;
				double y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFillColor(Color.GRAY);
				sq.setFilled((i + j) % 2 != 0);
				add(sq);
/* draw red checkers */
				if ((i < 3) && ((i + j) % 2 != 0)) {
					GOval redCheck = new GOval(x+5, y+5, sqSize-10, sqSize-10);
					redCheck.setFillColor(Color.RED);
					redCheck.setFilled(true);
					add(redCheck);
				}
/* draw black checkers */
				if ((i > 4) && ((i + j) % 2 != 0)) {
					GOval blackCheck = new GOval(x+5, y+5, sqSize-10, sqSize-10);
					blackCheck.setFillColor(Color.BLACK);
					blackCheck.setFilled(true);
					add(blackCheck);
				}
			}
		}
	}

/* Private constants */
	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;
}
