/*File: TargetSymbolCh5
 * 
 *  Program draws a red circles on the screen,
 *  target shaped, by call to method :
 *  createFilledCircle(). 
 *  Target is also centred in the window.
 */

package Methods;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class TargetSymbolCh5 extends GraphicsProgram {
	
	public void run() {
		Color redOrWhite = Color.RED;
		double ringSize = OUTER_RADIUS;
		for (int i = 0; i < N_CIRCLES; i++) {
			add(createFilledCircle(getWidth() / 2, getHeight() / 2, ringSize, redOrWhite));
/* 
 * draw rings from biggest to smallest by dividing largest ring by number of rings
 * set last ring to constant INNER_RING
 */
			if (i == N_CIRCLES - 2) { 
				ringSize = INNER_RADIUS;
			} else {
				ringSize -= (OUTER_RADIUS / N_CIRCLES);
			}
/* change colours between red and white on every other loop run */			

			if (redOrWhite == Color.RED) {
				redOrWhite = Color.WHITE;
			} else { 
				redOrWhite = Color.RED;
			}
		}
	}
	
/*
 * Creates a circular GOval object centred at (x, y) with radius r.
 * The GOval is set to be filled and coloured in the specific colour.
 */
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval (x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}

	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
	
}
