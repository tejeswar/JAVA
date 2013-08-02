/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 8/1/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionDemo {
    public static void main(String[] a){
        try {
        int num = 1/0;
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        try {
        String s = null;
        s.length();
        } catch (NullPointerException ne){
                ne.printStackTrace();
            }
        try {
        int[] age =new int[2];
        age[0] = 5;
        age[1] = 10;
        System.out.println(age[2]);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
                  aiob.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
