import static java.lang.System.out;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Enumeration;

public class Collections_class_methods04 {
    public static void main(String[] argv) throws Exception
    {
      List<Integer> inputList=List.of(1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3);
      out.println("InputList: "+ inputList);
     Enumeration<Integer> en= Collections.enumeration(inputList);
     System.out.println("Enumeration view of List: ");
     while(en.hasMoreElements())
        out.println(en.nextElement());
       
    }
}
