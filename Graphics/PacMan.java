package Graphics;

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class PacMan extends GraphicsProgram {
	
	public void run() {
		pac = new GArc(PACSIZE, PACSIZE, 45,270);
		pac.setFilled(true);
		pac.setFillColor(Color.YELLOW);
		add(pac, 50, 50);
		
		while (true) {
			step = 0;
			for (int i = step; i < 4; i++) {
				movePacMan(i);
				step = i;
			}
			for (int j = step - 1; j > 0; j--) {
				movePacMan(j);
			}
		}
	}
	
	private void movePacMan(int look) {
		switch (look) {
		case 0:
			pac.setStartAngle(45);
			pac.setSweepAngle(270);
			break;
		case 1:
			pac.setStartAngle(30);
			pac.setSweepAngle(300);
			break;
		case 2:
			pac.setStartAngle(15);
			pac.setSweepAngle(330);
			break;
		case 3:
			pac.setStartAngle(1);
			pac.setSweepAngle(359);
			break;
		default:
				pac.setFillColor(Color.RED);
				break;
		}
		pac.move(2 , 0);
		pause(150);
	}
	
	private GArc pac;
	private static int step;
	private static final int PACSIZE = 50;

}
