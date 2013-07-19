class MathematicalSeries 
{
	public static void main(String[] args) 
	{
		float sum = 0;
		for(int i=1; i <= 15; i++)
			sum += 1/(2*i - 1);
		System.out.println("The evaluate value of the series is :"+sum);
	}
}
