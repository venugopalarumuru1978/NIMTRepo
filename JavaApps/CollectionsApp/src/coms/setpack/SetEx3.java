package coms.setpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
		Set<String> setStr = new TreeSet<String>();
		setStr.add("Mohan");
		setStr.add("Abhiram");
		setStr.add("Zaheer");
		setStr.add("Mohan");
		setStr.add("Kiran");
	
		System.out.println(setStr);
	}

}
