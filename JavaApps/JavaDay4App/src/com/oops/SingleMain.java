package com.oops;
// Single inheritance
class DemoBase
{
	protected int x, y;
	
	public void getData(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class DemoDerived extends DemoBase
{
	private int sum;
	
	public void putData()
	{
		sum = x+y;
		System.out.println("X val : " + x);
		System.out.println("Y val : " + y);
		System.out.println("SUM val : " + sum);
	}
}

public class SingleMain {

	public static void main(String[] args) {
		DemoDerived  d = new DemoDerived();
		d.getData(10, 20);
		d.putData();
	}
}
