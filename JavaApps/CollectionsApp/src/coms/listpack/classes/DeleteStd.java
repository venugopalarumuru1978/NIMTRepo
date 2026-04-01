package coms.listpack.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteStd {

	public static void main(String[] args) {
		List<Student>  stdList = new ArrayList<Student>();
		Student  std = new Student(101, "Jyothi", "Java", 20000.00f);
		stdList.add(std);
		
		std = new Student(102, "Karuna Jyothi", "Python", 30000.00f);
		stdList.add(std);
		
		std = new Student(103, "Baskar", "Java", 20000.00f);
		stdList.add(std);
		
		std = new Student(104, "Lahiri", "Java", 20000.00f);
		stdList.add(std);
		
		std = new Student(105, "Ramana", "Python", 30000.00f);
		stdList.add(std);
		
		System.out.println(stdList);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll Number to delete Student");
		int rno = sc.nextInt();
		
		boolean stdChk = false;
		for(Student s : stdList)
		{
			if(s.getRollno()==rno)
			{
				System.out.println(s);
				stdList.remove(s);				
				stdChk = true;
				break;
			}
		}
		
		if(stdChk == false)
			System.out.println("Student Not Found....");
		else
		{
			System.out.println("Students Info After Delete ");
			System.out.println(stdList);
		}
	}
}
