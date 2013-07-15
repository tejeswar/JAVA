import com.sun.javafx.scene.EnteredExitedHandler;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/14/13
 * Time: 5:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort {
    public static void main(String[] a){
        int[] element;
        System.out.println("Enter the number elements u want to sort");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        System.out.println("Enter numbers ");
        element=new int[size];
        for(int i=0;i<size;i++){
             element[i]=scanner.nextInt();
        }
        bubble_sort(element,size);
         for(int p:element)
             System.out.println(p);
        System.out.println("HelloWorld");

    }
    public static void bubble_sort(int[] element,int size){
        int temp=0;
              for(int i=0;i<size-1;i++){
                  for (int j=0;j<size-i-1;j++){
                      if (element[j]>element[j+1]){
                         temp=element[j];
                          element[j]=element[j+1];
                          element[j+1]=temp;
                      }
                  }
              }
       // for(int p:element)
         //   System.out.println(p);
    }
}
