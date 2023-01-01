/* File: WeightConvert.java
 * 
 * Converts weight in kilograms to pounds and ounces
 * 
 */

package Chapter3;

import acm.program.*;

public class WeightConvert extends ConsoleProgram { 
	public void run() {
		println("This program converts kilograms to corresponding weight in pounds and ounces.");
		double kilo = readDouble("Enter weight in kilos: ");
		double weightInPounds = kilo * ONE_KILO_IN_POUNDS;
		
		/*
		 *  type cast can be used to takeout the value after the comma
		 * 
		 *        double remainingOunces = weightInPounds - (int) weightInPounds;
		 *        
		 *  same effect as following remainder used in code
		 */
		
		/* remainder is used to take ounces left from whole pounds */
		double remainingOunces = weightInPounds % 1;
		
		/* convert decimal value left from pounds into equivalent value in ounces */
		remainingOunces = ONE_POUND_IN_OUNCES * remainingOunces;
		
		println((double) weightInPounds + " pounds and " + (double) remainingOunces + " ounces");
		
	}
	
	private static final double ONE_KILO_IN_POUNDS = 2.20462;
	private static final double ONE_POUND_IN_OUNCES = 16;

}
