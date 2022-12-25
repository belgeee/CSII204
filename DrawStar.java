package lab13;

/*
 * File: DrawStarMap.java
 * ----------------------
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas.
 */

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class DrawStar extends GraphicsProgram {
	public void init() {
		setBackground(Color.GRAY);
		add(new JLabel("Star Name"), SOUTH);
		
		
		starName = new JTextField(10);
		starName.addActionListener(this);
		add(starName, SOUTH);
		addMouseListeners();
		addKeyListeners();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == starName) {
			add(new GLabel(starName.getText()), starPosition_X + 20, starPosition_Y);
		}
	}
	public void mouseClicked(MouseEvent e) {
		star = new GStar(STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
		starPosition_X = e.getX();
		starPosition_Y = e.getY();
		star.setFillColor(rgen.nextColor());
	}
	
	public void mousePressed(MouseEvent e) {
		gobj = getElementAt(e.getX(), e.getY());
		last = new GPoint(e.getPoint());
	}
	
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (gobj != null) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:	  gobj.move(0, -1); break;
				case KeyEvent.VK_DOWN:	  gobj.move(0, +1); break;
				case KeyEvent.VK_LEFT:    gobj.move(-1, 0); break;
				case KeyEvent.VK_RIGHT:   gobj.move(+1, 0); break;
				case KeyEvent.VK_DELETE:  remove(gobj);
			}
		}
	}
	private static final double STAR_SIZE = 30;
	private GStar star;
	
	private GObject gobj;
	private GPoint last;
	
	private JTextField starName;
	private int starPosition_X;
	private int starPosition_Y;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
