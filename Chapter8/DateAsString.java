/* File: DateAsString.java
 * -----------------------
 * Program writes specified date from the calendar
 * as single string of text. Can be used as a staic method 
 * in other classes.
 */

package Chapter8;

import acm.program.*;

public class DateAsString extends ConsoleProgram {

	public static String createDateString(int day, int month, int year) {
		String m = " ";
		switch (month) {
		case 1: m = "Jan"; break;
		case 2: m = "Feb"; break;
		case 3: m = "Mar"; break;
		case 4: m = "Apr"; break;
		case 5: m = "May"; break;
		case 6: m = "Jun"; break;
		case 7: m = "Jul"; break;
		case 8: m = "Aug"; break;
		case 9: m = "Sep"; break;
		case 10: m = "Oct"; break;
		case 11: m = "Nov"; break;
		case 12: m = "Dec"; break;
		default: m = " "; break;
		}
		return (day + "-" + m + "-" + year); 
	}
	
}
