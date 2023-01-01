package Graphics;

import acm.graphics.*;

public class GTriangle extends GPolygon {
	
	public GTriangle(int side) {
		addVertex(0, 0);
		addPolarEdge(side, 0);
		addPolarEdge(0.5 * side, 120);
	}

}
