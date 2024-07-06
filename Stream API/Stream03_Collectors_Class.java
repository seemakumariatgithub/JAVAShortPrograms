import static java.lang.System.out;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.List;

public class Stream03_Collectors_Class{
    public static void main(String[] args){
        out.println("\n Sum: "+
            Stream.of(1,2,3,4,5,6,7,8,9)
                  .collect(Collectors.summingInt(a -> a))
        );
        
         out.println("\n Sum: "+
            Stream.of(1,2,3,4,5,6,7,8,9)
                  .reduce(0,(a,b) -> a+b)
        );
        
         out.println("\n Sum: "+
            Stream.of(1,2,3,4,5,6,7,8,9)
                  .collect(Collectors.counting())
        );
         out.println("\n Sum: "+
            Stream.of(1,2,3,4,5,6,7,8,9)
                  .count()
        );
        
        
    }
}
