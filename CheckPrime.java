import java.util.Scanner;
class CheckPrime 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=s.nextInt();
		int i;
		for(i=2;i<=n/2;i++)
			if(n%i==0)
			break;
		if(i==n/2+1)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
	}
}
