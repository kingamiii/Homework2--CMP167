/*Amirah Igbara
 *CMP167
 *Prof. Kelly
 *Sept. 19. 23*/
package hw2;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// prompting user for 4 words;
		System.out.println("Enter 4 words:");

		// declaring words

		String word1;
		String word2;
		String word3;
		String word4;

		word1 = sc.next();
		word2 = sc.next();
		word3 = sc.next();
		word4 = sc.next();
		sc.close();
		// storing length
		int v1 = word1.length();
		int v2 = word2.length();
		int v3 = word3.length();
		int v4 = word4.length();

		System.out.println("Word 1 = \"" + word1 + "\" " + "Length = " + v1 + " position of vowels: " + "'a' = "
				+ word1.indexOf('a') + ", 'e' = " + word1.indexOf('e') + ", 'i' = " + word1.indexOf('i') + ", 'o' = "
				+ word1.indexOf('o') + ", 'u' = " + word1.indexOf('u'));
		System.out.println("Word 2 = \"" + word2 + "\" " + "Length = " + v2 + " position of vowels: " + "'a' = "
				+ word2.indexOf('a') + ", 'e' = " + word2.indexOf('e') + ", 'i' = " + word2.indexOf('i') + ", 'o' = "
				+ word2.indexOf('o') + ", 'u' = " + word2.indexOf('u'));
		System.out.println("Word 3 = \"" + word3 + "\" " + "Length = " + v3 + " position of vowels: " + "'a' = "
				+ word3.indexOf('a') + ", 'e' = " + word3.indexOf('e') + ", 'i' = " + word3.indexOf('i') + ", 'o' = "
				+ word3.indexOf('o') + ", 'u' = " + word3.indexOf('u'));
		System.out.println("Word 4 = \"" + word4 + "\" " + "Length = " + v4 + " position of vowels: " + "'a' = "
				+ word4.indexOf('a') + ", 'e' = " + word4.indexOf('e') + ", 'i' = " + word4.indexOf('i') + ", 'o' = "
				+ word4.indexOf('o') + ", 'u' = " + word4.indexOf('u'));

	}

}
