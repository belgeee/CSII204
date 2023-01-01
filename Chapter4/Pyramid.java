/* File Pyramid.java
 * ------------------
 * Draws a pyramid that is centred in the window
 */

package Chapter4;

import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {
	
	public void run() {

		/* coordinates of a first leftmost brick */
		int firstBrickX = (getWidth() / 2) - (BRICKS_IN_BASE * BRICK_WIDTH / 2);
		int firstBrickY = (getHeight() / 2) + (BRICKS_IN_BASE * BRICK_HEIGHT / 2);
		
		/* used in inner loop to decrease number of brick drawn */
		int maxBricks = BRICKS_IN_BASE;
		
		for (int i = 0; i < BRICKS_IN_BASE; i++) {
			
			/* local variable for inner loop horizontal tracking of X direction */
			int firstLineBrick = firstBrickX;
			
			/* draw line of bricks */
			for (int j = 0; j < maxBricks; j++ ) {
				GRect brick = new GRect(firstLineBrick, firstBrickY, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
				firstLineBrick += BRICK_WIDTH;
			}
		    firstBrickX += (BRICK_WIDTH / 2);
		    firstBrickY -= BRICK_HEIGHT;
		    maxBricks--;		
		}
	}
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICKS_IN_BASE = 14;
}
