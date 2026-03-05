package Day2Pack;

import java.util.Scanner;

public class WhileAndSwitch 
{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Even / Odd Number\n2. +Ve / -Ve Number\n3. Exit ");
			System.out.println("Pick ur Choice ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter any value ");
				int n = sc.nextInt();
				
				if(n%2==0)
					System.out.println("Even");
				else
					System.out.println("Odd");
				break;
			case 2:
				System.out.println("Enter any value ");
				int x = sc.nextInt();
				if(x>0)
					System.out.println("+Ve value");
				else
					System.out.println("-Ve value");
				break;
			case 3:
				System.out.println("Thanks for using App");
				System.exit(0);
			default:
				System.out.println("Invalid Selection ");
				break;
			}
		}
	}
}
