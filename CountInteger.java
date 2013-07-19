class CountInteger 
{
	public static void main(String[] args) 
	{
		int[] number={34,5,-1,7};
		int n=number.length;
		int i=0, countOne = 0, countTwo = 0;
		while(i<n)
		{
          
			int x=number[i];
		  i++ ;
		  if(x < 0)
			  break;
          countOne ++ ;
		} 
		while(i<n)
		{
       
          int x=number[i];
		  i++ ;
		  if(x == 0)
			  break;
          countTwo ++ ;
		} 
		System.out.println("The number of integer before negative number is : " + countOne);
		System.out.println("The number of integer after negative number and before zero is : " + countTwo);
	}
}
