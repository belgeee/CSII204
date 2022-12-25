package lab8;
import acm.program.*;
public class lab8_3 extends ConsoleProgram{
	private static final int BASE=2;
	private static final int EXPONENT=10;
	 public void run(){
		 for (int i=0; i<=EXPONENT; i++){
			 double b=raiseIntPower(BASE, i);
			 println (BASE +"^"+i+"="+b);
	 }
	 }
		 public double raiseIntPower(int x, int y){
			 return Math.pow(x,y);
		 }
		 public static void main(String[] args ){
			 new lab8_3().start();
		 }
 }
