package Graphics;

import java.awt.*;
import acm.graphics.*;

public class LogCabinBlock extends QuiltBlock {
	
	public LogCabinBlock() {
		double frameWidth = thick * getBlockSize();
		double frameLength = getBlockSize() - frameWidth;
		double move = 0; 
		for (int i = 0; i < 4; i++) {
			add(rectPoly(frameLength, frameWidth, 0), 0 + move, 0 + move);
			add(rectPoly(frameLength, frameWidth, 270), getBlockSize() - move, 0 + move);
			add(rectPoly(frameLength, frameWidth, 180), getBlockSize() - move, getBlockSize() - move);
			add(rectPoly(frameLength, frameWidth, 90), 0 + move, getBlockSize() - move);
			frameLength -= (2 * frameWidth);
			move += frameWidth;
		}
	}
	
	// create rectangle polygon with origin in the top left corner
	public static GPolygon rectPoly(double width, double height, double angle) {
		GPolygon r = new GPolygon();
		r.addVertex(0, 0);
		r.addVertex(width, 0);
		r.addVertex(width, height);
		r.addVertex(0, height);
		r.rotate(angle);
		r.setFilled(true);
		r.setFillColor(Color.green);
		return r;
		
	}
	
	// frame thickness in a block
	private double thick = 0.11;
	
}
