import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/27/13
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class SerializationInHas_A_Relation {
    public static void main(String[] args)throws Exception{
        Car car = new Car();
        System.out.println("Begining of serialisation");
        FileOutputStream fos = new FileOutputStream("info.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(car);
        System.out.println("Serialisation ends here");
        FileInputStream fileInputStream = new FileInputStream("info.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println("Deserialisation begins");
        Car car1 = (Car)objectInputStream.readObject();
        System.out.println("part name is: "+car1.engine.part.name);
        System.out.println("part size is: "+car1.engine.part.size);

    }
}
