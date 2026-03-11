package com.oops;

abstract class Student
{
	protected String sname, course;
	
	public void getStd(String sname, String course)
	{
		this.sname = sname;
		this.course = course;
	}
}

class Marks extends Student
{
	protected int sub1, sub2;
	
	public void getMarks(int s1, int s2)
	{
		this.sub1 = s1;
		this.sub2 = s2;
	}
}

final class Results extends Marks
{
	public void getResult()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Student Course : " + course);
		System.out.println("Sub 1 Marks : " + sub1);
		System.out.println("Sub 2 Marks : " + sub2);
		System.out.println("Total Marks : " + (sub1+sub2));
	}
}


public class MultiLevelMain {

	public static void main(String[] args) {
		Results  res = new Results();
		res.getStd("Murali", "Java");
		res.getMarks(45, 60);
		res.getResult();
	}
}
