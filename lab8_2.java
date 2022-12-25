package lab8;
import acm.program.ConsoleProgram;

public class lab8_2 extends ConsoleProgram{
	private int fibonacci(int n){
		int n1 = 0;
		int n2 = 1;
		int temp;
		if(n == 1) 
			n2 = 0;
		else if(n == 2)
			n2 = 1;
		else {
		for(int i = 2 ; i <= n ; i ++)
		{
			temp = n2;
			n2 = n1 + n2;
			n1 = temp;
		}
		}
		return n2;
		
	}
	public void run() {
		int k = readInt("toogoo oruulna uu");
	    println(fibonacci(k));
	}

	public static void main(String[] args) {
		new lab8_2().start();
	}
}