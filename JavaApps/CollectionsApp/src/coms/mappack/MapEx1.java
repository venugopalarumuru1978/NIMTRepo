package coms.mappack;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String>  stdMap = new HashMap<Integer, String>();
		
		stdMap.put(1003, "Ramana Rao");
		stdMap.put(1002, "Rama Rao");
		stdMap.put(1001, "Krishna Rao");
		stdMap.put(1005, "Baskar Rao");
		stdMap.put(1004, "Ramya Rao");
		
		System.out.println(stdMap);
		
		for(Map.Entry<Integer, String>  std : stdMap.entrySet())
		{
			System.out.println(std.getKey() + " === " + std.getValue());
		}
		System.out.println("Getting Only Values from Map ");
		Collection<String> stdNames = stdMap.values();
		 for (String n : stdNames) {
		    System.out.println(n);
		}
	}
}
