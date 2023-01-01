package Graphics;

import acm.graphics.*;

public class HartShepedPoly extends GPolygon {

	public HartShepedPoly(double size) {
	
		addArc(size, size, 315, 180);
		addArc(size, size, 45, 180);
		addPolarEdge(size, 315);
	
	}
}
