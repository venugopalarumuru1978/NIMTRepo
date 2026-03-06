package com.oops;

public class DemoClass {

	private int x, y;
	
	public void getData()
	{
		x = 100;
		y = 200;
	}
	
	public void putData()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		int sum = x+y;
		System.out.println("Sum Val : " + sum);
	}
}
