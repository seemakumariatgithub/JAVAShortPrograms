import java.util.Arrays;
import java.util.*;
import static java.lang.System.out;
import java.util.List;
import java.util.Optional; 
public class Stream01_StreamMethods {  
   public static void main(String[] args) {
 
    List<Integer> myList=Arrays.asList(11,21,33,14,25,6,27,51,67,99);
    out.println("Original List: "+myList);
 
    out.println("\nMaximum Value in list : "+
                myList.stream()
                .max(Integer::compare).get());
    out.println("Minimum value in list: "+
                myList.stream()
                .min(Integer::compare).get());
    out.println("\nCount element in list : "+
                myList.stream()
                .count());
    out.print("\nSorted list :"); 
    myList.stream()
    .sorted()
    .forEach(n -> out.print(n+", "));
    
    out.print("\nSorted Array :");
    Object[] myArrayList=myList.stream().sorted().toArray();
    for(Object i : myArrayList){
        out.print(i+", ");
    }
    out.print("\n\nFilter the even values : ");
    myList.stream()
    .filter(n -> n%2==0)
    .forEach(n-> out.print(n+ ", "));
    
    out.print("\nFilter odd value greater than 30: ");
    myList.stream()
    .filter(n -> n%2!=0)
    .filter(n -> n>30)
    .forEach(n -> out.print(n+", "));  
    
    out.print("\n\nAdding elements using reduce() : "+
    myList.stream()
    .reduce(0,(a,b) -> (a+b)));
 
   } 
} 
