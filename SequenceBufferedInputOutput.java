import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/28/13
 * Time: 12:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceBufferedInputOutput {
    public static void main(String[] args)throws Exception{
        FileInputStream fileInputStream = new FileInputStream("d://data.txt");
        FileInputStream fileInputStream1 = new FileInputStream("d://teju/data.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream,fileInputStream1);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(sequenceInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(System.out);
        int ch=0;
        while ((ch=bufferedInputStream.read()) != -1){
            bufferedOutputStream.write((char)ch);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        sequenceInputStream.close();
        fileInputStream.close();
        fileInputStream1.close();
    }
}
