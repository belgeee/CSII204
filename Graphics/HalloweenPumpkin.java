package Graphics;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class HalloweenPumpkin extends GraphicsProgram {
	
/*
 * Dimensions of a window
 */
	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;
	
/*
 * Main program
 */
	public void run() {
		GOval head = new GOval(headSize, headSize);
		head.setFilled(true);
		head.setFillColor(Color.ORANGE);
		add(head, middleX - 0.5 * headSize, middleY - 0.5 * headSize);
		
		GTriangle leftEye = new GTriangle(eyesNose);
		leftEye.setFilled(true);
		add(leftEye, middleX - eyeFromMiddle, middleY - eyeFromMiddle);
		
		GTriangle rightEye = new GTriangle(eyesNose);
		rightEye.setFilled(true);
		add(rightEye, middleX + eyeFromMiddle, middleY - eyeFromMiddle);
		
		GPolygon mouth = new GPolygon();
		createMouth(mouth);
		mouth.setFilled(true);
		add(mouth, middleX, middleY + eyeFromMiddle);
		
		GRect top = new GRect(10, 20);
		top.setFilled(true);
		add(top, middleX - 5, middleY - 150 - 20);
		
		
	}
	
	private void createMouth(GPolygon mouth) {
		double seg = 15.0;
		mouth.addVertex(0, 0);
		mouth.addPolarEdge(seg, 315);
		mouth.addPolarEdge(seg, 45);
		mouth.addPolarEdge(seg, 315);
		mouth.addPolarEdge(seg, 45);
		mouth.addPolarEdge(seg, 315);
		mouth.addPolarEdge(2 * seg, 225);
		mouth.addPolarEdge(seg, 135);
		mouth.addPolarEdge(seg, 225);
		mouth.addPolarEdge(seg, 135);
		mouth.addPolarEdge(seg, 225);
		mouth.addPolarEdge(seg, 135);
		mouth.addPolarEdge(seg, 225);
		mouth.addPolarEdge(2 * seg, 135);
		mouth.addPolarEdge(seg, 45);
		mouth.addPolarEdge(seg, 315);
		mouth.addPolarEdge(seg, 45);
		mouth.addPolarEdge(seg, 315);
		
	}
	
/*
 * Private constants
 */
	
	// middle point of the pumpkin
	private static final double middleX = (0.5 * APPLICATION_WIDTH);
	private static final double middleY = (0.5 * APPLICATION_HEIGHT);
	
	private static final int headSize = 300;
	private static final int eyesNose = (int) (0.1 * headSize);
	private static final int eyeFromMiddle = 50;
	

}
