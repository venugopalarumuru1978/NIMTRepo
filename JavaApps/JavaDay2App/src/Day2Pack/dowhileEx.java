package Day2Pack;

import java.util.Scanner;

public class dowhileEx {
// billing program 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		float grTotal = 0.0f;
		
		do
		{
			System.out.println("Product Name ");
			String pname = sc.next();
			
			System.out.println("Product Price ");
			float price = sc.nextFloat();
			
			System.out.println("No of Items ");
			int noi = sc.nextInt();
			
			float total = price*noi;
			
			System.out.println(pname + " Product Total Amount " + total);
			grTotal = grTotal+total;
			
			System.out.println("1 more product(y/n)");
			ch =sc.next();
		}
		while(ch.equalsIgnoreCase("y"));
		
		System.out.println("Grand Total : " + grTotal);
	}
}
