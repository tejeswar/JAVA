import java.util.Scanner;
class PyramidFive
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=s.nextInt();
        for(int i=1; i<=n; i++)
		{
			for(int k=n-i; k>=0; k--)
				System.out.print(" ");
			for(int j=i; j>=1; j--)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}
