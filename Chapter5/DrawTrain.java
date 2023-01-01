/* File: DrawTrain.java
 * ------------------------
 * This source code completes implementation of the DrawTrain 
 * program from the book by adding methods written by me for:
 *  drawSmokestack()
 *  drawCab()
 *  drawCowcatcher()
 *  drawCaboose
 *  
 *  WARNING: x coordinate is set to be a left edge of the connector
 *           y coordinate is set to be a bottom of the tracks that wheels stand on
 */

package Chapter5;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram {
	
	public void run() {
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		drawEngine(x, y);
		drawBoxCar(x + dx, y, Color.GREEN);
		drawCaboose(x + 2 * dx, y);
	}
	
	private void drawCarFrame(double x, double y, Color color) {
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}
	
	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, 2 * r, 2 * r);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}
	
	private void drawBoxCar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		double xRight = x + CONNECTOR + CAR_WIDTH / 2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawEngine(double x, double y) {
		drawCarFrame(x, y, Color.BLACK);
		drawSmokeStack(x, y);
		drawCab(x, y);
		drawCowCatcher(x, y);
	}
	
	private void drawSmokeStack(double x, double y){
		GRect smokeStack = new GRect(x + SMOKESTACK_INSET + CONNECTOR, y - WHEEL_RADIUS - CAR_HEIGHT - SMOKESTACK_HEIGHT, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokeStack.setFilled(true);
		smokeStack.setFillColor(Color.BLACK);
		add(smokeStack);	
	}
	
	private void drawCab(double x, double y) {
		GRect cab = new GRect(x + + CONNECTOR + CAR_WIDTH - CAB_WIDTH, y - WHEEL_RADIUS - CAR_HEIGHT - CAB_HEIGHT, CAB_WIDTH, CAB_HEIGHT);
		cab.setFilled(true);
		cab.setFillColor(Color.BLACK);
		add(cab);
	}
	
	private void drawCowCatcher(double x, double y) {
		add(new GLine(x + CONNECTOR, y - WHEEL_RADIUS - CAR_HEIGHT / 2, x , y - WHEEL_RADIUS));
		add(new GLine(x + CONNECTOR, y - WHEEL_RADIUS - CAR_HEIGHT / 2, x + CONNECTOR / 2 , y - WHEEL_RADIUS));
	}
	
	private void drawCaboose(double x, double y) {
		drawCarFrame(x, y, Color.RED);
		drawCupola(x, y);
	}
	
	private void drawCupola(double x,  double y) {
		GRect cupola = new GRect(x + CONNECTOR + (CAR_WIDTH / 2 - CUPOLA_WIDTH / 2), y - WHEEL_RADIUS - CAR_HEIGHT - CUPOLA_HEIGHT, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setFillColor(Color.RED);
		add(cupola);
	}
	

/* Dimensions of the frame of a train car */
	private static final double CAR_WIDTH = 75 * 2;
	private static final double CAR_HEIGHT = 36 * 2;
	
/* Distance from the bottom of a train car to the track below it */
	private static final double CAR_BASELINE = 8 * 2;
	
/* Width of the connector, which overlaps between successive cars */
	private static final double CONNECTOR = 6 * 2;
	
/* Radius of the wheels on each car */
	private static final double WHEEL_RADIUS = 8 * 2;
	
/* Distance from the edge of the frame to the center of the wheel */
	private static final double WHEEL_INSET = 16 * 2;
	
/* Dimensions of the cab on the engine */
	private static final double CAB_WIDTH = 35 * 2;
	private static final double CAB_HEIGHT = 8 * 2;
	
/* Dimensions of the smokestack and its distance from the front */
	private static final double SMOKESTACK_WIDTH = 8 * 2;
	private static final double SMOKESTACK_HEIGHT = 8 * 2;
	private static final double SMOKESTACK_INSET = 8 * 2;
	
/* Dimensions of the door panels on the boxcar */
	private static final double DOOR_WIDTH = 18 * 2;
	private static final double DOOR_HEIGHT = 32 * 2;
	
/* Dimensions of the cupola on the caboose */
	private static final double CUPOLA_WIDTH = 35 * 2;
	private static final double CUPOLA_HEIGHT = 8 * 2;
	
}
