import java.util.Scanner;
class PyramidFour
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
				if(j == i || i == n)
				System.out.print(n);
			else
				System.out.print("0");
			
			for(int j=1; j<i; j++)
		      if(j+1 == i || i == n)
				System.out.print(n);
			else
				System.out.print("0");
			System.out.println();
		}
	}
}
