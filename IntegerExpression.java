/*amirah igbara.
 * class CMP 167
 * Professor Kelly
 * Sept. 13. 2023*/

package hw2;

import java.util.Scanner;

public class IntegerExpression {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// The program must then output results based on the following calculations:
		// declaring variables
		int firstInt;
		int secondInt;
		int thirdInt;

		int firstResult = 0;
		int secondResult = 0;
		int thirdResult = 0;

		// prompting and inputing info from user

		System.out.println("Enter firstInt:");
		firstInt = scnr.nextInt();

		System.out.println("Enter secondInt:");
		secondInt = scnr.nextInt();

		System.out.println("Enter thirdInt:");
		thirdInt = scnr.nextInt();

		// calculations
		firstResult = (firstInt + secondInt) / thirdInt;
		secondResult = (secondInt * thirdInt) / (secondInt + firstInt);
		thirdResult = (firstInt * thirdInt) % secondInt;
		scnr.close();
		// outputting result
		System.out.println("First Result = " + firstResult);
		System.out.println("Second Result = " + secondResult);
		System.out.println("Third Result = " + thirdResult);
	}
}
