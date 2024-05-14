/*amirah igbara.
 * class CMP 167
 * Professor Kelly
 * Sept. 14. 2023*/
package hw2;

import java.util.Scanner;

public class DistanceFormula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaring doubles
		double x1, y1, x2, y2, dist;

		// Prompting the user and getting the coordinates of two points
		System.out.println("Coordinates for P1");
		System.out.println("Enter X1:");
		x1 = sc.nextDouble();
		System.out.println("Enter Y1:");
		y1 = sc.nextDouble();

		System.out.println("Coordinates for P2");
		System.out.println("Enter X2:");
		x2 = sc.nextDouble();
		System.out.println("Enter Y2:");
		y2 = sc.nextDouble();
		sc.close();
		// Calculations
		dist = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2));

		// Output the distance
		System.out.println("Distance between P1 and P2 = " + dist);
	}

}
