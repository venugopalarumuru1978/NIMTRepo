package com.oops;

class ConsParent
{
	protected int x;
	
	public ConsParent(int x)
	{
		this.x = x;
		System.out.println("Parent class constructor");
	}
}

class ConsChild extends ConsParent
{
	private float y;
	
	public ConsChild(int x, float y) {
		super(x);  // this calls parent constructor
		this.y = y;
		System.out.println("Child Class Constructor");
	}
	
	public void Print()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
	}
}

public class ConsInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsChild cc = new ConsChild(100,345.67f);
		cc.Print();
	}

}
