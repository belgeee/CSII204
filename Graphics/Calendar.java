package Graphics;

import acm.program.*;
import acm.graphics.*;

public class Calendar extends GraphicsProgram {
	
	public void run() {
		int numberOfRows = getNumberOfRows();
		drawLines(numberOfRows);
		drawDayNum(numberOfRows);
		drawDaysOfWeek();
	}
	

	/*
 * Calculate number of rows to draw based on number of days
 * in the month and day on which the month starts.
 */
	private int getNumberOfRows() {
		int x = DAYS_IN_MONTH + (DAY_MONTH_STARTS);
		if (x == 28) {
			return 4;
		} else if (x > 28 && x < 36) {
			return 5;
		} else {
			return 6;
		}
	}
	
/* 
 * Draw rows and columns
 */
	private void drawLines(int rows) {
		int rowSize = getRowsSize(rows);
		int lenghtFromTop = DAYS_NAME_HEIGHT;
		
		// draw rows
		for (int i = 0; i < rows; i++) {
			add(new GLine(0, lenghtFromTop, getWidth(), lenghtFromTop));
			lenghtFromTop += rowSize;
		}
		
		double columnSize = getColumnSize(7);
		double x = columnSize;
		// draw columns
		for (int i = 0; i < 7; i++) {
			add(new GLine(x, DAYS_NAME_HEIGHT, x, getHeight()));
			x += columnSize;
		}
	}
	
/*
 * Calculate size between rows
 */
	private int getRowsSize(int numberOfRows) {
		return (getHeight() - DAYS_NAME_HEIGHT) / numberOfRows;
	}
	
/*
 * Calculate size between columns
 */
	private double getColumnSize(int numberOfColumns) {
		return (double) getWidth() / numberOfColumns;
	}
	
/*
 * Draw day numbers in appropiate boxes
 */
	private void drawDayNum(int numberOfRows) {
		double x = getWidth() / 7.0 + 1; // first row
		double y = DAYS_NAME_HEIGHT + 15; // first column
		Integer day = 1;
		double xPosition = x * DAY_MONTH_STARTS;
		double yPosition = y;
		String dayString = Integer.toString(day);
		// draw first day
		add(new GLabel(dayString, xPosition, yPosition));
		// draw all other days
		for (int i = DAY_MONTH_STARTS + 1; i < DAY_MONTH_STARTS + DAYS_IN_MONTH; i++) {
			day++;
			dayString = Integer.toString(day);
			if (i % 7 == 0) {
				xPosition = 0;
				yPosition += (getHeight() - DAYS_NAME_HEIGHT) / (double)numberOfRows;
			} else {
				xPosition += x;
			}
			add(new GLabel(dayString, xPosition, yPosition));
		}
	}

/* 
 * Array containing days of the week.
 * Method that draws days of week on canvas at thee top.	
 */
	String[] weekDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	
	private void drawDaysOfWeek() {
		double x = getWidth() / 7 * 0.5;
		double y = DAYS_NAME_HEIGHT * 0.5;
		for (int i = 0; i < weekDays.length; i++) {
			add(new GLabel(weekDays[i], x, y));
			x += getWidth() / 7;
		}
	}
	
/*
 * Named Constants
 *	
 * The number of days in the month */
	private static final int DAYS_IN_MONTH = 31;
	
/* The day of the week on which the month starts */
/* (Sunday = 0, Monday = 1, Tueasday = 2, and so on) */
	private static final int DAY_MONTH_STARTS = 6; 
	
/* First row for name of days size */
	private static final int DAYS_NAME_HEIGHT = 30;

}


