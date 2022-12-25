package lab13;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.awt.event.*;

public class SimpleDraw6 extends GraphicsProgram {
	
	public static final int APPLICATION_WIDTH = 800;
	public static final int APPLICATION_HEIGHT = 600;
	
	
	public void init() {
		add(lineLogo, 20, 20);
		add(emptyRectLogo, 20, 80);
		add(fillRectLogo, 20, 140);
		add(emptyOvalLogo, 20, 200);
		add(fillOvalLogo, 20, 260);
		
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		if (gobj != null && gobj != lineLogo && gobj != emptyRectLogo && gobj != fillRectLogo
						 && gobj != emptyOvalLogo && gobj != fillOvalLogo) {
			selectOneShapeOnly1();
		} else if (lineLogo.contains(e.getX(), e.getY())) {
			isLine = selectOneShapeOnly1();
		} else if (emptyRectLogo.contains(e.getX(), e.getY())) {
			isEmptyRect = selectOneShapeOnly1();
		} else if (fillRectLogo.contains(e.getX(), e.getY())) {
			isFillRect = selectOneShapeOnly1();
		} else if (emptyOvalLogo.contains(e.getX(), e.getY())) {
			isEmptyOval = selectOneShapeOnly1();
		} else if (fillOvalLogo.contains(e.getX(), e.getY())) {
			isFillOval = selectOneShapeOnly1();
		}
	}
	
	public void mousePressed(MouseEvent e)  {	
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
		 if (isLine) {
			 line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
			add(line);
		} else if (isEmptyRect) {
			emptyRect = new GRect(0, 0);
			add(emptyRect, e.getX(), e.getY());
			rectCornerX = e.getX();
			rectCornerY = e.getY();
		} else if (isFillRect) {
			fillRect = new GRect(0, 0);
			fillRect.setFilled(true);
			fillRect.setFillColor(rgen.nextColor());
			add(fillRect, e.getX(), e.getY());
			rectCornerX = e.getX();
			rectCornerY = e.getY();
		} else if (isEmptyOval) {
			emptyOval = new GOval(0, 0);
			add(emptyOval, e.getX(), e.getY());
			rectCornerX = e.getX();
			rectCornerY = e.getY();
		} else if (isFillOval) {
			fillOval = new GOval(0, 0);
			fillOval.setFilled(true);
			fillOval.setFillColor(rgen.nextColor());
			add(fillOval, e.getX(), e.getY());
			rectCornerX = e.getX();
			rectCornerY = e.getY();
		} 
	}
	
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		} else if (isLine) {
			drawLine(e);
		} else if (isEmptyRect) {
			drawEmptyRect(e);
		} else if (isFillRect) {
			drawFillRect(e);
		} else if (isEmptyOval) {
			drawEmptyOval(e);
		} else if (isFillOval) {
			drawFillOval(e);
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		gobj = null;
	}
	private void drawLine(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
	
	private void drawEmptyRect(MouseEvent e) {
		if (e.getX() > rectCornerX && e.getY() > rectCornerY) {
			emptyRect.setSize(e.getX() - rectCornerX, e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() > rectCornerY) {
			emptyRect.setLocation(e.getX(), rectCornerY);
			emptyRect.setSize(rectCornerX - e.getX(),  e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() < rectCornerY) {
			emptyRect.setLocation(e.getX(), e.getY());
			emptyRect.setSize(rectCornerX - e.getX(),  rectCornerY - e.getY());
		} else if (e.getX() > rectCornerX && e.getY() < rectCornerY) {
			emptyRect.setLocation(rectCornerX, e.getY());
			emptyRect.setSize(e.getX() - rectCornerX,  rectCornerY - e.getY());
		}
	}
	
	private void drawFillRect(MouseEvent e) {
		if (e.getX() > rectCornerX && e.getY() > rectCornerY) {
			fillRect.setSize(e.getX() - rectCornerX, e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() > rectCornerY) {
			fillRect.setLocation(e.getX(), rectCornerY);
			fillRect.setSize(rectCornerX - e.getX(),  e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() < rectCornerY) {
			fillRect.setLocation(e.getX(), e.getY());
			fillRect.setSize(rectCornerX - e.getX(),  rectCornerY - e.getY());
		} else if (e.getX() > rectCornerX && e.getY() < rectCornerY) {
			fillRect.setLocation(rectCornerX, e.getY());
			fillRect.setSize(e.getX() - rectCornerX,  rectCornerY - e.getY());
		} 
	}
	
	private void drawEmptyOval(MouseEvent e) {
		if (e.getX() > rectCornerX && e.getY() > rectCornerY) {
			emptyOval.setSize(e.getX() - rectCornerX, e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() > rectCornerY) {
			emptyOval.setLocation(e.getX(), rectCornerY);
			emptyOval.setSize(rectCornerX - e.getX(), e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() < rectCornerY) {
			emptyOval.setLocation(e.getX(), e.getY());
			emptyOval.setSize(rectCornerX - e.getX(), rectCornerY - e.getY());
		} else if (e.getX() > rectCornerX && e.getY() < rectCornerY) {
			emptyOval.setLocation(rectCornerX, e.getY());
			emptyOval.setSize(e.getX() - rectCornerX, rectCornerY - e.getY());
		}
	}
	
	private void drawFillOval(MouseEvent e) {
		if (e.getX() > rectCornerX && e.getY() > rectCornerY) {
			fillOval.setSize(e.getX() - rectCornerX, e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() > rectCornerY) {
			fillOval.setLocation(e.getX(), rectCornerY);
			fillOval.setSize(rectCornerX - e.getX(), e.getY() - rectCornerY);
		} else if (e.getX() < rectCornerX && e.getY() < rectCornerY) {
			fillOval.setLocation(e.getX(), e.getY());
			fillOval.setSize(rectCornerX - e.getX(), rectCornerY - e.getY());
		} else if (e.getX() > rectCornerX && e.getY() < rectCornerY) {
			fillOval.setLocation(rectCornerX, e.getY());
			fillOval.setSize(e.getX() - rectCornerX, rectCornerY - e.getY());
		} 
	}
	private boolean selectOneShapeOnly1() {
		isLine = false;
		isEmptyRect = false;
		isFillRect = false;
		isEmptyOval = false;
		isFillOval = false;
		
		return true;
	}
	private GImage lineLogo = new GImage("lineLogo.png");
	private GImage emptyRectLogo = new GImage("emptyRectLogo.png");
	private GImage fillRectLogo = new GImage("fillRectLogo.png");
	private GImage emptyOvalLogo = new GImage("emptyOvalLogo.png");
	private GImage fillOvalLogo = new GImage("fillOvalLogo.png");
	
	
	private GLine line;
	private GRect emptyRect;
	private GRect fillRect;
	private GOval emptyOval;
	private GOval fillOval;
	
	private int rectCornerX;
	private int rectCornerY;
	

	private boolean isLine;
	private boolean isEmptyRect;
	private boolean isFillRect;
	private boolean isEmptyOval;
	private boolean isFillOval;
	
/* variables for moving object on GraphicProgram Canvas */
	private GObject gobj;
	private GPoint last;
	
/* random color */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
	


