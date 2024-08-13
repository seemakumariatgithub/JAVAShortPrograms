import static java.lang.System.out;
import java.util.List;
import java.util.stream.*;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

class Collections_class_methods02 {
    public static void main(String[] args) {
      List<Integer> inputList=Arrays.asList(1,1,1,2,2,3,3,3,3,3,3);
        List<Integer> newList=List.of(5,6,7,8,9);
        List<Integer> newList2=List.copyOf(inputList);
        
       out.println("InputList: "+ inputList);
       out.println("newList: "+ newList);
       out.println("newList2: "+newList2);
       
       out.println("Binary Search in newList,8: "+Collections.binarySearch(newList,8));      
    }
}
