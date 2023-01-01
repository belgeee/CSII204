/* File:TicTacToeExtra.java
 * 
 * Programs draws a figure necessary to play TicTacToe
 * 
 */

package Chapter3;

import acm.program.*;
import acm.graphics.*;

public class TicTacTocExtra extends GraphicsProgram {
	public void run() {
		
		/* x and y coordinates of window centre */
		int midX = getWidth() / 2;
		int midY = getHeight() / 2;
		
		/* useful calculation for reference points */
		double thirdOfBoard = 0.166 * BOARD_SIZE;
		double halfOfBoard = 0.5 * BOARD_SIZE;
		
		
		GLine horizontalTopLine = new GLine(midX-halfOfBoard, midY-thirdOfBoard, midX+halfOfBoard, midY-thirdOfBoard);
		GLine horizontalBottomLine = new GLine(midX-halfOfBoard, midY+thirdOfBoard, midX+halfOfBoard, midY+thirdOfBoard);
		
		GLine verticalLeftLine = new GLine(midX-thirdOfBoard, midY-halfOfBoard, midX-thirdOfBoard, midY+halfOfBoard);
		GLine verticalRightLine = new GLine(midX+thirdOfBoard, midY-halfOfBoard, midX+thirdOfBoard, midY+halfOfBoard);
		
		add(horizontalTopLine);
		add(horizontalBottomLine);
		add(verticalLeftLine);
		add(verticalRightLine);
		
	}
	
	private static final int BOARD_SIZE = 100;

}
