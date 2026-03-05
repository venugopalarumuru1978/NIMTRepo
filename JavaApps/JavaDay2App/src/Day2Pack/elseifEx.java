package Day2Pack;

import java.util.Scanner;

public class elseifEx {
	// find the big number from 3 numbers
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

		System.out.println("Enter three values ");
		int x = sc.nextInt(); 
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y && x>z)
			System.out.println(x + ", " + y + " and " + z + " big number is " + x);
		else if(y>x & y>z)
			System.out.println(x + ", " + y + " and " + z + " big number is " + y);
		else if(z>x && z>y)
			System.out.println(x + ", " + y + " and " + z + " big number is " + z);
		else
			System.out.println("All / Any two values might be same");
	}
}
