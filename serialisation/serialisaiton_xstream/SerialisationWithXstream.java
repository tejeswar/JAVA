
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/31/13
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class SerialisationWithXstream {
    public static void main(String[] args){
         XStream xStream = new XStream(new StaxDriver());
        Person person = new Person("Joi","Sahu");
        File file = new File("D:\\person.xml");


        person.setPhone(new PhoneNumber(123,"091-993"));
        person.setFax(new PhoneNumber(456,"810-333"));
         String personObject= xStream.toXML(person);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(personObject);

        Person person1 = null;
        person1 = (Person)xStream.fromXML(personObject);
        System.out.println("first name is: "+person1.getFirstname());
        System.out.println("first name is: "+person1.getLastname());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

       // System.out.println("end of main()"+personObject);
    }
}
