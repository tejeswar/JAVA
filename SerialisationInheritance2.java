import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/28/13
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class SerialisationInheritance2 {
    public static void main(String[] args)throws Exception{
        Cat2 d1=new Cat2();
        d1.i=888;
        d1.j=999;
        FileOutputStream fos=new FileOutputStream("serialinher2.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println("Deserialization started");
        FileInputStream fis=new FileInputStream("serialinher2.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cat2 d2=(Cat2)ois.readObject();
        System.out.println(d2.i+"........."+d2.j);
    }
}
