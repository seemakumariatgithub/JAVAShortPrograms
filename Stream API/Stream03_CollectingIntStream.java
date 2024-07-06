import static java.lang.System.out;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.List;

public class Stream03_CollectingIntStream{
    public static void main(String[] args){
        
       List<Integer> myNewIntList= 
       Stream.of(1,2,3,4,5,6,7,8,9)
        .filter(a -> a%2==0)
        .collect(Collectors.toList());
        
        for(Integer myInt: myNewIntList)
            out.print(myInt+", ");
            
        Integer mySumOfStream= 
        Stream.of(1,2,3,4,5,6,7,8,9)
        .reduce(0,(a,b) -> a+b);
        out.println("\n"+mySumOfStream);
    }
}
