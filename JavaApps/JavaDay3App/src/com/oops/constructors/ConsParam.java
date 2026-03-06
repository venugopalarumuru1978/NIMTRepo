package com.oops.constructors;

public class ConsParam {

	private int x, y;
	public ConsParam(int x, int y)
	{
		System.out.println("It is a Constructor with parameters");
		this.x = x;
		this.y = y;
	}
	
	public void PrintVal()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
	}
}
