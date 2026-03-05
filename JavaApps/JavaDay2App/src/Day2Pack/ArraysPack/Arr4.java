package Day2Pack.ArraysPack;

import java.util.Scanner;

public class Arr4 {
	// Double
	public static void main(String[] args) {
		int x[][] = new int[3][3];
		Scanner  sc = new Scanner(System.in);

		System.out.println("Enter 9 values ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array Values ");
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j] + "\t");
				if(i==j)
					sum = sum+x[i][j];
			}
			System.out.println(); // line break
		}

		System.out.println("Sum of Diagonal Elements : " + sum);
	}
}
