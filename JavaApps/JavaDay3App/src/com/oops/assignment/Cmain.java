package com.oops.assignment;

public class Cmain {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.getCinfo("Kavi", 10000);
		Customer c2 = new Customer();
		c2.getCinfo("Ravi", 300000);
		Customer c3 = new Customer();
		c3.getCinfo("Ravindra", 200000);

		c1.PrintCustomer();
		System.out.println("-------------");
		c2.PrintCustomer();
		System.out.println("-------------");
		c3.PrintCustomer();
		System.out.println("-------------");
		Customer.BankBalance();
	}
}
