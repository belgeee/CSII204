/* File: DrawHouse.java
 * ----------------------
 * Drawing of a house using stepwise refinement.
 */

package Methods;

import acm.program.*;
import acm.graphics.*;

public class DrawHouse extends GraphicsProgram {
	
	public void run() {
		frame();
		roof();
		topWindows();
		bottomWindows();
		door();
	}
	
	private void frame() {
/* set top left corner of the house to be at 1/4 of the window height */
		add(new GRect(getWidth() / 2 - HOUSE_WIDTH / 2, getHeight() * 0.25, HOUSE_WIDTH, HOUSE_HEIGHT));
	}
	
	private void roof() {
		add(new GLine(getWidth() / 2 - HOUSE_WIDTH / 2, getHeight() * 0.25, getWidth() / 2, TOP_GAP));
		add(new GLine(getWidth() / 2 + HOUSE_WIDTH / 2, getHeight() * 0.25, getWidth() / 2, TOP_GAP));
	}
	
	private void topWindows() {
/* starting coordinates for drawing left window */
		double x = getWidth() / 2 - HOUSE_WIDTH * 0.30;
		double y = getHeight() * 0.25 + HOUSE_HEIGHT * 0.15;
/* draw 4 parts windows */
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				add(new GRect(x, y, SINGLE_WINDOW_WIDTH, SINGLE_WINDOW_HEIGHT));
				add(new GRect(x, y + SINGLE_WINDOW_HEIGHT, SINGLE_WINDOW_WIDTH, SINGLE_WINDOW_HEIGHT));
				x += SINGLE_WINDOW_WIDTH;
			}
/* set coordinates x for right window */
			x = getWidth() / 2 + HOUSE_WIDTH / 2 - HOUSE_WIDTH * 0.20 - 2 * SINGLE_WINDOW_WIDTH;
		}
	}
	
	private void bottomWindows() {
/* starting coordinates for drawing left window */
		double x = getWidth() / 2 - HOUSE_WIDTH * 0.33;
		double y = getHeight() * 0.25 + HOUSE_HEIGHT * 0.50;
/* draw 6 parts windows */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				add(new GRect(x, y, SINGLE_WINDOW_WIDTH, SINGLE_WINDOW_HEIGHT));
				add(new GRect(x, y + SINGLE_WINDOW_HEIGHT, SINGLE_WINDOW_WIDTH, SINGLE_WINDOW_HEIGHT));
				x += SINGLE_WINDOW_WIDTH;
			}
/* set coordinates x for right window */
			x = getWidth() / 2 + HOUSE_WIDTH / 2 - HOUSE_WIDTH * 0.24 - 2 * SINGLE_WINDOW_WIDTH;
		}

	}
	
	private void door() {
		double floorY = getHeight() * 0.25 + HOUSE_HEIGHT;
		add(new GRect(getWidth() / 2 - DOOR_WIDTH / 2, floorY - DOOR_HEIGHT, DOOR_WIDTH, DOOR_HEIGHT ));
	}

/* main frame of the house */
	private static final double HOUSE_WIDTH = 400;
	private static final double HOUSE_HEIGHT = 300;
	
/* size of individual glass inside window pane */
	private static final double SINGLE_WINDOW_WIDTH = 30;
	private static final double SINGLE_WINDOW_HEIGHT = 40;

/* top of the roof to top of the window */
	private static final double TOP_GAP = 20;
	
/* door size */
	private static final double DOOR_WIDTH = 60;
	private static final double DOOR_HEIGHT = 120;

	
}
