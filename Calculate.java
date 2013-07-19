import java.util.Scanner;
class Calculate 
{
	public static void main(String[] args) 
	{
        
	public void findEpowX()
	{
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of x for e^x :");
		int x = s.nextInt();
		System.out.println("Enter number of terms you need :");
		int term = s.nextInt();
		int value=1;
        for(int i=1; i <= term; i++)
		{
			int mul=1;
			for(int j=1; j<=i; j++)
               mul *= x;
			value += mul/factorial(i);
		}

		System.out.println("Value of e^x is :"+value);
	}
	public int factorial(int n)
	{
		int fact=1;
		for(int i=1; i<= n; i++)
	        fact *= i;
		return fact;
	}
	
}
