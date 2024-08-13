import static java.lang.System.out;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Collections_class_methods06 {
    public static void main(String... argv) throws Exception
    {
     
      List<Integer> inputList2=Arrays.asList(1,2,4,7,7,3);
      out.println("InputList2 (before): "+ inputList2);
      Collections.rotate(inputList2,2);
      out.println("InputList2 (after rotate): "+ inputList2);
      
      Collections.shuffle(inputList2);
      out.println("InputList2 (after shuffle): "+ inputList2);
      
      Collections.sort(inputList2);
      out.println("InputList2 (after sort): "+ inputList2);
      
      
      Collections.swap(inputList2,2,5);
      out.println("InputList2 (after swap): "+ inputList2);
      
    }
}
