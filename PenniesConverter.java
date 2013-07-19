import java.util.Scanner;
class PenniesConverter 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	    String []number={"no","one","two","three","four"};
		System.out.print("Enter a positive number which is less than 100:");
		int change=s.nextInt();
		if(change < 0 || change > 99)
			System.out.println("Invalid number");
		else
		{
		 int beforeChange=change;
         int quarters,dimes,nickels,pennies;
		 quarters=change/25;
		 change=change%25;

		 dimes=change/10;
		 change=change%10;

		 nickels=change/5;
		 change=change%5;

         pennies=change;
		 System.out.println();
		System.out.print(beforeChange+" is "+number[quarters]+" quarters ");
        System.out.print(number[dimes]+" dimes "+number[nickels]);
		System.out.print(" nickels "+number[pennies]+" pennies");
		}
	
	}
}
