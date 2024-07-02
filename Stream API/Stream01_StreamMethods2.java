import java.util.Arrays;
import java.util.*;
import static java.lang.System.out;
import java.util.List;
import java.util.Optional; 
import java.util.stream.*;
public class Stream01_StreamMethods2 {  
   public static void main(String[] args) {
 
    List<Integer> myList=Arrays.asList(11,21,33,21,21,25,14,25,6,27,51,67,99);
    out.println("Original List: "+myList);
    out.print("\nDistinct elements of list: ");
    myList.stream()
    .distinct()
    .forEach(n -> out.print(n+","));
    
    out.print("\nDistinct elements of list: ");
    myList.stream()
    .distinct()
    .limit(5)
    .forEach(n -> out.print(n+","));
    
    
    out.print("\nGenerate random stream: ");
    Stream.generate(new Random()::nextInt)
    .limit(4)
    .forEach(n-> out.print(n+", "));
    
    out.print("\nStream created by of(): ");
    Stream.of(3)
    .forEach(n->out.print(n+","));
    
    out.print("\nSum of element of stream created by of(): ");
    out.print(Stream.of(11, 21, 33, 21, 21, 25, 14)
    .reduce(0, (a,b) -> (a+b)));
    //.forEach(n->out.print(n+","));
  
    
    
   } 
} 
