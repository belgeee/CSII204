package lab8;
import acm.program.*;
public class lab8_4 extends ConsoleProgram{
public void run(){
	int n=readInt("Enter n:");
	println((divideoften(n)));
}
 private int divideoften(int n){
	 int i=0;
	 while(n>0){
			i++;
			n=n/10;
		}
 
return i;
 }
}
