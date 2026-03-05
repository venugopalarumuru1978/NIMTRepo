package Day2Pack;

import java.util.Scanner;

public class NestedIfEx {
/*
 * Accept age and gender(m/f) of the person then 
 * gender is male and age is above or equals 21, then show msg "Person Eligible for marriage"
 * gender is female and age is above or equals 18, then show msg "Person Eligible for marriage" 
 */	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Gender(M/F)");
		String gender = sc.next();
		System.out.println("Enter Person Age ");
		int age = sc.nextInt();
		
		if(gender.equalsIgnoreCase("M"))
		{
			if(age>=21)
				System.out.println("Male Person is Eligible for Marriage");
			else
				System.out.println("Male Person is Not Eligible for Marriage");
		}
		else if(gender.equalsIgnoreCase("F"))
		{
			if(age>=18)
				System.out.println("Female Person is Eligible for Marriage");
			else
				System.out.println("Female Person is Not Eligible for Marriage");			
		}
		else 
			System.out.println("Invalid Gender");
	}
}
