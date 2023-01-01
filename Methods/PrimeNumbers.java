/* File: PrimeNumbers
 * 
 * Program finds prime numbers.
 */

package Methods;

import acm.program.*;

public class PrimeNumbers extends ConsoleProgram {
	
	public void run() {
		while(true) {
			println("This program checks if a number is a prime number.");
			int num = readInt("Enter positive number: ");
			if (prime(num) == true) println(num + " is prime number");
			else println(num + " is not a prime number");
			println("");
		}
	}
	
	private boolean prime(int n) {
		if (n == 1) return false;
		if (n == 2) return true;
		for (int i = 2; i < n; i++) {
			println(i);
			if (n % i == 0) return false;
	/* 
	 * when number is not divisible by to
	 * skip all even numbers
	 * by checking only odd numbers
	 */
			if (i > 2) i += 1;
			
		}
		return true;
	}

}
