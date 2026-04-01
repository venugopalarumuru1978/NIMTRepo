package coms.listpack;
import java.util.*;
public class ListEx4 {
// Deleting
	public static void main(String[] args) {
		List<String>   strList =  new ArrayList<String>();
		
		strList.add("Murali");
		strList.add("Mohan");
		strList.add("Murya");
		strList.add("Kiran");
		strList.add("Kamal");
		strList.add("Murali");
		
		System.out.println(strList);
		
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter a String to Remove ");
		String st = sc.next();
		
		if(strList.contains(st))
		{
			System.out.println(st + " : is existed");
			strList.remove(st);
			System.out.println("Element is Removed....");
			System.out.println(strList);
		}
		else
			System.out.println(st + " : is not existed");		
	}
}
