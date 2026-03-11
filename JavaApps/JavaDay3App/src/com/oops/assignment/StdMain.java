package com.oops.assignment;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = null;
		
		System.out.println("Student ID");
		int sid = sc.nextInt();
		System.out.println("Student name ");
		String sname = sc.next();
		System.out.println("Student Address");
		String adrs = sc.next();
		
		System.out.println("Are u from NMIT College(yes/no)");
		String ch = sc.next();
		
		if(ch.equalsIgnoreCase("yes"))
		{
			std = new Student(sid, sname, adrs);
		}
		if(ch.equalsIgnoreCase("no"))
		{
			System.out.println("College Name ");
			String cname = sc.next();	
			std = new Student(sid, sname, adrs, cname);			
		}
		System.out.println("Student ID : " + std.getStudentId());
		System.out.println("Student Name : " + std.getStudentName());
		System.out.println("Student Address : " + std.getStudentAddress());
		System.out.println("College Name : " + std.getCollegeName());			
	}
}
