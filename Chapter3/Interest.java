/* File: Interest.java
 * ------------------------------
 * This program calculates annual interest rate based on account balance
 */

package Chapter3;

import acm.program.*;

public class Interest extends ConsoleProgram {
	public void run() {
		println("Interest calculation program");
		double balance = readInt("Enter starting balance: ");
		double interestRate = readDouble("Enter annual interest rate: ");
		
		/* convert percent rate to decimal form by dividing by 100 */
		interestRate /= 100;  
		
		/* add interest rate to balance */
		balance += (balance * interestRate);
		
		println("Balance after one year = " +  balance);
		
		balance += (balance * interestRate);
		
		println("Balance after two years = " + balance);
		
			
	}

}
