package testing;
import testing.three.Assert3Test;
public class MyProg{
public static void main(String[] args) {
        
            System.out.println("testing...");
            
            assert false : "If assertions are on, we'll see this";
Assert3Test.howdy();
        
    }
}
/*java -ea:testing... testing.MyProg  =>to enable assertion in package testing and its subpackages


java -ea:testing.three... testing.MyProg =>now assetion is enabled in testing.three package. but by default disabled in testing package


java -ea:testing... -da:testing.three.Assert3Test testing.MyProg =>to run a programme with assetion enabled in testing package but disabled in testing.three.Assert3Test class


*/