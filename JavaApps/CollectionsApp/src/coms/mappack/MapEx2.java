package coms.mappack;

import java.util.HashMap;
import java.util.Map;
// searching process
import java.util.Scanner;

public class MapEx2 {

	public static void main(String[] args) {
		Map<Integer, String>  stdMap = new HashMap<Integer, String>();
		
		stdMap.put(1003, "Ramana Rao");
		stdMap.put(1002, "Rama Rao");
		stdMap.put(1001, "Krishna Rao");
		stdMap.put(1005, "Baskar Rao");
		stdMap.put(1004, "Ramya Rao");
		
		System.out.println(stdMap);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		int rno = sc.nextInt();
		
		if(stdMap.containsKey(rno))
			System.out.println("Existed : its value is " + stdMap.get(rno));
		else
			System.out.println("Not found");		
	}
}
