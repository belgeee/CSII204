package Graphics;

import acm.graphics.*;
import acm.program.*;

public class HartShaped extends GraphicsProgram {
	
	public void run() {
		double length = 100;
		GArc leftTop = new GArc(length, length, 315, 180);
		add(leftTop, getWidth() / 2 - 15, getHeight() / 2);
		
		GArc rightTop = new GArc(length, length, 45, 180);
		add(rightTop, getWidth() / 2 - length + 15, getHeight() / 2);
		
		GLine rightLine = new GLine(getWidth() / 2 + length - 30, getHeight() / 2 + length - 15,
									getWidth() / 2, getHeight() / 2 + length + 55);
		add(rightLine);
		
		GLine leftLine = new GLine(getWidth() / 2 - length + 30, getHeight() / 2 + length - 15,
				getWidth() / 2, getHeight() / 2 + length + 55);
		add(leftLine);
	}
}
