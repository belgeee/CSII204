package lab13;

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class YAG2 extends GraphicsProgram {

	public void init() {
		mousePosition = new GLabel("");
		add(mousePosition);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		mousePosition.setLabel("(" + x + ", " + y + ")");
		mousePosition.setLocation(x, y);
	}
	
	private GLabel mousePosition = new GLabel("");
}
