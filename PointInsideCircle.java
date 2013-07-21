import java.util.Scanner;
class PointInsideCircle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radious of the circle :");
		int radius = s.nextInt();
		System.out.println("The points inside circle having radius "+radius+" are");
        for(int i=1; i <= radius; i++)
		{
			for(int j=1; j <= radius; j++)
				if(i*i + j*j < radius*radius)
				 System.out.print(" ("+i+","+j+")");
                         System.out.println();
		}
	}
}
