/* Headline.java
 * 
 * Program scrolls text from right to left side
 * of the window.
 */

package Chapter4;

import java.awt.*;

import acm.program.*;
import acm.graphics.*;

public class Headline extends GraphicsProgram {
	
	public void run() {
		GLabel newsScroll = new GLabel("INTERSTELLAR IS MINDBLOWING", getWidth(), 300);
		newsScroll.setFont("Helvetica-300");
		add(newsScroll);
		while(true) {
			newsScroll.move(-1, 0);
			pause(10);
		}
	}

}
