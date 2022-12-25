package lab13;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawFace3 extends GraphicsProgram {

	public void init() {
		int faceWidth = 150;
		int faceLength = 190;
		GFace face = new GFace(faceWidth, faceLength);
		add(face, getWidth() / 2 - faceWidth / 2, getHeight() / 2 - faceLength / 2);
		
		addPupils();
		addMouseListeners();
	}
	
	private void addPupils() {
		
		leftPupilX = getWidth() / 2 - 42;
		leftPupilY = getHeight() / 2 - 55;
		rightPupilX = getWidth() / 2 + 34;
		rightPupilY = getHeight() / 2 - 55;
		
		leftPupil = new GOval(10, 10);
		leftPupil.setFilled(true);
		add(leftPupil, leftPupilX, leftPupilY);
		
		rightPupil = new GOval(10, 10);
		rightPupil.setFilled(true);
		add(rightPupil, rightPupilX, rightPupilY);
	}
	
	public void mouseMoved(MouseEvent e) {
		int lPX = moveRate(leftPupilX - e.getX(), leftPupilX);
		int lPY = moveRate(leftPupilY - e.getY(), leftPupilY);
		leftPupil.setLocation(lPX, lPY);
		
		int rPX = moveRate(rightPupilX - e.getX(), rightPupilX);
		int rPY = moveRate(rightPupilY - e.getY(), rightPupilY);
		rightPupil.setLocation(rPX, rPY);
	}
	
	private int moveRate(int distance, int pupil) {
		if (distance > 5 && distance <= 20) return pupil - 1;
		if (distance > 20 && distance <= 50) return pupil - 2;
		if (distance > 50 && distance <= 100) return pupil - 3;
		if (distance > 100 && distance <= 200) return pupil - 4;
		if (distance > 200) return pupil - 5;
		
		
		if (distance < -5 && distance >= -20) return pupil + 1;
		if (distance < -20 && distance >= -50) return pupil + 2;
		if (distance < -50 && distance >= -100) return pupil + 3;
		if (distance < -100 && distance >= -200) return pupil + 4;
		if (distance < -200) return pupil + 5;
		
		return pupil;
	}
	
	private GOval leftPupil;
	private GOval rightPupil;
	
	private int leftPupilX;
	private int leftPupilY;
	private int rightPupilX;
	private int rightPupilY;
}
