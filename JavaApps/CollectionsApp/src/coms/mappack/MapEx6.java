package coms.mappack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx6 {
	// TreeMap
	public static void main(String[] args) {
		Map<Integer, String>  stdMap = new TreeMap<Integer, String>();
		
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
		
	}

}
