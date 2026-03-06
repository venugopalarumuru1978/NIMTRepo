package com.oops.constructors;

public class MultiCons {

	private int x, y;
	
	public MultiCons()
	{
		System.out.println("It is a Constructor without parameters");
		this.x = 123;
		this.y = 345;
	}
	
	public MultiCons(int x, int y)
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
