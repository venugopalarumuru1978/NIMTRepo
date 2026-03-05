package Day2Pack.ArraysPack;

import java.util.Scanner;

public class Arr2 {
// Single
	public static void main(String[] args) {
		int x[] = new int[5];
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter 5 values ");
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		
		System.out.println("Array Values ");
		
		int sum =0;
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "\t");
			sum = sum+x[i];
		}
		
		System.out.println("\nSum of Array Values : " + sum);
	}
}
