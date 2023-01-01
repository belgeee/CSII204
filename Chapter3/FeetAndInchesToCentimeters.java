/* File: FeetAndInchesToCentimeters.java
 * ----------------------------------------
 * This program converts feet and inches to centimeters
 */

package Chapter3;

import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram {
	public void run() {
		println("This program converts feet and inches to centimeters.");
		int feet = readInt("Enter value in feet: ");
		int inches = readInt("Enter value in inches: ");
		int inchesTotal = feet * INCHES_IN_FEET + inches;
		double cm = inchesTotal * CENTIMETERS_PER_INCH;
		println(feet + "ft " + inches + "in = " + cm + "cm" );
	}

	private static final int INCHES_IN_FEET = 12;
	private static final double CENTIMETERS_PER_INCH = 2.54;
	
}
