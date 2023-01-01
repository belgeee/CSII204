package Graphics;

import acm.program.*;
import acm.graphics.*;

public class PascalTriangle extends GraphicsProgram {
	public void run() {
		for (int n = 0; n <= 8; n++) {
			for (int k = 0; k <= n; k++) {
				drawOval(n, k);
			}
		}
	}
	
	private void drawOval(int n, int k) {
		double x = (getWidth() * 0.5) - (0.5 * ovalSize) - (0.5 * ovalSize * n) - (0.5 * n * spacing) + (k * (ovalSize + spacing));
		double y = ovalSize * n + spacing;
		add(new GOval(x, y, ovalSize, ovalSize));
		drawValue(n, k, x + 0.5 * ovalSize, y + 0.5 * ovalSize);
	}
	
	private void drawValue(int n, int k, double x, double y) {
		add(new GLabel( String.valueOf(combinations(n, k)), x, y) );
	}
	
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	private static int ovalSize = 50;
	private static int spacing = 10;
	

}
