package Graphics;

import java.awt.Color;

import acm.graphics.*;

public class NestedSquareBlock extends QuiltBlock {

	public NestedSquareBlock() {
		double squareCentreX = getBlockSize() / 2;
		double squareCentreY = getBlockSize() / 2;
		double size = (double) getBlockSize();
		for (int i = 0; i < 2; i++) {
			add(rectPoly(size, size, 0, Color.CYAN), squareCentreX, squareCentreY);
			size = getFrameSize(size / 2);
			add(rectPoly(size, size, 45, Color.MAGENTA), squareCentreX, squareCentreY);
			size = getFrameSize(size / 2);
		}
	}
	
	// create rectangle polygon with origin in the top left corner
		private GPolygon rectPoly(double width, double height, double angle, Color clr) {
			GPolygon r = new GPolygon();
			r.addVertex(-width / 2, -height / 2);
			r.addVertex(width / 2, -height / 2);
			r.addVertex(width / 2, height / 2);
			r.addVertex(-width / 2, height / 2);
			r.rotate(angle);
			r.setFilled(true);
			r.setFillColor(clr);
			return r;
		}
		
		private double getFrameSize(double a) {
			double result = Math.sqrt( Math.pow(a, 2) + Math.pow(a, 2) ); 
			return result;
		}
}
