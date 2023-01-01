/* File: TestingMethods.java
 * -------------------------
 * This program is used for testing methods from
 * other classes in package 6 .
 */

package Chapter6;

import acm.program.*;


public class TestingMethods extends ConsoleProgram {
	
	public void run() {
		Rational half = new Rational();
		Rational quarter = new Rational();
		
		println("polowka = " + half);
		println("cwiartka = " + quarter);
		println("\npolowka + cwiartka = " + half.add(quarter));
	}
}
