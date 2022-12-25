package lab8;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class lab8_10 extends GraphicsProgram{
	private GRect buildHouse(double x , double y , double a, double b) {
		GRect body = new GRect(x , y , a,b );
		add(body);
		GLine line1 = new GLine(x , y ,x + a/2 , y - b/3.5 );
		GLine line2 = new GLine(x + a/2 , y - b/3.5 , x + a , y  );
		add(line1);
		add(line2);
		return body;
	}
		private GRect buildBagana(double x , double y , double a, double b) {
			GRect body = new GRect(x , y , a,b );
			add(body);
			GLine line1 = new GLine(x , y ,x + a/2 , y - b/3.5*2 );
			GLine line2 = new GLine(x + a/2 , y - b/3.5*2 , x + a , y  );
			add(line1);
			add(line2);
			return body;
	}
	public void run(){
		double h = getHeight();
		double w = getWidth();		
		double s=N*100;
		for(int i=0;i<=s; i=i+100){
	    buildHouse(w/13*0.5+i, h / 5 * 1.25 , w/13 , h / 5 *3.5 );
	    buildHouse(w/13*1.5+i, h / 5 * 2.25 , w/13*4 , h / 5 *2.5 );
	    buildHouse(w/13*5.5+i, h / 5 * 1.25 , w/13 , h / 5 *3.5 );
	    buildHouse(w/13*3.1+i, h / 5 * 3.75 , w/13*0.8 , h / 5  );
		}
	    buildBagana(w/13*7.3+s, h / 5 * 3 , w/13*0.7 , h / 5 * 1.75  );
	    buildBagana(w/13*9.3+s, h / 5 * 3 , w/13*0.7 , h / 5 * 1.75  );
	    buildBagana(w/13*11.3+s, h / 5 * 3 , w/13*0.7 , h / 5 * 1.75  );
	    
		
	}
	private static final int N=2;//nemeed hden baishin nemhiin br0
	public static void main(String[] args) {
		new lab8_10().start();
}
}