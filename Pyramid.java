import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/15/13
 * Time: 10:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class Pyramid {
    public static void main(String[] a){
        System.out.println("enter size of pyramid");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        for(int n=1;n<=p;n++){
            for(int i=96+n;i<=96+2*n-1;i++)
                System.out.print((char)i);
            System.out.println();

        }
        System.out.println((char)p);
    }
    }

