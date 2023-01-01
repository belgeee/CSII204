/* File: SchoolRhyme.java
 * 
 * Program calculates number of kits, cats, sacks and wives  
 * coming from St.Ives in a school rhyme:
 * 
 *  "As I was going to St. Ives,
 *	I met a man with seven wives,
 *  Each wife had seven sacks,
 *	Each sack had seven cats,
 *	Each cat had seven kits:
 *	Kits, cats, sacks, and wives,
 *	How many were there going to St. Ives?"
 *	
 */

package Chapter3;

import acm.program.*;

public class SchoolRhyme extends ConsoleProgram {
	public void run() {
		
		println("In a rhyme:");
		println("");
		println("As I was going to St. Ives,");
		println("I met a man with seven wives,");
		println("Each wife had seven sacks,");
		println("Each sack had seven cats,");
		println("Each cat had seven kits:");
		println("Kits, cats, sacks, and wives,");
		println("How many were there going to St. Ives?");
		println("");

		int numberOfWifes = 7;
		int numberOfSacks = numberOfWifes * 7;
		int numberOfCats = numberOfSacks * 7;
		int numberOfKits = numberOfCats * 7;
		
		int KitsCatsSacksWives = (numberOfWifes + numberOfSacks + numberOfCats+ numberOfKits);
		
		println("There were " + KitsCatsSacksWives + " \"Kits, cats, sacks, and wives\" coming from St.Ives.");
	}
}
