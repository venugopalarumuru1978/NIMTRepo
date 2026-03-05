package Day2Pack;
import java.util.Scanner;

public class CondEx1 {
//  find the big number from given two numbers using conditional operators
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

		System.out.println("Enter two values ");
		int x = sc.nextInt(); // 10
		int y = sc.nextInt(); // 50
		
		int big = (x>y)? x : y;
		
		System.out.println(x + " and " + y + " big number is " + big);
	}
}
