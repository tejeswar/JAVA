package com.home.room;
import java.util.Scanner;
import java.io.*;
class PyramidOne extends Object implements Abc,Xyz {

	public static void main(String args[] ){
	
		Scanner s = new Scanner(System.in );		
		System.out.print("Enter a number :");
		int a,b,c = 0 ;
		int n = s.nextInt();
        for(int i = 1 ; i <= n ; i ++ )
		{
			for(int j = 1 ;j <= 2 * i - 1 ;j ++)
		      System.out.print(i);
			System.out.println();
		}
	}

}
