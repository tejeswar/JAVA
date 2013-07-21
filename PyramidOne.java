import java.util.Scanner;
class PyramidOne
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=s.nextInt();
        for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=2*i-1; j++)
		      System.out.print(i);
			System.out.println();
		}
	}
}
