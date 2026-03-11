package com.oops;
// method overloading
class Shapes
{
	public static void Area(float r)
	{
		System.out.println("Area of circle is : " +(3.14f*r*r));
	}
	
	public static void Area(int l, int b)
	{
		System.out.println("Area of Rectangle is : " + (l*b));
	}
	
	public static void Area(float b, float h)
	{
		System.out.println("Area of Triangle is : " + (0.5f*b*h));
	}
}

public class Poly1Main {

	public static void main(String[] args) {
		Shapes.Area(1.5f);
		Shapes.Area(5,6);
		Shapes.Area(1.5f, 2.5f);
	}
}
