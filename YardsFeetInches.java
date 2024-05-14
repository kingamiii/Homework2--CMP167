/*amirah igbara.
 * class CMP 167
 * Professor Kelly
 * Sept. 13. 2023*/
package hw2;

import java.util.Scanner;

public class YardsFeetInches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaring variables
		int numYards, numFeet, numInches, resultInches;

		// prompting user and getting info for scanner.
		System.out.println("Enter number of inches:");
		resultInches = sc.nextInt();
		sc.close();
		// calculations
		numYards = resultInches / 36;
		int resultYards = resultInches % 36;

		numFeet = resultYards / 12;
		numInches = resultYards % 12;

		// output data
		System.out.println(numYards + " yards, " + numFeet + " feet, " + "and " + numInches + " inches.");
	}

}
