package lab8;
import acm.program.ConsoleProgram;

public class lab8_12 extends ConsoleProgram{
	boolean isPerfect(int n) {
		int s = 0;
		for(int i = 1 ; i <= n/2 ; i++) {
			if(n%i == 0) {
				s+= i;
			}
		}
		if(s == n)
			return true;
		else 
			return false;
	}
	public void run() {
		int k = readInt("toogoo oruulna uu: ");
		if(isPerfect(k))
			println("yes");
		else 
			println("no");
	}

	public static void main(String[] args) {
		new lab8_12().start();
	}
}