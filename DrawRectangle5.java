package lab13;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

import java.awt.event.*;

public class DrawRectangle5 extends GraphicsProgram {
	
	public void init() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		rect = new GRect(0, 0);
		rect.setFilled(true);
		rect.setFillColor(rgen.nextColor());
		add(rect, e.getX(), e.getY());
		rectCornerX = e.getX();
		rectCornerY = e.getY();

	}
	
	public void mouseDragged(MouseEvent e) {
		
		if (e.getX() > rectCornerX && e.getY() > rectCornerY) {
			rect.setSize(e.getX() - rectCornerX, e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() > rectCornerY) {
			rect.setLocation(e.getX(), rectCornerY);
			rect.setSize(rectCornerX - e.getX(),  e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() < rectCornerY) {
			rect.setLocation(e.getX(), e.getY());
			rect.setSize(rectCornerX - e.getX(),  rectCornerY - e.getY());
		} else if (e.getX() > rectCornerX && e.getY() < rectCornerY) {
			rect.setLocation(rectCornerX, e.getY());
			rect.setSize(e.getX() - rectCornerX,  rectCornerY - e.getY());
		} else {}
		
	}
	

	private GRect rect;
	private int rectCornerX;
	private int rectCornerY;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}





