import static java.lang.System.out;
import java.util.stream.*;

public class Stream02_map01 {  
   public static void main(String[] args) {
 
    out.print("\nSum of element of stream created by of(): ");
    out.print(Stream.of(1,4)
    .map(a->Math.sqrt(a))
    .reduce(1.0,(a,b) -> (a*b)));
   } 
} 
