/* File: ThisOldManSong.java
 * 
 *  Prints lyrics of a song by the same title
 */

package Chapter4;

import acm.program.*;

public class ThisOldManSong extends ConsoleProgram {
	public void run() {
		for (int i = 0; i < 10; i++) {
			println("This old man, he played 1.");
			print("He played knick-knack on my ");
			switch(i) {
				case 0: println("thumb."); break;
				case 1: println("shoe."); break;
				case 2: println("knee."); break;
				case 3: println("door."); break;
				case 4: println("hive."); break;
				case 5: println("sticks."); break;
				case 6: println("heaven."); break;
				case 7: println("pate."); break;
				case 8: println("spine."); break;
				case 9: println("shin."); break;
				default: println(i); break;
			}
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
			println("");
		}
	}

}
