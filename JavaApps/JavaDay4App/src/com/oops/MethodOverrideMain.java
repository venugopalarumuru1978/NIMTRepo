package com.oops;
// method overriding
class ParentCal
{
	public void Calculate(int x)
	{
		System.out.println(x + " Square Value is " + (x*x));
	}
}

class ChildCal extends ParentCal
{
	public void Calculate(int x)
	{
		System.out.println(x + " Cube Value is " + (x*x*x));
	}	
}

public class MethodOverrideMain {

	public static void main(String[] args) {
		ParentCal  pcObj = new ParentCal();
		pcObj.Calculate(10);// parent class method calls
		
		pcObj = new ChildCal(); // OverRiding Process
		pcObj.Calculate(10); // child class method calls
	}
}
