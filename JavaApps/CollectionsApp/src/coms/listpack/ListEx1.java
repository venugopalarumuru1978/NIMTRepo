package coms.listpack;
import java.util.*;
public class ListEx1 {
// adding and retriving
	public static void main(String[] args) {
		List<String>   strList =  new ArrayList<String>();
		strList.add("Murali");
		strList.add("Mohan");
		strList.add("Murya");
		strList.add("Kiran");
		strList.add("Kamal");
		strList.add("Murali");
		
		System.out.println(strList);
		
		for(String str : strList)  // foreach loop
		{
			System.out.println(str);
		}		
	}
}
