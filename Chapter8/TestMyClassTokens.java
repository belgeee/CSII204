package Chapter8;

import acm.program.*;
import java.util.StringTokenizer;

	public class TestMyClassTokens extends ConsoleProgram {
	public void run() {
	
		while (true) {
			String str = readLine("Enter line: ");
			StringTokenizer token = new StringTokenizer(str);
			while ( token.hasMoreTokens() ) {
				println( token.nextToken() );
			}
		}
	}
}