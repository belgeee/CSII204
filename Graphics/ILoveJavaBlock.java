package Graphics;

import java.awt.Color;

import acm.graphics.*;

public class ILoveJavaBlock extends QuiltBlock {
 
	public ILoveJavaBlock() {
		GRect background = new GRect(getBlockSize(), getBlockSize());
		background.setFilled(true);
		background.setFillColor(Color.PINK);
		add(background, 0, 0);
		
		HartShepedPoly hart = new HartShepedPoly(50);
		hart.setColor(Color.RED);
		hart.setFilled(true);
		hart.setFillColor(Color.RED);
		add(hart, 85, 55);
		
		GLabel topText = new GLabel("I");
		GLabel midText = new GLabel("Love");
		GLabel botText = new GLabel("Java");
		
		topText.setFont("Helvetica-BOLD-12");
		midText.setFont("Helvetica-BOLD-12");
		botText.setFont("Helvetica-BOLD-12");
		
		topText.setColor(Color.WHITE);
		midText.setColor(Color.WHITE);
		botText.setColor(Color.WHITE);
		
		add(topText, 50, 40);
		add(midText, 37, 55);
		add(botText, 37, 70);
	}
}
