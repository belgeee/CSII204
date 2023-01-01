/* File:MatchQuizBase8.java
 * -------------------
 * Program is a match quiz in base 8. 
 * It asks number of question involving addition 
 * and subtraction of two numbers.
 * Prerequisites: 
 *  - sum of numbers must be less than 20
 *  - there are 5 questions
 *  - there are 3 chances for correct answer, after which 
 *    correct answer is given to the user
 *  - numbers must be choosen randomly
 */

package Chapter7;

import acm.program.*;
import acm.util.RandomGenerator;

public class MathQuizBase8 extends ConsoleProgram {
	
	
	
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
			
			Integer leftInt = new Integer(leftNum);  // construct integer initialized to user first number
			String leftStr = Integer.toString(leftInt, 8); // convert Integer to string in octal
			leftInt = Integer.parseInt(leftStr); // assign string in octal to Integer 
			Integer rightInt = new Integer(rightNum);
			String rightStr = Integer.toString(rightNum, 8);
			rightInt = Integer.parseInt(rightStr);
			
			Integer result = new Integer(0);	
			result = getResult(leftNum, rightNum, addition);
			
			Integer userAnswer = new Integer (askQuestion(leftInt, rightInt, addition));
			
	        summary(result, userAnswer);
		}
	}
	
/* calculate result */
	private Integer getResult(int a, int b, boolean add) {
		Integer value = new Integer(0);
		int res = 0;
		if (!add) {
			res = a - b;
		} else {
			res = a + b;
		}
		String valueStr = Integer.toString(res, 8);
	    value = Integer.parseInt(valueStr);
	    return value;
	}
	
/* write question on the screen and ask user for answer */
	private String askQuestion(Integer a, Integer b, boolean add) {
		if (!add) {
			return readLine("What is " + a + " - " + b + "? ");
		}
		return readLine("What is " + a + " + " + b + "? ");
	}
	
/* write if answer is correct or not, try again 3 times, after that give correct answer */
	private void summary (Integer rightAnswer, Integer userAnswer) {
		
		
		for (int i = 0; i < 2; i++) {
			if (rightAnswer.equals(userAnswer)) {
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
				userAnswer = Integer.parseInt(readLine("That's incorrect - try a different answer: "));
			}
		}
		println("Sorry, the answer is " + rightAnswer);
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
