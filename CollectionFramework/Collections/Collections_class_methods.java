import static java.lang.System.out;
import java.util.List;
import java.util.stream.*;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Collections_class_methods {
    public static void main(String[] args) {
      List<Integer> inputList=Arrays.asList(1,1,1,2,2,3,3,3,3,3,3);
        List<Integer> newList=new ArrayList();
        newList.addAll(inputList);
    
       out.println("InputList: "+ inputList);
       out.println("newList: "+ newList);
       
       out.println("disjoint(): "+Collections.disjoint(inputList,newList));
       
       newList.removeAll(newList);
       out.println("modified newList: "+ newList);
       out.println("new disjoint(): "+Collections.disjoint(newList,inputList));
       
       
    }
}
