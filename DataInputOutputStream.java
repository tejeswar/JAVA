import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/28/13
 * Time: 12:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataInputOutputStream {
    public static void main(String[] a)throws Exception{
        FileOutputStream  fileOutputStream = new FileOutputStream("d://data.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(500);
        dataOutputStream.writeChar('h');
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeDouble(12.23);
        fileOutputStream.close();
        dataOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("d://data.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readDouble());
        dataInputStream.close();
        fileInputStream.close();
    }
}
