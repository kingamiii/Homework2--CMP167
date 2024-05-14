package hw2;

import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		// declaring scanner
		Scanner sc = new Scanner(System.in);
		// declaring variables
		int userNum;
		int divNum;

		// reading integer inputs
		userNum = sc.nextInt();
		divNum = sc.nextInt();
		sc.close();

		// calculations (userNum divided by divNum three times
		int numResult = userNum / divNum;
		int remainingNum = numResult / divNum;
		int lastNum = remainingNum / divNum;

		// outputting userNum divided by divNum 3 times.
		System.out.println(numResult + " " + remainingNum + " " + lastNum);

	}

}
