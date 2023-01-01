package Graphics;

import acm.graphics.*;

public class QuiltBlock extends GCompound {
	
	public QuiltBlock() {
		GRect block = new GRect(blockSize, blockSize);
		add(block, 0, 0);
	}
		
	public static int getBlockSize() {
		return blockSize;
	}
	
	private static int blockSize = 100;
}
