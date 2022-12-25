
package lab8;
import acm.graphics.*;
import acm.program.*;

public class lab8_8 extends GraphicsProgram{
	private GRect ihbiy(double x, double y, double a, double b){
		GRect body = new GRect(x , y , a,b );
		add(body);
		GRect yandan=new GRect(x/2+a/2,y-b/4,a/4,b/4);
		add(yandan);
		GLine hamar=new GLine(x/4 , y+b , x,y+b);
		add(hamar);
		GLine hamka=new GLine(x/4 , y+b , x,y/2+b);
		add(hamka);
		GOval smoke=new GOval(x/2+a/2, y-b/2, a/5, a/5);
		add(smoke);
		GOval dugui1=new GOval(x, y+b-b/10, b/2, b/2);
		add(dugui1);
		GOval dugui2=new GOval(x+a-b/2, y+b-b/10, b/2, b/2);
		add(dugui2);
		return body;
	}
	private GRect zalgaas(double x, double y, double a, double b){
		GRect body = new GRect(x , y , a,b );
		add(body);
		GLine holboos=new GLine(x-a, y+b, x, y+b);
		add(holboos);
		GOval dugui1=new GOval(x, y+b-b/10, b/2, b/2);
		add(dugui1);
		GOval dugui2=new GOval(x+a-a/3, y+b-b/10, b/2, b/2);
		add(dugui2);
		return body;
		
	}
	
	
	public void run(){
		double h=getHeight();
		double w=getWidth();
		double s=N*100;
		ihbiy(w/10 , h/ 5 * 1.25 , w/3 , h / 5 );
		for(int i=0; i<s; i=i+100){
        zalgaas(w*18/30+i, h/ 5 * 1.25 , w/3 , h / 5 );
	}
	}
private static final int N=1;
}
