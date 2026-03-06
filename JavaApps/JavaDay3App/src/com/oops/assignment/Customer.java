package com.oops.assignment;

public class Customer {

	private String cname;
	private int  acc_bal;
	
	private static int bank_bal;
	
	public void getCinfo(String name, int bal)
	{
		cname = name;
		acc_bal = bal;
		
		bank_bal =  bank_bal+bal;
	}	
	
	public void PrintCustomer()
	{
		System.out.println("Customer Name : " + cname);
		System.out.println("Customer Balance : " + acc_bal);
	}
	
	public static void BankBalance()
	{
		System.out.println("Total Amount in Bank " + bank_bal);
	}
}
