package com.oops;

public class DemoMain {

	public static void main(String[] args) {
		DemoClass  dc1 = new DemoClass();
		dc1.getData();
		dc1.putData();
		
		System.out.println("-------------");
		
		DemoClass dc2 = new DemoClass();
		dc2.getData();
		dc2.putData();
		
		System.out.println("-------------");
		
		DemoStatic.getData();
		DemoStatic.putData();
		
	}
}
