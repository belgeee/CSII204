/* File:MatchQuiz.java
 * -------------------
 * Program is a match quiz for childeren. 
 * It asks number of question involving addition 
 * and subtraction of two numbers.
 * Prerequisites: 
 *  - sum of numbers must be less than 20
 *  - there are 5 questions
 *  - there are 3 chances for correct answer, after which 
 *    correct answer is given to the user
 *  - numbers must be choosen randomly
 */

package Chapter6;

import acm.program.*;
import acm.util.RandomGenerator;

public class MatchQuiz extends ConsoleProgram {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			/* select addition (if false it is subtraction) */
			boolean addition = rgen.nextBoolean();
			
			/* pick both numbers */
			int leftNum = rgen.nextInt(21);
			int rightNum;
			if (!addition) {
				rightNum = rgen.nextInt(leftNum);
			} else {
				rightNum = rgen.nextInt(1, 20 - leftNum);
			}	
			int result = getResult(leftNum, rightNum, addition);	
			int userAnswer = askQuestion(leftNum, rightNum, addition);
	        summary(result, userAnswer);
		}
	}
	
/* calculate result */
	private int getResult(int a, int b, boolean add) {
		if (!add) return a - b;
			return a + b;
	}
	
/* write question on the screen and ask user for answer */
	private int askQuestion(int a, int b, boolean add) {
		if (!add) {
			return readInt("What is " + a + " - " + b + "? ");
		}
		return readInt("What is " + a + " + " + b + "? ");
	}
	
/* write if answer is correct or not, try again 3 times, after that give correct answer */
	private void summary (int rightAnswer, int userAnswer) {
		for (int i = 0; i < 2; i++) {
			if (rightAnswer == userAnswer) {
				int a = rgen.nextInt(5);
				switch (a) {
				case 0: println("That is correct!"); return;
				case 1: println("Very Good!"); return;
				case 2: println("Nice!"); return;
				case 3: println("Good job!"); return;
				case 4: println("Awesome!"); return;
				default: break;
				}
			
			} else {
				userAnswer = readInt("That's incorrect - try a different answer: ");
			}
		}
		println("Sorry, the answer is " + rightAnswer);
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
