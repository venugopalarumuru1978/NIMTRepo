package Day2Pack.ArraysPack;

public class Arr5 {
// jagged
	public static void main(String[] args) {
	
		int x[][] = {{10,20,30},{40,50},{60, 70,80, 90}};
		
		System.out.println("No of Rows " + x.length);
		System.out.println("1st Row No of Values " + x[0].length);
		System.out.println("2nd Row No of Values " + x[1].length);
		System.out.println("3rd Row No of Values " + x[2].length);
		
		System.out.println("----------------");
		
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
