import java.util.Scanner;
class Nonfabo {
    public static void main(String arg[])
    {

        int a,b,sum=0,next_sum=0,i;

        a=0;
        b=1;

              while(sum<=100)
        {
            sum=a+b;
            a=b;
            b=sum;
            next_sum=a+b;

            for(i=sum+1;i<next_sum;i++)
            {
                if(i<=100)
                    System.out.println(i);

            }
        }
    }
}