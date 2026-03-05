package Day2Pack;

import java.util.Scanner;

public class ConstEx {
	// calculate area of circle
	public static void main(String[] args) {
		// final is the keyword to create constant variables
		final float pi = 3.14f;  // constant variable
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of the circle");
		float radius = sc.nextFloat();
		
		System.out.println("Area of Circle is : " + (pi*radius*radius));		
	}
}
