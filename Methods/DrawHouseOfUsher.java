/* File: DrawHouseOfUsher.java
 * 
 * Drawing of a house that uses stepwise refinement and constants
 */
	
package Methods;

import acm.program.*;
import acm.graphics.*;

public class DrawHouseOfUsher extends GraphicsProgram {
	
	public void run() {
		drawHouse();
		//drawTowers();
		//drawTrees();
	}
	
	private void drawHouse() {
		double leftWallX = 200;
		add(new GRect(leftWallX, GROUNDS - HOUSE_HEIGHT, HOUSE_WIDTH, HOUSE_HEIGHT));
		drawRoof(leftWallX);
		drawDoor(leftWallX);
		drawWindows(leftWallX);
	}
	
	private void drawRoof(double x) {
		add(new GLine(x, GROUNDS - HOUSE_HEIGHT, x + HOUSE_WIDTH / 2, GROUNDS - HOUSE_HEIGHT - ROOF));
		add(new GLine(x + HOUSE_WIDTH, GROUNDS - HOUSE_HEIGHT, x + HOUSE_WIDTH / 2, GROUNDS - HOUSE_HEIGHT - ROOF));
	}
	
	private void drawDoor(double x) {
		add(new GRect(x + HOUSE_WIDTH / 2 - DOOR_WIDTH / 2, GROUNDS - DOOR_HEIGHT, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GLine(x + HOUSE_WIDTH / 2 - DOOR_WIDTH / 2, GROUNDS - DOOR_HEIGHT, x + HOUSE_WIDTH / 2, GROUNDS - DOOR_HEIGHT - DOOR_TOWER));
		add(new GLine(x + HOUSE_WIDTH / 2 + DOOR_WIDTH / 2, GROUNDS - DOOR_HEIGHT, x + HOUSE_WIDTH / 2, GROUNDS - DOOR_HEIGHT - DOOR_TOWER));
	}
	
	private void drawWindows(double x) {

		add(new GOval(x + WINDOWS_TO_WALL - WINDOWS_RADIUS / 2, GROUNDS - WINDOWS_HEIGHT, WINDOWS_RADIUS, WINDOWS_RADIUS));
		add(new GOval(x + HOUSE_WIDTH - WINDOWS_TO_WALL - WINDOWS_RADIUS / 2, GROUNDS - WINDOWS_HEIGHT, WINDOWS_RADIUS, WINDOWS_RADIUS));
	}

	/* grounds Y coordinate */
	private static final double GROUNDS = 400;
	
/* house size + roof */
	private static final double HOUSE_WIDTH = 150;
	private static final double HOUSE_HEIGHT = 180;
	private static final double ROOF = 100;
	
/* windows */
	private static final double WINDOWS_HEIGHT = 150;
	private static final double WINDOWS_TO_WALL = 35;
	private static final double WINDOWS_RADIUS = 25;
	
/* house columns size + towers */
	private static final double COLUMNS_HEIGHT = 550;
	private static final double COLUMNS_WIDTH = 80;
	private static final double COLUMN_TOWER = 150;
	
/* door + tower */
	private static final double DOOR_WIDTH = 30;
	private static final double DOOR_HEIGHT = 40;
	private static final double DOOR_TOWER = 15;
	
/* trees */
	private static final double TREE_WIDTH = 50;
	private static final double TREE_HEIGHT = 200;
	private static final double TREE_TOWER = 150;


}
