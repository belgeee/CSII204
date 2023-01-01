/* File: DrawStopLight.java
 * -----------------------------
 * This version of the program from book 5-3
 * uses method call to draw filled rectangular frame.
 */

package Methods;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawStopLight extends GraphicsProgram {
	
	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double fx = cx - FRAME_WIDTH / 2;
		double fy = cy - FRAME_HEIGHT / 2;
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
		add(createFilledRect(fx, fy));
	}
	
	private GRect createFilledRect(double x, double y) {
		GRect frame = new GRect(x, y, FRAME_WIDTH, FRAME_HEIGHT);
		frame.setFilled(true);
		frame.setColor(Color.GRAY);
		return frame;
	}
	
	private void createFilledCircle(double x, double y, double r, Color color) {
		
	}

	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;
	
}
