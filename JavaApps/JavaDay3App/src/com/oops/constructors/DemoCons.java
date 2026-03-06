package com.oops.constructors;

public class DemoCons {

	private int x, y;
	public DemoCons()
	{
		System.out.println("It is a Constructor");
		x = 10;
		y = 20;
	}
	
	public void PrintVal()
	{
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
	}
}
