package lab13;

/* File: ColoredLabels.java
 * ------------------------
 * convas deer ongoniii labeluudiig randomoor tawina
 * ner ungu hargalzahkv unguudiig bolon labeluudiig haruulna
 * ungu ni nerteigee ijil baiwal zogsono
 */

import java.awt.Color;
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;

public class RandomColorLabelTwo extends GraphicsProgram {
	
	public void init() {
		addMouseListeners();
	}
	
	public void run() {
		while (true) {
			colorLabel = getLabel( rgen.nextInt(1, 7));
			colorLabel.setColor( getColor(colorLabel));
			colorLabel.setFont("Helvetica-bold-40");
			add (colorLabel,
				rgen.nextInt( (int)colorLabel.getWidth(), getWidth() - (int)colorLabel.getWidth()),
				rgen.nextInt( (int)colorLabel.getHeight(), getHeight() - (int)colorLabel.getHeight()) 
				);
			pause(5000);
			removeAll();
			pause(200);
		}		
	}

/*
 * f GLabel-iin helsen ungiig reset hiine
 */
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == colorLabel) {
			if (colorLabel == red) {
				colorLabel.setColor(Color.RED);
			} else if (colorLabel == orange) {
				colorLabel.setColor(Color.ORANGE);
			} else if (colorLabel == yellow) {
				colorLabel.setColor(Color.YELLOW);
			} else if (colorLabel == green) {
				colorLabel.setColor(Color.GREEN);
			} else if (colorLabel == cyan) {
				colorLabel.setColor(Color.CYAN);
			} else if (colorLabel == blue) {
				colorLabel.setColor(Color.BLUE);
			} else if (colorLabel == magenta) {
				colorLabel.setColor(Color.MAGENTA);
			}
		}
	}
	
/*
 * shine random color label-d zoriulj songono
 */
	public void mouseReleased(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj == colorLabel) {
			colorLabel.setColor( getColor(colorLabel) );
		}
	}
	
/*
 * @return GLabel color name
 * @param random number 1 - 7
 * 
 */
	private GLabel getLabel(int n) {
		switch (n) {
		case 1:
			red.setColor(Color.RED);
			return red;
		case 2:
			orange.setColor(Color.ORANGE);
			return orange;
		case 3:
			yellow.setColor(Color.YELLOW);
			return yellow;
		case 4:
			green.setColor(Color.GREEN);
			return green;
		case 5:
			cyan.setColor(Color.CYAN);
			return cyan;
		case 6:
			blue.setColor(Color.BLUE);
			return blue;
		case 7:
			magenta.setColor(Color.MAGENTA);
			return magenta;
		default:
			return null;
		}
	}
	
/*
 *  Mixes colors for labels. 
 * Ungu ni label eesee yalgaatai baina Color.
 */
	private Color getColor(GLabel lab) {
		Color newColor = lab.getColor();
		while ( newColor.equals(lab.getColor())) {
			newColor = getNewColor();  // боломжтой өнгө авах getNewColor функцийг дууд
		}
		return newColor;
	}
	
/*
 * Shine ungu
 */
	private Color getNewColor() {
		int n = rgen.nextInt(1, 7);
		switch (n) {
		case 1:
			return Color.RED;
		case 2:
			return Color.ORANGE;
		case 3:
			return Color.YELLOW;
		case 4:
			return Color.GREEN;
		case 5:
			return Color.CYAN;
		case 6:
			return Color.BLUE;
		case 7:
			return Color.MAGENTA;
		default:
			return Color.BLACK;
		}
	}

/* private instance variables */
	private GLabel red = new GLabel("RED");
	private GLabel orange = new GLabel("ORANGE");
	private GLabel yellow = new GLabel("YELLOW");
	private GLabel green = new GLabel("GREEN");
	private GLabel cyan = new GLabel("CYAN");
	private GLabel blue = new GLabel("BLUE");
	private GLabel magenta = new GLabel("MAGENTA");
	
	private GLabel colorLabel; // placeholder for nerlesen label
	
	
/* random generator */
	private RandomGenerator rgen = new RandomGenerator();
	
	
}
