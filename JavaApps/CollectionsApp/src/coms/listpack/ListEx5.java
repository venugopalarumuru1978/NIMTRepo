package coms.listpack;
import java.util.*;
public class ListEx5 {
// adding and retriving of LinkedList
	public static void main(String[] args) {
		List<String>   strList =  new LinkedList<String>();
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
