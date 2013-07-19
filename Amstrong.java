class Amstrong 
{
	public static void main(String[] args) 
	{
		System.out.println("The Amstrong numbers between 0 and 999 are ");
		for(int i=1; i<1000; i++)
		{
			int n=i,sum=0,rem;
			while(n>0)
			{

				rem= n%10;
				sum += rem * rem * rem;
				n = n/10 ;
			}
			if(sum == i)
				System.out.print(i+"  ");
		}
	}
}
