import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/28/13
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class SerialisationInheritance1 {
    public static void main(String[] args)throws Exception{
        Cat d1=new Cat();
        System.out.println(d1.i+"........"+d1.k);
        FileOutputStream fos=new FileOutputStream("serialisation.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        FileInputStream fis=new FileInputStream("serialisation.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cat d2=(Cat)ois.readObject();
        System.out.println(d2.i+"........"+d2.k);
    }
}
