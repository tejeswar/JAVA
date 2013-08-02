
/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/31/13
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String firstname;
    private String lastname;
    private PhoneNumber phone;
    private PhoneNumber fax;

    public PhoneNumber getPhone() {
        return phone;
    }

    public PhoneNumber getFax() {
        return fax;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    Person(String fn,String lastname){
        firstname = fn;
        this.lastname = lastname;
    }
    public void setPhone(PhoneNumber phone){
        this.phone = phone;
    }
    public void setFax(PhoneNumber fax){
        this.fax = fax;
    }

}
