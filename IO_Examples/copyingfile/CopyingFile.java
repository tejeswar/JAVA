import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/28/13
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class CopyingFile {
    public static void main(String[] a)throws Exception{
        FileInputStream fileInputStream = new FileInputStream("d://teju/data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("d://duplicate.txt");
        int ch = 0;
        while ((ch = fileInputStream.read())!=-1){
            fileOutputStream.write((char)ch);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
