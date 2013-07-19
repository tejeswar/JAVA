import java.util.Scanner;
class CalculatePower 
{
	public static void main(String[] args) 
	{
		 System.out.print("Enter 2 numbers : ");
         Scanner s = new Scanner(System.in);
		 int x = s.nextInt();
		 int y = s.nextInt();
         int result=1;
		 for(int i=1; i <= y; i++)
			 result *= x;
		System.out.println("The power value is :" + result);
	}
}
