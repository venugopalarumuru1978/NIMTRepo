package com.oops;

public class TestClass {

	int a, b;
	
	void getValues()
	{
		a = 12;
		b = 23;
	}
	
	void putValues()
	{
		System.out.println("Value - 1 " + a);
		System.out.println("Value - 2 " + b);
	}
	
	public static void main(String[] args) {
		TestClass tc1 = new TestClass();
		tc1.getValues();
		tc1.putValues();
	}

}
