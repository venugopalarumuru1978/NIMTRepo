package Day2Pack.ArraysPack;

import java.util.Scanner;

public class Arr6 {
// Jagged
	public static void main(String[] args) {
	
		int x[][] = new int[3][];
		x[0] = new int[3];
		x[1] = new int[5];
		x[2] = new int[2];

		Scanner sc = new Scanner(System.in);		
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Enter " + x[i].length + " Values for " + (i+1) + " row");
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array Values ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println(); // line break
		}
	}
}
