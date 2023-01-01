/* File: ColoredSquare.java
 * ------------------------
 * Draws square in the middle of the canvas.
 * Changes color randomly.
 */

package Graphics;

import java.awt.Color;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class ColoredSquare extends GraphicsProgram {
	
	public void run() {
		GRect square = new GRect( 200, 200);
		square.setFilled(true);
		square.setFillColor(Color.BLACK);
		add(square, getWidth() / 2 - square.getWidth() / 2,
				    getHeight() / 2 - square.getHeight() / 2);
		while (true) {
			pause(1000);
			Color c = rgen.nextColor();
			square.setColor(c);
			square.setFillColor(c);
		}
	}
	
/* random generator */
	private RandomGenerator rgen = new RandomGenerator();

}
