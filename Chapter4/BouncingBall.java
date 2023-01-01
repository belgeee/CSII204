/* File: BouncingBall.java
 * 
 * This program bounces the ball inside graphic window.
 * 
 * For this program to work as intender you most likely have]
 * to use method ball.getX(); which is not in the book before the exercise is given
 * 
 * Program not finished !
 */

package Chapter4;

import acm.program.*;
import acm.graphics.*;

public class BouncingBall extends GraphicsProgram { 
	
	public void run() {
		GOval ball = new GOval(getWidth() / 2, getHeight() / 2, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		add(ball);
		int dx = 1;
		int dy = 1;
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		while (y < (getHeight()-BALL_SIZE)) {
			ball.move(dx,dy);
			pause(PAUSE_TIME);
			x++;
			y++;
		}
		while (true) {
				
				while (x < (getWidth()-BALL_SIZE)) {
					ball.move(dx, -dy);
					pause(PAUSE_TIME);
					x++;
					y--;
				}
				while (y > 0) {
					ball.move(-dx, -dy);
					pause(PAUSE_TIME);
					x--;
					y--;
				}
				while (x > 0) {
					ball.move(-dx, dy);
					pause(PAUSE_TIME);
					x--;
					y++;
				}
			
			}		
	}
	
/* Private constants */
	private static final int PAUSE_TIME = 10;
	private static final int BALL_SIZE = 50;
}
