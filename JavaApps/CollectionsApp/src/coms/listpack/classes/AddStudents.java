package coms.listpack.classes;

import java.util.ArrayList;
import java.util.List;

public class AddStudents {

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
		System.out.println("------------------");
		for(Student s : stdList)
			System.out.print(s);
		System.out.println("\n------------------");
		for(Student s : stdList)
		{
			System.out.println("Roll No : " + s.getRollno());
			System.out.println("Student Name : " + s.getSname());
			System.out.println("Course : " + s.getCourse());
			System.out.println("Fees : " + s.getFees());
			System.out.println("-------------------------");
		}		
	}
}
