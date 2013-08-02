/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/29/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
public class RabitTortel
{
    private static int []series = null;
    private static int [][]counter = null;
    private int n;
    public static void main(String[] args)
    {
        RabitTortel rt = new RabitTortel();
        rt.controlProgram();
    }
    public void controlProgram()
    {
        setSeries();
        setCounter();
        bubbleSort();
		sortCounter();
        show();
    }
    public void setSeries()
    {
        System.out.print("Enter the size of list :");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        series = new int[n];
        System.out.print("\nEnter "+n +" no of values: ");
        for(int i = 0 ; i < n ; i ++)
        {
            int x = s.nextInt();
            series[i] = x;
        }
    }
    public void setCounter()
    {
        counter = new int[n][3];
        for(int i = 0; i < n ; i ++)
            for(int j = 0; j < 3 ; j ++)
            {
                if(j == 1)//counter
                    counter[i][j] = 0;
                else if(j == 0)
                    counter[i][j] = i;
                else
                    counter[i][j] = series[i];
            }
    }
    public void displayCounter()
    {
        for(int i = 0; i < n ; i ++)
        {
            System.out.println();
            for(int j = 0; j < 3 ; j ++)
            {
                System.out.print(counter[i][j]+"  ");
            }
        }
    }
    public void bubbleSort()
    {
        int temp = 0,i=0,j=0;
        for(i = 0; i < n-1 ; i ++)
            for(j = 0; j < n-i-1 ; j ++)
            {
                if(series[j] > series[j+1])
                {
                    temp = series[j];
                    series[j] = series[j+1];
                    series[j+1] = temp;

                    temp = counter[j][1] ;
                    counter[j][1] = counter[j+1][1] + 1;
                    counter[j+1][1] = temp + 1;

                    temp = counter[j][2];
                    counter[j][2] = counter[j+1][2];
                    counter[j+1][2] = temp ;
                }
            }
    }
    public void sortCounter()
    {
        int temp = 0,i=0,j=0;
        for(i = 0; i < n-1 ; i ++)
            for(j = 0; j < n-i-1 ; j ++)
            {
                if(counter[j][1]>counter[j+1][1])
                {
                    temp = counter[j][0];
                    counter[j][0] = counter[j+1][0];
                    counter[j+1][0] = temp ;

                    temp = counter[j][1];
                    counter[j][1] = counter[j+1][1];
                    counter[j+1][1] = temp ;

                    temp = counter[j][2];
                    counter[j][2] = counter[j+1][2];
                    counter[j+1][2] = temp ;
                }
            }
    }
    public void show(){
        System.out.println("first rabbit is :"+counter[n-1][2]+" having "+counter[n-1][1]+" no of interchange");
         System.out.println("second rabbit is :"+counter[n-2][2]+" having "+counter[n-2][1]+" no of interchange");
        System.out.println("first turtle is :"+counter[0][2]+" having "+counter[0][1]+" no of interchange");
        System.out.println("second turtle is :"+counter[1][2]+" having "+counter[1][1]+" no of interchange");
    }
}

