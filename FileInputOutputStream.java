import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/28/13
 * Time: 12:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileInputOutputStream {
    public static void main(String[] args)throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("enter the data:");
        String line = bufferedReader.readLine();
        byte[] b = line.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream("d://teju/data.txt");
        fileOutputStream.write(b);
        FileInputStream fileInputStream = new FileInputStream("d://teju/data.txt");
        int size = fileInputStream.available();
        for (int i=0;i<size;i++){
            System.out.print((char)fileInputStream.read());
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
