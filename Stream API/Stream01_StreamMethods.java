import java.util.Arrays;
import java.util.*;
import static java.lang.System.out;
import java.util.List;
import java.util.Optional;
 
public class Stream01_StreamMethods { 
 
   public static void main(String[] args) { 
 
    List<Integer> myList=Arrays.asList(11,21,33,14,25,6,27);
    out.println("Original List: "+myList);
    
    Optional<Integer> maxValue=myList.stream().max(Integer::compare);
    //out.println("Maximum Value : "+maxValue);
    out.println("Find Maximum Value : "+myList.stream().max(Integer::compare));
    out.println("Count Array Element as : "+myList.stream().count());
    out.println("Sorted Array :"+
    myList.stream().forEach(System.out::println));
 
   } 
} 
