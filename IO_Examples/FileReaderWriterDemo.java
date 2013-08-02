import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/31/13
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileReaderWriterDemo {
    public static void main(String[] args)throws Exception{
        String info = "I am a good boy.";
        File file = new File("fread_fwrite.txt");
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0;i<info.length();i++)
            fileWriter.write(info.charAt(i));
        FileReader fileReader = new FileReader(file);
        int ch = 0;
        while ((ch = fileReader.read()) != -1){
            System.out.println((char)ch);
        }
        fileReader.close();
        fileWriter.close();

    }
}
