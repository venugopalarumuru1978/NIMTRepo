package coms.mappack;

import java.util.HashMap;
import java.util.Map;
// searching process
import java.util.Scanner;

public class MapEx4 {
// Delete Value based on Key
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
		{
			System.out.println("Present Value is " + stdMap.get(rno));
			stdMap.remove(rno);			
			System.out.println("After Delete :\n" + stdMap);
		}
		else
			System.out.println("Not found");		
	}
}
