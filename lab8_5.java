package lab8;
import java.awt.Color;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class lab8_5 extends GraphicsProgram{
	public void run(){
		double r = (OUTER_RADIUS - INNER_RADIUS)/(N_CIRCLES);
		double h = getWidth();
		double w = getHeight();
		for(int i = N_CIRCLES;  i>0;i--)
		{
			if(i%2 == 1)
				add(createFilledCircle(h/2 - INNER_RADIUS  , w/2- -INNER_RADIUS  ,2*r*i,  Color.RED));
			else 
				add(createFilledCircle(h/2 -   INNER_RADIUS, w/2- - INNER_RADIUS ,2*r*i,  Color.WHITE));
		}
	}
	private static final int N_CIRCLES = 10; 
	private static final int OUTER_RADIUS = 50;
	private static final int INNER_RADIUS = 5;
	private GOval createFilledCircle(double x , double y , double r , Color color) {
		GOval circle = new GOval(x - r, y-r,2*r , 2*r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	public static void main(String[] args) {
		new lab8_5 ().start();
	}
}