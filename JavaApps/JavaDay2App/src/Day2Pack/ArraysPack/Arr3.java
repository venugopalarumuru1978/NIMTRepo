package Day2Pack.ArraysPack;

public class Arr3 {
// Double
	public static void main(String[] args) {
	
		int x[][] = {{10,20,30},{40,50,60}};

		System.out.println(x[0][0] + "\t" + x[0][1] + "\t" + x[0][2]);
		System.out.println(x[1][0] + "\t" + x[1][1] + "\t" + x[1][2]);
		
		System.out.println("----------------");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j] + "\t");
			}
			System.out.println(); // line break
		}
	}
}
