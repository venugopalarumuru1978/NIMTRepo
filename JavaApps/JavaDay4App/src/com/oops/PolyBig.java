package com.oops;

class BigNumber
{
	public void Big(int x, int y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number is " + x);
		else
			System.out.println(x + " and " + y + " Big Number is " + y);
	}
	
	public void Big(float x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number is " + x);
		else
			System.out.println(x + " and " + y + " Big Number is " + y);
	}

	public void Big(int x, float y)
	{
		if(x>y)
			System.out.println(x + " and " + y + " Big Number is " + x);
		else
			System.out.println(x + " and " + y + " Big Number is " + y);
	}
}

public class PolyBig {

	public static void main(String[] args) {
			BigNumber bg = new BigNumber();
			bg.Big(12,4);
			bg.Big(12.45f,40.46f);
			bg.Big(12,4.4f);
	}
}
