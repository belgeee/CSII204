/* File:FavouritePicture
 * ---------------------
 * This program displays a picture with citation.
 */

package Graphics;

import acm.program.*;
import acm.graphics.*;

public class FavouritePicture extends GraphicsProgram {
	
	public void run() {
		GImage image = new GImage("jackh.jpg");
		add(image);
		GLabel label = new GLabel("Jack Herer");
		label.setFont("Helvetica-24");
		add(label, 0, image.getHeight() + label.getHeight());
	}

}
