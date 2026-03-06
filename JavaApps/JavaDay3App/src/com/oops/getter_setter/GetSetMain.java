package com.oops.getter_setter;
import java.util.Scanner;

public class GetSetMain {

	public static void main(String[] args) {
		DemoGetSet  dgs = new DemoGetSet();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer ");
		dgs.setX(sc.nextInt());
		
		System.out.println("Enter a float value");
		dgs.setY(sc.nextFloat());
		
		System.out.println("X value is : " + dgs.getX());
		System.out.println("Y value is : " + dgs.getY());
		System.out.println("Sum Value : " + (dgs.getX()+dgs.getY()));
	}
}
