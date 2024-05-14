package hw2;

import java.util.Scanner;

public class CircleSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// declare double variable
		double circleCircumference, circleArea, sphereArea, sphereVolume, radius;

		// prompting user
		System.out.println("Enter radius:");
		radius = sc.nextDouble();

		// calc
		circleCircumference = 2 * Math.PI * radius;
		circleArea = Math.PI * Math.pow(radius, 2);
		sphereArea = 4 * Math.PI * Math.pow(radius, 2);
		sphereVolume = (4 / 3) * Math.PI * Math.pow(radius, 3);

		// outputting result
		System.out.println("Circle circumference = " + circleCircumference);
		System.out.println("Circle Area = " + circleArea);
		System.out.println("Sphere Area = " + sphereArea);
		System.out.println("Sphere Volume = " + sphereVolume);
		sc.close();
	}

}
