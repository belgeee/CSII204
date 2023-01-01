/* File: AreaOfCircle.java
 * --------------------------
 * Computes area of circle based on value of radius
 */

package Chapter3;

import acm.program.*;

public class AreaOfCircle extends ConsoleProgram {
	public void run() {
		println("Computes area of circle");
		double radius = readDouble("Enter radius: ");
		double area = PI * (radius * radius);
		println("Area = " + area);
	}

	private static final double PI = 3.14159265359;
}
