package lab8;
import acm.program.ConsoleProgram;

public class lab8_11 extends ConsoleProgram{
	
	public void run() {
		int k = readInt("toogoo oruulna uu: ");
		if(isPrime(k)) 
			println("yes it is prime");
		else 
			println("no");
	}
	boolean isPrime(int n) {
		int s = 0;
		for(int i = 2 ; i <= n/2 ; i++) {
			if(n % i ==0) 
				s++;
		}
		if(s == 0) 
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		new lab8_11().start();
	}
}