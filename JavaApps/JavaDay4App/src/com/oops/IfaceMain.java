package com.oops;

interface  iface1
{
	void get(int x);
}

interface iface2
{
	void put();
}

class testIface implements iface1, iface2
{
	private int x;
	@Override
	public void put() {
		// TODO Auto-generated method stub
		System.out.println(x + " Square Value " + (x*x));
	}

	@Override
	public void get(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}
}

public class IfaceMain {

	public static void main(String[] args) {
	
		testIface  tf = new testIface();
		tf.get(10);
		tf.put();
	}
}
