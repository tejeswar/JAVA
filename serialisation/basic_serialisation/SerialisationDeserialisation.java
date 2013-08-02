/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/27/13
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
public class SerialisationDeserialisation {


        public static void main(String args[])throws Exception{
            Employee e1=new Employee();
            System.out.println("Serialization of Employee information starts:");
            FileOutputStream fos=new FileOutputStream("employee.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(e1);
            System.out.println("Serialization ends here");
            System.out.println("Deserialization of Employee information starts");
            FileInputStream fis=new FileInputStream("employee.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Employee e2=(Employee)ois.readObject();
            System.out.println("Deserialization ends here");
            System.out.println(e2.id+"................"+e2.sal);
        }
 }

