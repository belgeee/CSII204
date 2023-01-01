package Graphics;

import acm.graphics.*;

public class GTrapezoid extends GPolygon {
	
/*
 * Constructor for trapezoid with paralel bases
 * @param top base 'a'
 * @param bottom base 'b' - needs to be larger than 'a'
 * @param altitude 'h'
 */
	public GTrapezoid(int a, int b, int h) {
		addVertex(0, 0);
		addVertex(a, 0);
		addVertex(a + ( (b - a) / 2), h);
		addVertex( -((b - a) / 2), h);
	}

}
