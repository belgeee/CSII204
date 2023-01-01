package Graphics;

import acm.graphics.*;

public class GTShape extends GPolygon {
	
/*
 * Reference point is a top left corner of T-shape
 */
	public GTShape (double width) {
		double segment = width / 3;
		addVertex(0, 0);
		addVertex(width, 0);
		addVertex(width, segment);
		addVertex(segment * 2, segment);
		addVertex(segment * 2, segment * 3);
		addVertex(segment, segment * 3);
		addVertex(segment, segment);
		addVertex(0, segment);
	}

}
