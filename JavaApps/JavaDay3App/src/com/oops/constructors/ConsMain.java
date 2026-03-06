package com.oops.constructors;

public class ConsMain {

	public static void main(String[] args) {
		DemoCons dc1 = new DemoCons();
		dc1.PrintVal();
		
		System.out.println("-------------");
		
		ConsParam  cp1 = new ConsParam(100,200);
		cp1.PrintVal();
		System.out.println("-------------");
		ConsParam  cp2 = new ConsParam(300,600);
		cp2.PrintVal();
		System.out.println("-------------");

		MultiCons  mc1 = new MultiCons();
		mc1.PrintVal();
		
		MultiCons  mc2 = new MultiCons(67,89);
		mc2.PrintVal();
	}
}
