package lab8;
import acm.program.ConsoleProgram;
public class lab8_1 extends ConsoleProgram{
	public void run() {
		int a,b,c;
		a = readInt("a:");
		b = readInt("b:");
		c = readInt("c:");
		double d = diskromnat(a, b, c);
		double m=-b+d;
		double s=-b-d;
		if( d > 0) {
			println("solution 1: " + (m)/(2*a) );
			println("solution 2: " + (s)/(2*a) );
		}
		else if(d == 0) {
			println("solution: " + (-b)/(2/a));
		}
		else {
			println("shiidgui");
		}
	}
	private double diskromnat(int l, int s, int m){
	double k = Math.sqrt(s*s - 4*l*m);
	return k;
	}

	public static void main(String[] args) {
		new lab8_1().start();
	}
}