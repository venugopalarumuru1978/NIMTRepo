package coms.listpack;
import java.util.*;
public class ListEx2 {
// adding values dynamically and retriving
	public static void main(String[] args) {
		List<String>   strList =  new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Enter a String (-1) to Stop ");
			String st = sc.next();
			if(st.equals("-1"))
				break;
			strList.add(st);
		}
		while(true);
		System.out.println("Given Values : ");
		System.out.println(strList);
	}
}
