

 import java.io.BufferedReader;
 import java.io.ByteArrayInputStream;
 import java.io.ByteArrayOutputStream;
 import java.io.InputStreamReader;

 /**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/27/13
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */

public class ArrayInputOutputStream {
    public static void main(String[] args)throws Exception{
        InputStreamReader   inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("enter the data:");
        String line = bufferedReader.readLine();
        byte[] b = line.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b);
        System.out.println("reading data from buffer");
        byte[] b1 = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b1);
        int ch = 0;
        while ((ch=byteArrayInputStream.read()) != -1){
            System.out.print((char)ch);
        }
        byteArrayInputStream.close();
        byteArrayOutputStream.close();

    }
}
