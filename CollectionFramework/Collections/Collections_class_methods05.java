import static java.lang.System.out;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.Enumeration;

public class Collections_class_methods05 {
    public static void main(String... argv) throws Exception
    {
      List<Integer> inputList=Arrays.asList(1,2,4,7,7,3);
      out.println("InputList(before): "+ inputList);
      Collections.fill(inputList,5);
      out.println("InputList (after): "+ inputList);
      List<String> ncp=Collections.nCopies(4,"hi");
      out.println(ncp);
      out.println(Collections.replaceAll(inputList,7,2));
      out.println(Collections.replaceAll(inputList,5,2));
      out.println("InputList (after): "+ inputList);
      List<Integer> inputList2=Arrays.asList(1,2,4,7,7,3);
      out.println("InputList2 (before): "+ inputList2);
      Collections.reverse(inputList2);
      out.println("InputList2 (after): "+ inputList2);
    }
}
