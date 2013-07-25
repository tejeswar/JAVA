import java.io.*;
import java.util.Scanner;
class JavaStatementCounter
{
    public static void main(String[] args)throws IOException
    {
        System.out.print((int)' ');
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the java file name with extention :");
        String fileName = s.next();
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        int stmtcount = 0;
        boolean flag = true;
        int c = br.read();
        while(c >0)
        {
            flag=true;

            if(c == 47)
            {
                c = br.read();
                if(c == 47)
                {
                    br.readLine();
                }
                else if(c == 42)
                {
                    while(true)
                    {
                        while(c != 42)
                        {
                            c = br.read();
                            if(c<0)
                                break;
                        }
                        if(br.read() == 47)
                            break;
                        c = br.read();
                        if(c<0)
                            break;
                    }

                }
            }
            if(c == 10)
            {
                stmtcount ++ ;
                while(true)
                {
                    if(c != 32 && c != 10  && c != 9)
                        break;

                    c = br.read();
                    flag=false;
                }
            }
            if(flag)
            {

                c = br.read();
            }
        }
        br.close();
        System.out.println("\nThe no of statement in this program is :"+stmtcount);
    }
}
