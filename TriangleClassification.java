import java.util.Scanner;
class TriangleClassification 
{
	public static void main(String[] args) 
	{
		float a,b,c;
		System.out.print("Enter three sides of a triangle in ascending order:");
		Scanner s = new Scanner(System.in);
		
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		if(a<=0 || b<=0 || c<=0)
          System.out.print("Side of a triangle can not be negative or zero");
		else if(a>b || b>c || a>c)
		{ 
			System.out.print("Entry should be in ascending order");
		}
		else
		{
			if(a*a + b*b == c*c)
				System.out.print("Right triangle");
			else if(a*a + b*b > c*c)
				System.out.print("Acute triangle");
            else
				System.out.print("Obtuse triangle");
			if(a == b || b == c || c == a)
				System.out.print(" and Equilateral triangle");
			else if(a == b && b == c)
				System.out.print(" and Isosceles triangle");
		}
	}
}
