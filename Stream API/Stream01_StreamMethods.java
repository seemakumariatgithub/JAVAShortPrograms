import java.util.Arrays;
import java.util.*;
import static java.lang.System.out;
import java.util.List;
import java.util.Optional; 
public class Stream01_StreamMethods {  
   public static void main(String[] args) {
 
    List<Integer> myList=Arrays.asList(11,21,33,14,25,6,27,51,67,99);
    out.println("Original List: "+myList);
 
    out.println("Maximum Value in list : "+myList.stream().max(Integer::compare));
    out.println("Count element in list : "+myList.stream().count());
    out.print("Sorted list :");
    myList.stream()
    .sorted()
    .forEach(n -> out.print(n+", "));
    
    out.print("\n\nFilter the even values : ");
    myList.stream()
    .filter(n -> n%2==0)
    .forEach(n-> out.print(n+ ", "));
    
    out.print("\nFilter odd value greater than 30: ");
    myList.stream()
    .filter(n -> n%2!=0)
    .filter(n -> n>30)
    .forEach(n -> out.print(n+", "));  
 
   } 
} 
