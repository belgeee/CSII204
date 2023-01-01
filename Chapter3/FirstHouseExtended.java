/* File: FirstHouseExtended.java
 * 
 * Program allows for dynamic change of size of the house
 * based on changing size of the wall
 */

package Chapter3;

import acm.graphics.*;
import acm.program.*;

public class FirstHouseExtended extends GraphicsProgram {
	public void run() {
		add(new GRect(TOP_LEFT_X, TOP_LEFT_Y, HOUSE_LENGHT, HOUSE_HEIGHT)); // main walls
		
		add(new GRect(TOP_LEFT_X+WALL_TO_WINDOW, TOP_LEFT_Y+WALL_TO_WINDOW, WINDOW_SIZE, WINDOW_SIZE)); // left window
		add(new GRect(TOP_LEFT_X+HOUSE_LENGHT-WALL_TO_WINDOW-WINDOW_SIZE, TOP_LEFT_Y+WALL_TO_WINDOW, WINDOW_SIZE, WINDOW_SIZE)); // right window
		
		add(new GRect(500,400,100,200)); // door
		add(new GOval(580,500,10,10));   // door knob
		
		add(new GLine(300,300,550,150)); // left part of roof
		add(new GLine(800,300,550,150)); // right part of roof
	}

	private static final int HOUSE_LENGHT = 500;
	private static final int HOUSE_HEIGHT = 300;
	
	/* top left corner of the house */
	private static final int TOP_LEFT_X = 300;
	private static final int TOP_LEFT_Y = 300;
	
	private static final int WINDOW_SIZE = 100;
	private static final int WALL_TO_WINDOW = 50;
	
	
	
}	
	

