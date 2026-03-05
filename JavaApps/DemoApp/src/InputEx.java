import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter a value ");
		int x = sc.nextInt();
		
		System.out.println("Given Value is : " + x);
		System.out.println(x + " Square Value is " + (x*x));
	}
}
