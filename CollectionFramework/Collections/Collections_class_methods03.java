import static java.lang.System.out;
import java.util.List;
import java.util.stream.*;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Collections_class_methods03 {
 

    public static void main(String[] argv) throws Exception
    {
        
      List<Integer> inputList=Arrays.asList(1,1,1,2,2,3,3,3,3,3,3);
      out.println("InputList: "+ inputList);
        
     // Creating typesafe view of the specified list
     // and applying checkedList
      List<Integer> inputList_checkedView = Collections.checkedList(
                inputList, Integer.class);
     System.out.println("Typesafe view of List: "
                               + inputList_checkedView);
       
    }
}
