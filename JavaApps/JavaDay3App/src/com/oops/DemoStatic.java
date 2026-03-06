package com.oops;

public class DemoStatic {

	private static int x, y;
	
	public static void getData()
	{
		x = 10;
		y = 20;
	}
	
	public static void putData()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		int sum = x+y;
		System.out.println("Sum Val : " + sum);
	}
}
