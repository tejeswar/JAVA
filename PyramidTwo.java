//import java.util.Scanner;
class PyramidTwo
{
	
public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter a number :");
		int n=s.nextInt();
        for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
		      System.out.print(j);
			System.out.println();
		}
		/*for(int i=n-1; i>=1; i--)*/
		{
			for(int j=1; j<=i; j++)
		      System.out.print(j);
			System.out.println();
		}
	}
}