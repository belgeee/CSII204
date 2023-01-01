package Graphics;

import acm.graphics.*;

public class GDiamond extends GPolygon {
	
	public GDiamond(double width, double height) {
		addVertex(0, -height / 2);
		addVertex(width / 2, 0);
		addVertex(0, height / 2);
		addVertex(-width / 2, 0);
	}

}
