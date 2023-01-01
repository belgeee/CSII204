package Graphics;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class PatchworkQuilt extends GraphicsProgram {
	
	public void run() {
		int x = 0; int y = 0;
		for (int i = 0; i < 2; i++) {
			add(getLCB(), x, y);
			add(getNSB(), x + spacer, y);
			add(getILJB(), x + 2 * spacer, y);
			x += 3 * spacer;
		}
	
	}
	
	private LogCabinBlock getLCB() {
		LogCabinBlock block = new LogCabinBlock();
		return block;
	}
	
	private NestedSquareBlock getNSB() {
		NestedSquareBlock block = new NestedSquareBlock();
		return block;
	}
	
	private ILoveJavaBlock getILJB() {
		ILoveJavaBlock block = new ILoveJavaBlock();
		return block;
	}
	
	private int spacer =  QuiltBlock.getBlockSize();
}
