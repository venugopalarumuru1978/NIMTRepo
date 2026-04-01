package coms.setpack;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> setStr = new HashSet<String>();
		setStr.add("Mohan");
		setStr.add("Abhiram");
		setStr.add("Zaheer");
		setStr.add("Mohan");
		setStr.add("Kiran");
		setStr.add(null);
	
		System.out.println(setStr);
	}

}
