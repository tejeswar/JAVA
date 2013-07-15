/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/15/13
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;

class Factorial
{
    public class Prime {

    }

    public static void main(String[] arg)throws Exception
    {

        int number=0;

        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int answer=factorial(number);

        System.out.println("Factorial of "+number+" is: "+answer);
        }

    public static int factorial(int no){
        int fact=1;
        if(no==0)
        {
            fact=1;
        }
        else if(no==1)
        {
            fact=1;

        }

        else
        {
            for(int i=2;i<=no;i++)

                fact=fact*i;


        }
        return fact;



}
}





