package lab8;
	import acm.graphics.*;
	import acm.program.GraphicsProgram;

	public class lab8_9 extends GraphicsProgram{
		private GRect window1(double x ,double  y ,double  a,double  b) {
			GRect body = new GRect(x , y , a , b);
			GLine line1 = new GLine(x  , y + b/2 , x + a , y + b/2 );
			GLine line2 = new GLine(x + a/3  , y  , x + a/3 , y + b );
			GLine line3 = new GLine(x + a/3*2  , y  , x + a/3*2 , y + b );
			add(body);
			add(line1);
			add(line2);
			add(line3);
			return body;
		}
		private GRect window2(double x ,double  y ,double  a,double  b) {
			GRect body = new GRect(x , y , a , b);
			GLine line1 = new GLine(x  , y + b/2 , x + a , y + b/2 );
			GLine line2 = new GLine(x + a/2  , y  , x + a/2 , y + b );
			add(body);
			add(line1);
			add(line2);
			return body;
			
		}

		public void run(){
			double h = getHeight();
			double w = getWidth();
			GRect body = new GRect(w/20*3 , h/10 * 2.75 , w/20*14 , h/10*7);
			GLine line1 = new GLine(w/20*3 ,  h/10*2.75 , w/2 , h/10*0.25);
			GLine line2 = new GLine(w/2 , h/10*0.25 , w/20*17 , h/10*2.75);
			GRect door = new GRect(w/20*9 , h/10 * 6.75 , w/20*2 , h/10*3);
			add(body);
			add(line1);
			add(line2);
			add(door);
			window1(w/20*5 , h/10*6.75 , w/20 * 3 , h/10*2);
			window1(w/20*12 , h/10*6.75 , w/20 * 3 , h/10*2);
			window2(w/20*12.5 , h/10*3.75 , w/20 * 2 , h/10*2);
			window2(w/20*5.5 , h/10*3.75 , w/20 * 2 , h/10*2);
			GOval bariul = new GOval(w/20*10.7, h/10*8 , w/20/5 , w/20/5);
			add(bariul);
		}
		public static void main(String[] args) {
			new lab8_9().start();
		}
	}

