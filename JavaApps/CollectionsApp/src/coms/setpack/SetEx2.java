package coms.setpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<String> setStr = new LinkedHashSet<String>();
		setStr.add("Mohan");
		setStr.add(null);
		setStr.add("Abhiram");
		setStr.add("Zaheer");
		setStr.add("Mohan");
		setStr.add("Kiran");
		setStr.add(null);
	
		System.out.println(setStr);
	}

}
